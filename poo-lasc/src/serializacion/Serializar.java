
package serializacion;
import java.io.*;
/** 
 * @author LUIS SERNA
 */
public class Serializar {
    
    public static void main(String[] args) {
        
        //Primeor generamos un usuario 
        Usuario u=new Usuario(20,"Pedro");
        
        //Generamos un modelo de la clase que serializaba
        PersistenciaUsuarios p=new PersistenciaUsuarios();
        
        //Ajustamos su tributo usuario
        p.setU(u);
        
        //Ahora si comprimimos
        p.guardar();
        
    }
    
}
