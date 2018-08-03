package ETE2;

import java.util.*;

public class GeneradorTarjeta {
    
    private ArrayList<Cliente> clientes;

    
    public GeneradorTarjeta() {
        
        this.clientes = new ArrayList<>();
         
        Tarjeta t1=new Tarjeta(1234, "Banamex", 32000F);
        Cliente c1=new Cliente("Juan", t1);
        
         Tarjeta t2=new Tarjeta(5678, "HSBC", 17500F);
        Cliente c2=new Cliente("Ana", t2);
        
         Tarjeta t3=new Tarjeta(8765, "Scotian", 19600F);
        Cliente c3=new Cliente("Pedro", t3);
        
         Tarjeta t4=new Tarjeta(4321, "Bancomer", 48000F);
        Cliente c4=new Cliente("Irma", t4);
        
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

    @Override
    public String toString() {
        return "GeneradorTarjeta{" + "clientes=" + clientes + '}';
    }
    

    
}
