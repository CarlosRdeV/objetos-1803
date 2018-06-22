package serializar;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersistenciaUsuario  {

    //Primero guardamos
    public static void guardar(Cliente c) throws Exception {
        //static: cuando declaramos algo static significa que al ejecutar el programa 
        //lo primero que va a ejecutar es todo lo que tiene static por ejemplo el psvm
        //lo estatico tambien es compartido entre clases
        //Exception es un error en tiempo de ejecucion

        //paso 1: Generar el archivo donde se va a guardar nuestro seializado}
        ArrayList<Cliente> clientes = new ArrayList<>();
        File file = new File("archivaldo.yomero");
        if(file.exists())clientes= leer();
        clientes.add(c);
        //paso 2:Indicar que lo vamos a generar para escribir en el
        FileOutputStream fos = new FileOutputStream(file);
        //paso 3:Escribir un objeto en el
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(clientes);        
        oos.close();
    }

    //Ahora vamos a leer el archivo que previamente creamos, como vamos a regresar un objeto del tipo cliente,
    //en lugar de void sera Cliente
    
    public static ArrayList<Cliente> leer() throws Exception {
        //Primero asignamos la ruta del archivo que vamos a leer
        File file = new File("archivaldo.yomero");
        //
        FileInputStream fis = new FileInputStream(file);
        //
        ObjectInputStream ois = new ObjectInputStream(fis);
        //
        ArrayList<Cliente> clientes =  (ArrayList<Cliente>) ois.readObject();
        
        return clientes;
    }

}
