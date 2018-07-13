
package threads2;

import java.time.LocalTime;

public class Aplicacion implements Runnable{
    
    public static void main(String[] args) {
    
        Runnable r=new Aplicacion();
        Thread t1=new Thread(r);
        t1.start();
    }
    
    
    public void run(){ 
        System.out.println("Un thread creado de la segunda forma");
        while (true) {            
            
        
          
        LocalTime tiempo=LocalTime.now();
        int hora=tiempo.getHour();
        int minuto=tiempo.getMinute();
        int segundo=tiempo.getSecond();
        System.out.println("La hora es: "+hora+":"+minuto+":"+segundo);
        
         try{
            //E4
        Thread.sleep(1000);
        }catch(InterruptedException e){
        
        }
        
        }
        
        
        
    }
            

}
