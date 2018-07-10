
package tareas1;

import java.time.LocalTime;


public class Relojito extends Thread{
    
    public void run(){
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
