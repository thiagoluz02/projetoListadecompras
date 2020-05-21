package com.example.listadecompras.DAO;

import android.support.annotation.NonNull;

public class Questionario {
    private String key;
    private String nomequestionario;
    private String pergunta1;
    private String pergunta2;
    public Questionario(String Key,String nomequestionario){
        this.key = key;
        this.nomequestionario = nomequestionario;

    }
    public Questionario(){

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNomequestionario() {
        return nomequestionario;
    }

    public void setNomequestionario(String nomequestionario) {
        this.nomequestionario = nomequestionario;
    }

    public String getPergunta1() {
        return pergunta1;
    }

    public void setPergunta1(String pergunta1) {
        this.pergunta1 = pergunta1;
    }

    public String getPergunta2() {
        return pergunta2;
    }

    public void setPergunta2(String pergunta2) {
        this.pergunta2 = pergunta2;
    }

    @NonNull
    @Override
    public String toString() {
        return "Questionario:"+"\n nomequestionario =" + nomequestionario;
    }
}
