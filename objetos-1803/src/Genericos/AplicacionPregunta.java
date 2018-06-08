/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

import java.util.*;

/**
 *
 * @author T-101
 */
public class AplicacionPregunta {

    public static void main(String[] args) {
        //Primero generamos las opciones porque es lo mas general
        //Generamos cada una de las opciones 
        //"o[numero de opcion][numero de pregunta]"
        Opcion o11 = new Opcion();
        o11.setTitulo("Mizcalco");
        o11.setCorrecta(false);

        Opcion o21 = new Opcion();
        o21.setTitulo("Texcoco");
        o21.setCorrecta(false);

        Opcion o31 = new Opcion();
        o31.setTitulo("Madrid");
        o31.setCorrecta(true);

        Opcion o41 = new Opcion();
        o41.setTitulo("Ecatepec");
        o41.setCorrecta(false);
        //Ahora generamos la pregunta
        //p[numero de pregunta][numero de cuestionario]
        Pregunta p11 = new Pregunta();
        p11.setTitulo("¿Cual es la capital de España?");
        //Antes generamos el ArrayList con las opciones de arriba
        ArrayList<Opcion> opcionesp11 = new ArrayList<>();
        //Ahora vamos a agragas las opciones al ArrayList
        opcionesp11.add(o11);
        opcionesp11.add(o21);
        opcionesp11.add(o31);
        opcionesp11.add(o41);
        //Ahora este ArrayList lo agregamos a la primera pregunta
        p11.setOpciones(opcionesp11);
        
        //Vamos a crear el cuestionario
        
        Cuestionario c1=new Cuestionario();
        ArrayList<Pregunta> preguntas=new ArrayList<>();
        preguntas.add(p11);
        c1.setPreguntas(preguntas);
        
        
        //Vamos a mostrar la pregunta
        for(Pregunta p:preguntas){
            System.out.println(p.getTitulo());
        }
    }
}
