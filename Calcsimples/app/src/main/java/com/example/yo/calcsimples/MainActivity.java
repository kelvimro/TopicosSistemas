package com.example.yo.calcsimples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    static TextView result;
    static EditText valor1;
    static EditText valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.tvResult);
        valor1 = (EditText)findViewById(R.id.edtValor1);
        valor2 = (EditText)findViewById(R.id.edtValor2);

    }
    private boolean verifica(String v1, String v2){
                if(v1.isEmpty() || v2.isEmpty()){
                    result.setText("Campo em branco!");
                    return false;
                }else{
                    return true;
                }
    }

    public void soma(View view) {
        if(verifica(valor1.getText().toString(),valor2.getText().toString()))result.setText(""+(Double.parseDouble(valor1.getText().toString())+Double.parseDouble(valor2.getText().toString())));
    }

    public void menos(View view) {
        if(verifica(valor1.getText().toString(),valor2.getText().toString()))result.setText(""+(Double.parseDouble(valor1.getText().toString()) - Double.parseDouble(valor2.getText().toString())));
    }

    public void multiplica(View view) {
        if(verifica(valor1.getText().toString(),valor2.getText().toString()))result.setText(""+(Double.parseDouble(valor1.getText().toString())*Double.parseDouble(valor2.getText().toString())));
    }

    public void divide(View view) {
        if(verifica(valor1.getText().toString(),valor2.getText().toString()))result.setText(""+(Double.parseDouble(valor1.getText().toString())/Double.parseDouble(valor2.getText().toString())));
    }
}
