package figuras;

public class ValidarNumero {
    //throws = se puede lanzar , 3ra persona con la condicion
    //throw= lanzate
    //ponemos throws y el nombre de la excepcion que creamos
    public static void validarNoNegativo(float valor) throws ValorNegativoException{
    if(valor<0)throw new ValorNegativoException();
    }
    
}
