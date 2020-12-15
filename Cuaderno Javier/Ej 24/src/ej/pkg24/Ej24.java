/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg24;

/**
 *
 * @author Javi
 */
public class Ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0, c=0;
        while (i<100) {
            i++;
            if(i%2==1) {
                c++;
                System.out.println(+i);
            }
        }
        System.out.println("El total de numeros impares es: "+c);
    }
    
}
