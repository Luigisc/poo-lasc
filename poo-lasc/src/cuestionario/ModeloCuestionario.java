/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;
import java.util.*;
/**
 * @author LUIS SERNA
 */
public class ModeloCuestionario {
    
    ArrayList<Pregunta> preguntas;
    
    public ModeloCuestionario (){
        
        //Aqui generamos todo nuestro cuestionario
        preguntas=new ArrayList<>();
        
    }
    
    public void AgregarPregunta(Pregunta p){
        preguntas.add(p);
    }
    
    public ArrayList<Pregunta> ObtenerCuestionario(){
        return preguntas;
    }
}
