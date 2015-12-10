package com.example.yo.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtUser, edtPass;
    TextView tvNews;
    static int cont = 0;
    static User[] cadastros = new User[10];






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser = (EditText)findViewById(R.id.edtUser);
        edtPass = (EditText)findViewById(R.id.edtPass);
        tvNews = (TextView)findViewById(R.id.tvNews);

        Intent i = getIntent();
        Bundle b = i.getExtras();

        tvNews.setText(getResources().getText(R.string.usuarios)+" "+cont);

        if(b != null) {
            String u = b.getString("user");
            String p = b.getString("pass");
            cadastros[cont] = new User();
            cadastros[cont].setUser(u);
            cadastros[cont].setPass(p);
            tvNews.setText(getResources().getText(R.string.cadastradook));
            cont++;
        }

    }

    public void login(View view){
        String user = edtUser.getText().toString();

        if(cont>0){
            if(senhacheck()){
                Intent i = new Intent(getBaseContext(), HomeActivity.class);
                Bundle b = new Bundle();
                b.putString("user",user);
                i.putExtras(b);
                startActivity(i);
            }
        }else{
            tvNews.setText(getResources().getText(R.string.errosenha));
        }
    }

    private boolean senhacheck(){
        for (int i = 0 ; i < cont; i++){
            if(cadastros[i].getUser().equals(edtUser.getText().toString()) && cadastros[i].getPass().equals(edtPass.getText().toString())){
                return true;
            }
        }
        tvNews.setText(getResources().getText(R.string.errosenha));
        return false;
    }

    public void cadastrar(View view) {
        Intent i = new Intent(getBaseContext(), CadastroActivity.class);
        startActivity(i);

    }
}
