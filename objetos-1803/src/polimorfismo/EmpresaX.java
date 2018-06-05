/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

//Esta es una clase aplicacion
public class EmpresaX {
    public static void main(String[] args) {
        //Vamos a generar 2 objetos de plata, 3 de horarios y 1 de proyecto.
        Planta p1=new Planta();
        Planta p2=new Planta();
        
        Honorarios h1=new Honorarios();
        Honorarios h2=new Honorarios();
        Honorarios h3=new Honorarios();
        
        Proyecto pro1=new Proyecto();
        
        //Vamos a generar un arreglo de tipo trabajador
        
        Trabajador []trabajadores={p1,p2,h1,h2,h3,pro1}; //Esto es polimorfismo
        //El arreglo trabajador es polimorfico, estamos metiendo objetos
        //de diferentes clases HIJAS de trabajador
        
        //Vamos a hacer la iteracion, suponemos que vamos a iterar objetos de un
        //tipo superior
        
        for(Trabajador t:trabajadores){
            t.pagar();
        }
        }
    }

