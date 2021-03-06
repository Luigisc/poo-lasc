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
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

//segunda forma de crear threads
// Implementando la interface runnable


public class ProbarThreads implements Runnable{
    
    public static void main(String[] args) {
        
         //1. crear thread
         
         TareaX t1=new TareaX();
         TareaX t2=new TareaX();
         
         Runnable r=new ProbarThreads();
         Thread t3=new Thread(r);
         
         //2. Inicializado
         t1.setName("Floky");
         
         t1.start();
         t2.start();
         t3.start();
         
         //3. En ejecucion lo da la JVM decide
         
         
         //4. Pausa no la vamos a poner aqui, es en caso
         //de que haga algo que dure cierto tiempo
         
         //5. Su muerte es cuando termina su proceso
         
    }

    @Override
    public void run() {
       //Hacemos otra cosa
       
       while(true){
       LocalTime tiempo= LocalTime.now();
       int hora= tiempo.getHour();
       int minutos=tiempo.getMinute();
       int segundo=tiempo.getSecond();
        System.out.println("La hora es: " + hora+ ":" +minutos+":"+segundo); 
           try {
               Thread.sleep(1000);
           } catch (InterruptedException ex) {
               Logger.getLogger(ProbarThreads.class.getName()).log(Level.SEVERE, null, ex);
           }
        
       }
    }
    }
