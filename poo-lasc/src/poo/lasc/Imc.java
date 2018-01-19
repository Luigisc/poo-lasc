/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.lasc;

/**
 *
 * @author LUIS SERNA
 */
public class Imc {
    //el siguiente atributo es de tipo composicion-agregacion 
    Usuario u;
    
    public String calcular(){
        
        float imc= u.peso/(u.altura*u.altura);
                
        return "Tu resultado de imc es:"+imc;
    
    }
}
