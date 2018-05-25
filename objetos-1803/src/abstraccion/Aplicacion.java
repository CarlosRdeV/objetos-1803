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
        
        Longitudes l = new Longitudes();
        
        l.setMetros(1);
        c.setLongitudes(l);
        
        
        System.out.println(c.metrosAPies());
        
        
        //Herencia y Polimorfismo de Centrigrados a Fahrenheir
        Grados g1 = new Grados();
        
        g1.setCentrigrados(20);
        
        ConversionCentigradosFahrenheir c1 = new ConversionCentigradosFahrenheir();
        c1.setGrados(g1);
        System.out.println(c1.convertir());
        
        //Herencia y Polimorfismo de Fahrenheit a Centrigrados
        Grados g2 = new Grados();
        
        g2.setFahrenheit(1);
        
        ConversionFahrenheitCentigrados c2 = new ConversionFahrenheitCentigrados();
        c2.setGrados(g2);
        System.out.println(c2.convertir());
        
        //Herencia y Polimorfismo de Metros a Pies
        Longitudes g3 = new Longitudes();
        
        g3.setMetros(1);
        
        ConversionMetrosPies c3 = new ConversionMetrosPies();
        c3.setLongitudes(g3);
        System.out.println(c3.convertir());
        
        //Herencia y Polimorfismo de Pies a Metros
        Longitudes g4 = new Longitudes();
        
        g4.setPies(1);
        
        ConversionPiesMetros c4 = new ConversionPiesMetros();
        c4.setLongitudes(g4);
        System.out.println(c4.convertir());
    }

}
