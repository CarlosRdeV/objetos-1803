
package figuras;

//las clases de excepcion no deben llevar logica, solo el mensaje
public class ValorNegativoException extends Exception{
    //Creamos el  constructor de defecto
    public ValorNegativoException(){
    //Mandamos a llamar el constructor de defecto de la clase Exception
    //para eso usamos la palabra "super" y despues los valores 
    super("No se permiten valores negativos!");
    }
}
