/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg29;



/**
 *
 * @author Javi
 */
public class Ej29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1, sumpar=0, sumimp=0;
        while (i<101) {
            if(i == (int) (i/2)*2) {
                sumpar = sumpar + i;
            } else {
                sumimp=sumimp +i;
            }
            i = i +1;
        } 
        System.out.println("La suma de pares es: " +sumpar);
        System.out.println("La suma de impares es: " +sumimp);
    } 
    
}
