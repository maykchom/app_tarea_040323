package com.example.clase180223.clases;

import java.util.ArrayList;

public class Preguntas {
    int  id;
    String DescripcionPreguntas;
    ArrayList<Respuestas> respuestas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcionPreguntas() {
        return DescripcionPreguntas;
    }

    public void setDescripcionPreguntas(String descripcionPreguntas) {
        DescripcionPreguntas = descripcionPreguntas;
    }

    public ArrayList<Respuestas> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<Respuestas> respuestas) {
        this.respuestas = respuestas;
    }
}
