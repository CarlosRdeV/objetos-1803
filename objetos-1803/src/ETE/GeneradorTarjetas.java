package ETE;

import java.util.*;
public class GeneradorTarjetas {
    private ArrayList<Cliente> clientes;

    public GeneradorTarjetas() {
        this.clientes = new ArrayList<>();
        
        Tarjeta t1 = new Tarjeta(1234, "banamex", 32000F);
        Cliente c1 = new Cliente("Juan", t1);
        
         Tarjeta t2 = new Tarjeta(5678, "hsbc", 17500F);
        Cliente c2 = new Cliente("Ana", t2);
        
         Tarjeta t3 = new Tarjeta(8765, "scotian", 19600F);
        Cliente c3 = new Cliente("Juan", t3);
        
         Tarjeta t4 = new Tarjeta(4321, "bancomer", 48000F);
        Cliente c4 = new Cliente("Irma", t4);
        
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }    
}
