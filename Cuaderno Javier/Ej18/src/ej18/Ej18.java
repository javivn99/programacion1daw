/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej18;

/**
 *
 * @author Javi
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0, m=0;
        
        while (a<100) {
            a++;
            if (a%2==0 || a%3==0) {
            m=m+1;
            System.out.println("Multiplo de 2 o 3: " +a);
            }
        }
        System.out.println("El numero total de multiplos de dos o tres es: " +m);
    }    
}
