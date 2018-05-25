/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author Oldspice
 */
public class ConversionMetrosPies extends Conversion{
    @Override
        public float convertir(){
        //float resultado= grados.getCentrigrados()*1.8F+32;
        float resultado=longitudes.getMetros()*3.28F;
         return resultado;
        }
}
