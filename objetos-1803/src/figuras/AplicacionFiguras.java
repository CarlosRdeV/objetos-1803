
package figuras;

import java.util.logging.Level;
import java.util.logging.Logger;


public class AplicacionFiguras {
    public static void main(String[] args) {
        
        try {
            //Primero creamos un objeto del tipo cuadrado
            Cuadrado c=new Cuadrado();
            
            //ajustamos el valor de lado
            ValidarNumero.validarNoNegativo(4);
            c.setLado(4);
            //generamos un objeto del tipo calculos
            Calculos cal=new Calculos();
            System.out.println(cal.calcularArea(c));
            System.out.println(cal.calcularPerimetro(c));
            
        } catch (ValorNegativoException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
    }
}
