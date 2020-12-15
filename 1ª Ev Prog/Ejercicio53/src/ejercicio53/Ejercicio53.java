/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio53;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Introduzca la frase: ");
        frase = sc.nextLine();
        frase = frase.replace('a','e');
        System.out.println("Ahora las A son E: " + frase);
    }
}
