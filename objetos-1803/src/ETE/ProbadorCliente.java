
package ETE;
import java.util.*;

public class ProbadorCliente {
    


    public static void main(String[] args) {
 
    
      
  
        
     for(Cliente c:new GeneradorTarjetas().getClientes()){
          System.out.println(c);
      }
     
         }
 
}
