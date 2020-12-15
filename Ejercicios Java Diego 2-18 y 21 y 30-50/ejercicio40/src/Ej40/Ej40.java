/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej40;

/**
 *
 * @author DAW
 */
public class Ej40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] pares=new int[20];
        int i,c=2;
        for(i=0;i<pares.length;i++){
           pares[i]=c;
           c+=2;
        }
        for(i=0;i<pares.length;i++){
            System.out.print(pares[i]+",");
        }
        
        /* Otra forma aunque algo peor
        
        int [] pares = new int[20];
        
        for (int i=0;i<pares.length;i++){
            
            pares[i]=i*2;
            System.out.println(pares[i]);
        }
        */
    }
    
}
