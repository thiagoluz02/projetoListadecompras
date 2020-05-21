package com.example.listadecompras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.listadecompras.DAO.Questionario;

public class Activity_responder extends AppCompatActivity {
    Questionario q = null;
    private TextView tvpergunta;
    private TextView tvpergunta2;
    private CheckBox ch_pergunta1;
    private CheckBox ch_pergunta2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responder);
        Questionario q= (Questionario)getIntent().getSerializableExtra("quest");
        tvpergunta =(TextView)findViewById(R.id.tv_pergunta1);
        tvpergunta .setText(q.getPergunta1());
        tvpergunta2 = (TextView)findViewById(R.id.tv_pergunta2);
        tvpergunta2.setText(q.getPergunta2());
    }
}
