
package ETE;


public class Tarjeta {
    private int numero;
    private String nombre;
    private Float saldo;

    @Override
    public String toString() {
        return "Tarjeta{" + "numero=" + numero + ", nombre=" + nombre + ", saldo=" + saldo + '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Tarjeta() {
    }

    public Tarjeta(int numero, String nombre, Float saldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public Tarjeta(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }
    
    
}
