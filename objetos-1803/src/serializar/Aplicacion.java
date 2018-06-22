package serializar;


public class Aplicacion {
    public static void main (String[] args)throws Exception{
        
        Cliente c=new Cliente();
        c.setEdad(23);
        c.setNombre("Carlos");
        c.setSueldo(10000);
               
       PersistenciaUsuario.guardar(c);
       
       /*
        for(Cliente c:PersistenciaUsuario.leer()){
            System.out.println("Nombre:" +c.getNombre());
        }
        */
    }
    
}
