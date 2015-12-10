package com.example.yo.rest;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    List<Map<String, String>> listlanches = new ArrayList<Map<String, String>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        gerarLanches();

        ListView lv = (ListView) findViewById(R.id.lvlanches);
        SimpleAdapter simpleadp = new SimpleAdapter(this, listlanches, android.R.layout.simple_list_item_1, new String[]{"lanche"}, new int[]{android.R.id.text1});
        lv.setAdapter(simpleadp);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parentAdapter, View view, int position, long id) {
                TextView clickedView = (TextView) view;

                Toast.makeText(MainActivity.this, "Item with id ["+id+"] - Position [" + position + "] - Lanche[" + clickedView.getText() + "]", Toast.LENGTH_SHORT).show();
            }

        });
    }

        private void gerarLanches() {
        listlanches.add(criarlanche("lanche", "X-Salada"));
        listlanches.add(criarlanche("lanche", "X-Bacon"));
        listlanches.add(criarlanche("lanche", "X-Calabresa"));
        listlanches.add(criarlanche("lanche", "X-Picanha"));

    }


    private HashMap<String, String> criarlanche(String n, String i) {
        HashMap<String, String> lanche = new HashMap<String, String>();
        lanche.put(n, i);
        return lanche;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar wills
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

