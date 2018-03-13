/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion2;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import serializacion.Usuario;

/**
 *
 * @author T-102
 */
public class PersistenciaEmpleado {
    ArrayList<Empleado> empleado;  
    
    public PersistenciaEmpleado(){
    empleado=new ArrayList<>();
}
    
    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
 
 //Generamos el metodo para serializar(Comprimir) a nuestro usuario

    public void guardar(Empleado e){
     
    //Para serializar el primer paso es generar el archivo fisico donde
    //estara nuestro objto de tipo usuario

    File file=new File("Empleados.yo");
    
    //Despues lo abrimos para escribir sobre el 
    if(file.exists()){
        empleado=buscarTodos();
    }
    try{
    FileOutputStream fos=new FileOutputStream(file);
    
    //Luego serializamos
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    
    //Guardamos nuestro usuario
    empleado.add(e);
    oos.writeObject(empleado);
    
    //Ponemos un mensaje
        System.out.println("Objeto guardado con exito");
        
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
  }

    public ArrayList<Empleado> buscarTodos(){
        File file=new File("empleado.yo");
        try{
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois= new ObjectInputStream(fis);
            empleado = (ArrayList<Empleado>) ois.readObject();
        }
        catch(Exception e){
            
            
        }
        return empleado;
    }
    
}
