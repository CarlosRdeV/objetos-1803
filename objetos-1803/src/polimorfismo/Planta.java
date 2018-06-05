
package polimorfismo;

//Como queremos crear objetos a partir de esta clase, necesitamos hacerla
//Concreta y darle cuerpo a los metodos previamente definidos como abstractos
public class Planta extends Trabajador{

    @Override
    public void pagar() {
        System.out.println("SE VA A PAGAR A ESTE TRABAJADOR DE PLANTA");
    }
}
    
