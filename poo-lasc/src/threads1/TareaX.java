/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

/**
 *
 * @author LUIS SERNA
 */
///primera forma de crear un thread
//Herendando la clase

public class TareaX extends Thread {

    @Override
    public void run() {
        
        System.out.println("Soy un thread muy sencillito"
                + " y me llamo "+Thread.currentThread().getName());
        
    }
    
  
}

