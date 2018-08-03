
package ETE2;

import java.util.*;
public class ProbarCliente {
   
    public static void main(String[] args) {
        
     for(Cliente c:new GeneradorTarjeta().getClientes()){
          System.out.println(c);
      }
        
    }
    }
