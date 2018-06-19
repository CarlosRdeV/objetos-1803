
package serializar;
import java.io.*;
//io = input/output :)

public class Cliente implements Serializable{
    private String nombre;
    private int edad;
    private float sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public Cliente() {
        //Constructor por defecto
    }
    
    
    
}
