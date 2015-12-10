package com.example.yo.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {
    EditText edtuser, edtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        edtuser = (EditText)findViewById(R.id.edtUser);
        edtpass = (EditText)findViewById(R.id.edtPass);

    }

    public void addUser(View view){
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        Bundle b = new Bundle();

        String user = edtuser.getText().toString();
        String pass = edtpass.getText().toString();


        b.putString("user",user);
        b.putString("pass",pass);

        i.putExtras(b);

        startActivity(i);

    }

    public void limpar(View view) {
        edtuser.setText("");
        edtpass.setText("");
    }
}
