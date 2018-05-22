/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

public class Aplicacion {

    public static void main(String[] args) {
        //Crear un objeto del tipo grados
        Grados g = new Grados();
        //A este objeto le asignamos un valor a su atributo centigrados
        g.setCentrigrados(20);

        //Creamos un objeto de la clase conversion
        Conversion c = new Conversion();
        c.setGrados(g);
        //Aplicamos el modelo (metodo)
        //c.centrigadosAFahrenheit();

        //Mandamos a mostrar en pantalla el resultado
        System.out.println(c.centrigadosAFahrenheit());

    }

}
