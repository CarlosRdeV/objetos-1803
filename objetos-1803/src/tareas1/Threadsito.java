
package tareas1;


public class Threadsito extends Thread{

    public void run(){
        System.out.println("Soy un thread y me llamo "+Thread.currentThread().getName());
    }
}
