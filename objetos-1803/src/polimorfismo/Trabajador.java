/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author T-101
 */
//Como esta clase es de referencia y no queremos que se creen objetos a partir
//de esta, se convierte en una clase abstracta y no nos deja crear objetos de
//esta clase, tenemos que heredar obligatoriamente
public abstract class Trabajador {
    private int seguro;
    private String nombre;
    private float sueldoBase;
 //El metodo no tiene cuerpo, por lo tanto no lleva llaves, ya que nunca lo
 //vamos a ejecutar directamente.
 //No tiene cuerpo porque no sabemos que va a contener porque es general.
    
    public abstract void pagar();


    public int getSeguro() {
        return seguro;
    }

    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
}
