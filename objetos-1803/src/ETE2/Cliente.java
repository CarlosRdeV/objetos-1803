
package ETE2;


public class Cliente {
    
    private String nombre;
    private Tarjeta tarjeta;

    public Cliente() {
    }

    public Cliente(String nombre, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", tarjeta=" + tarjeta + '}';
    }
    
    
    
}
