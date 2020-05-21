package com.example.listadecompras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.listadecompras.DAO.Questionario;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listaquestionario;
    private ArrayAdapter<Questionario>adapter;
    private ArrayAdapter<Questionario>questoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //  toolbar toolbar = (toolbar)finishActivity(toolbar);
       //setSupportActionBar(toolbar);
        listaquestionario = (ListView) findViewById(R.id.lista_quetionario);

       questoes = new ArrayList<>();
        adapter=new ArrayAdapter<Questionario>(
                MainActivity.this, android.R.layout.simple_list_item_1,questoes);
              //MainActivity.this,android.R.layout.simple_list_item_1,
               // questoes);

       listaquestionario.setAdapter(adapter);
        );
    }/*       questoes = new ArrayList<>();
        adapter=new ArrayAdapter<Questionario>(
                MainActivity.this, android.R.layout.simple_list_item_1,questoes);*/

    public void abrircirarchecklis(View view) {
        Intent abrir = new Intent(MainActivity.this,CriarNovoChecklistActivity.class);
        startActivity(abrir);
    }
}
