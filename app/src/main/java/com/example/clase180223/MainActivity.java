package com.example.clase180223;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.clase180223.clases.Cuestionario;
import com.example.clase180223.clases.Preguntas;
import com.example.clase180223.clases.Respuestas;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Preguntas>listaPreguntas= new ArrayList<Preguntas>();
    Preguntas pregunta1 = new Preguntas();
    Cuestionario cuestionario1 = new Cuestionario();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pregunta1.setId(1);
        pregunta1.setDescripcionPreguntas("¿Capital de Guatemala?");

        ArrayList<Respuestas> listaRespuestas = new ArrayList<Respuestas>();

        Respuestas respuestaIndividual1 = new Respuestas();
        respuestaIndividual1.setId(1);
        respuestaIndividual1.setRespuesta("Sololá");
        respuestaIndividual1.setValor(0);
        respuestaIndividual1.setEsCorrecta(0);

        Respuestas respuestaIndividual2 = new Respuestas();
        respuestaIndividual2.setId(2);
        respuestaIndividual2.setRespuesta("Guatemala");
        respuestaIndividual2.setValor(100);
        respuestaIndividual2.setEsCorrecta(1);

        Respuestas respuestaIndividual3 = new Respuestas();
        respuestaIndividual3.setId(3);
        respuestaIndividual3.setRespuesta("Izabal");
        respuestaIndividual3.setValor(0);
        respuestaIndividual3.setEsCorrecta(0);


        listaRespuestas.add(respuestaIndividual1);
        listaRespuestas.add(respuestaIndividual2);
        listaRespuestas.add(respuestaIndividual3);
        pregunta1.setRespuestas(listaRespuestas);
        listaPreguntas.add(pregunta1);
        cuestionario1.setId(1);
        cuestionario1.setPreguntas(listaPreguntas);

        int a =0;

    }
}