/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio51;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int contador=0;
        System.out.println("Introduzca la frase: ");
        frase = sc.nextLine();
        for(int x=0;x<frase.length();x++) {
            if ((frase.charAt(x)=='a') || (frase.charAt(x)=='e') || (frase.charAt(x)=='i') || (frase.charAt(x)=='o') || (frase.charAt(x)=='u')){
            contador++;
            }
        }
        System.out.println("La frase: " + frase + ", contiene, " + contador + " vocales");
    }
}
