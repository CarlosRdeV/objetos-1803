
package serializar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class PersistenciaUsuario {
    
    //Primero guardamos
    public static void guardar(Cliente c) throws Exception{
    //static: cuando declaramos algo static significa que al ejecutar el programa 
    //lo primero que va a ejecutar es todo lo que tiene static por ejemplo el psvm
    //lo estatico tambien es compartido entre clases
    //Exception es un error en tiempo de ejecucion
    
    //paso 1: Generar el archivo donde se va a guardar nuestro seializado
    File file=new File("D:\\archivaldo.yomero");
    
    //paso 2:Indicar que lo vamos a generar para escribir en el
    FileOutputStream fos=new FileOutputStream(file);
    
    //paso 3:Escribir un objeto en el
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(c);
    oos.close();
    }
    
    
}
