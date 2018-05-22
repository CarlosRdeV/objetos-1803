/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-101
 */
public class Conversion {
    /*Esta es una clase modelo, aqui lleva la logica*/
    private Grados grados;
    
    public float centrigadosAFahrenheit(){
        //Este metodo tiene logica
        //Todo lo declarado dentro de un metodo solo se puede usar en el metodo
        float resultado= grados.getCentrigrados()*1.8F+32;
         return resultado;
    }

    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }
}
