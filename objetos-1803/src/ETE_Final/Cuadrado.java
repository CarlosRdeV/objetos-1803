/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ETE_Final;

/**
 *
 * @author T-101
 */
public class Cuadrado extends Figura {

    private float lado;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    @Override
    public void Perimetro() {
        lado = getLado();
        System.out.println("El perimetro del cuadrado es: " + 4 * lado);
    }

    @Override
    public void Area() {
        lado = getLado();
        System.out.println("El Area del cuadrado es: " + lado * lado);
    }

}
