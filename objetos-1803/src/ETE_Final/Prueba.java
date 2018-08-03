/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ETE_Final;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class Prueba {

    public static void main(String[] args) {
        
        //CIRCULO
        Circulo c = new Circulo(1);
      /*  c.Perimetro();
        c.Area();
        */
      
        //Triangulo
        Triangulo t = new Triangulo(2, 3);
       /* t.Perimetro();
        t.Area();
*/
       //Cuadrado
       Cuadrado cua = new Cuadrado(2);
       /*cua.Perimetro();
       cua.Area();*/
       
        ArrayList<Figura> figuras1 = new ArrayList<>();
        figuras1.add(c);
        figuras1.add(t);
        figuras1.add(cua);
        
        for (Figura f : figuras1) {
            f.Area();
            f.Perimetro();
        }

    }

}
