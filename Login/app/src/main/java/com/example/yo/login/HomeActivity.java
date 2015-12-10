package com.example.yo.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView tvWellvome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent i = getIntent();
        String user = i.getStringExtra("user");

        tvWellvome = (TextView)findViewById(R.id.tvWellcome);
        tvWellvome.setText(getResources().getText(R.string.bemvindo)+" "+user);

    }

public void desconctar(View view){
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
    }
}
