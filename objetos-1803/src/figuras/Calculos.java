
package figuras;


public class Calculos {
  
    public String calcularArea(Cuadrado c){
    float area=c.getLado()*c.getLado();
    return "El area es "+area;
    }
public String calcularPerimetro (Cuadrado c){
    float perimetro=c.getLado()*4;
    return "El perimetro es "+perimetro;
}
  //HASTA AQUI TENEMOS HECHO EL MODELO, NOS FALTA AGREGAR LA VALIDACION


}
