/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

/**
 *
 * @author T-101
 */
public class AplicacionPregunta {
    
    public static void main(String[] args) {
    //Primero generamos las opciones porque es lo mas general
    Opcion o11=new Opcion();
        o11.setTitulo("Mizcalco");
        o11.setCorrecta(false);
    
    Opcion o21=new Opcion();
        o21.setTitulo("Texcoco");
        o21.setCorrecta(false);
        
    Opcion o31=new Opcion();
        o31.setTitulo("Madrid");
        o31.setCorrecta(true);
        
    Opcion o41=new Opcion();
        o41.setTitulo("Ecatepec");
        o41.setCorrecta(false);
    }
}
