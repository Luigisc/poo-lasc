/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author LUIS SERNA
 */
public class Ejemplo1 {
    
    public static void main(String[] args) {
        
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
        //promocion o casting
        b=(byte)l; //forzado
        i=s; //directo
        s=b; //directo
        s=(short)i; //forzado
        i=(int)l;  //forzado
        
        float f=2.0f;
        double d=2.0;

        f=(float)d;
        d=f;
        
        char ch='h';
        String x="Hola";
        String y="45";
        String z="43.2";
        
        // transformacion o parceo(parcing)
        float w=Integer.parseInt(y)+Float.parseFloat(z);
    }
    
}


