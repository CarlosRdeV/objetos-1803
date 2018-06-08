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
        
        
        /*Vamos a mostrar la pregunta
        **for(Pregunta p:preguntas){
        **    System.out.println(p.getTitulo());
        **    for(Opcion o:p.getOpciones())
        **        System.out.println(o.getTitulo()+" "+o.isCorrecta());
        **}
        */
        
      //Vamos a crear otra pregunta
      //Comenzamos volviendo a crear las opciones porque es el mas general
      
      Opcion o12=new Opcion();
      o12.setTitulo("Verdadero");
      o12.setCorrecta(true);
      
      Opcion o22=new Opcion();
      o22.setTitulo("Falso");
      o22.setCorrecta(false);
      
      //Ahora generamos la pregunta
      Pregunta p21 = new Pregunta();
      p21.setTitulo("Selecciona la opcion 'verdadero'");
      
      ArrayList<Opcion> opcionesp21 = new ArrayList<>();
      opcionesp21.add(o12);
      opcionesp21.add(o22);
      
      p21.setOpciones(opcionesp21);
      
      Cuestionario c2=new Cuestionario();
      ArrayList<Pregunta> preguntas1=new ArrayList<>();
      preguntas.add(p21);
      c2.setPreguntas(preguntas1);
      
     //Vamos a mostrar la pregunta
        for(Pregunta p:preguntas){
            System.out.println(p.getTitulo());
            for(Opcion o:p.getOpciones())
                System.out.println(o.getTitulo()+" "+o.isCorrecta());
        }
      
    }
}
