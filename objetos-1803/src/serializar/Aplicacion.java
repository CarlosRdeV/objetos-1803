package serializar;


public class Aplicacion {
    public static void main (String[] args)throws Exception{
        
        Cliente c=new Cliente();
        c.setEdad(23);
        c.setNombre("Carlos");
        c.setSueldo(10000);
        
        //No creamos un objeto de persistenciausuario porque no lo necesitamos y lo tenemos como static
        PersistenciaUsuario.guardar(c);
        System.out.println("Guardado con exito!!");
    }
    
}
