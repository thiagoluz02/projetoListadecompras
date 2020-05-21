package com.example.listadecompras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.listadecompras.DAO.Questionario;

import java.util.ArrayList;

public class CriarNovoChecklistActivity extends AppCompatActivity {
//Widgets
    private Button btnCadastrar;
    private ListView lvClientes;
    private EditText Nome_questionario;
    private Button btn_cadaquestionario;
    private android.app.AlertDialog.Builder lvQuestionario;
    private Button bt_Criarchecklist;
    private ListView lisquestionario;

    //ArrayList + ArrayAdapter
    private ArrayList<Questionario> questoes; //Questionario
    private ArrayAdapter<Questionario> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_novo_checklist);
    }

    public void abrircirarchecklis(View view) {
    }

    public void cadaquestio(View view) {
    }
}
