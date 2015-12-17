package com.example.yo.rest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LancheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanche);

        Intent i = getIntent();
        Lanche l = (Lanche)i.getSerializableExtra("lanche");

        TextView nome = (TextView) findViewById(R.id.tvNomelanche);
        TextView ingredientes = (TextView) findViewById(R.id.tvIngredientes);
        TextView valor = (TextView) findViewById(R.id.tvValor);

        nome.setText(l.getNome());
        ingredientes.setText(l.getIngredientes());
        valor.setText(""+l.getValor());


    }
}
