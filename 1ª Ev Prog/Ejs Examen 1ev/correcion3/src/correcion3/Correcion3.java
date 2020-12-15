/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcion3;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Correcion3 {
static final int MAX_CHARS=256;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str;
        
        System.out.println("Introduce una cadena: ");
        str=scan.nextLine();
        System.out.println("La cadena introducida es: "+str);
        System.out.println("Los caracteres duplicados y su numero son: ");
        
        muestraduplicados(str);        
                
    }
    static void cuentacaracteres(String str1,int[] ctr){
        for(int i=0;i<str1.length();i++){
            ctr[str1.charAt(i)]++;
        }
    }
    static void muestraduplicados(String str1){
        int contador[]=new int[MAX_CHARS];
        cuentacaracteres(str1,contador);
        for(int i=0;i<MAX_CHARS;i++){
            if(contador[i]>1){
                System.out.printf("%c aparece %d veces\n",i,contador[i]);
            }
        }
    }
    
}
