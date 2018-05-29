/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdatos;

/**
 * 28/05 Clase 5 Tipos de datos 
 * Primitivos: Con un solo valor quedan determinados 
 * Referenciados: Contienen un conjuntos de datos, comienzan con
 * mayusculas porque hacen "referencia" a clases. Por ejemplo un String es un
 * conjunto de primitivos, referenciado a la clase String
 *
 * Primitivos Integrales-->byte,short,int,long (de menor a mayor) 
 * Flotantes--->Float y double
 */
public class Tipos1 {

    //psvm
    public static void main(String[] args) {
        byte b = 2;
        short s = 2;
        int i = 2;
        long l = 2;
        b = (byte) s;
        s = b;
        i = b;
        l = i;
        b = (byte) l;
        s = (byte) i;
        float f=4;
        
        String malo="4";
        int bueno=  Integer.parseInt(malo);
    }
}
