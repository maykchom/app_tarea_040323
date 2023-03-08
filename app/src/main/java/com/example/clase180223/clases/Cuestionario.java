package com.example.clase180223.clases;

import java.util.ArrayList;

public class Cuestionario {
    int id;
    ArrayList<Preguntas> preguntas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Preguntas> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Preguntas> preguntas) {
        this.preguntas = preguntas;
    }
}
