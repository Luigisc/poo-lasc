
package serializacion;
import java.io.*;
/**
 * @author LUIS SERNA
 */
public class PersistenciaUsuarios {
 Usuario u;
 
    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
 
 //Generamos el metodo para serializar(Comprimir) a nuestro usuario

    public void guardar(){
     
    //Para serializar el primer paso es generar el archivo fisico donde
    //estara nuestro objto de tipo usuario

    File file=new File("Archivaldo.yo");
    
    //Despues lo abrimos para escribir sobre el 
    
    try{
    FileOutputStream fos=new FileOutputStream(file);
    
    //Luego serializamos
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    
    //Guardamos nuestro usuario
    oos.writeObject(u);
    
    //Ponemos un mensaje
        System.out.println("Objeto guardado con exito");
        
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
  }
    //Para leerlo
    public Usuario recobrarUsuario(){
        File file=new File("Archivaldo.yo");
        Usuario recobrado=null;
        //El proceso inverso
        try{
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        recobrado=(Usuario) ois.readObject();
    }catch (Exception e){
        
    }   
        return recobrado;
  }
    
}
