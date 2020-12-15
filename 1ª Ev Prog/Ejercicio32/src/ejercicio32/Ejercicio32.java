/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio32;

import java.util.Scanner;


/**
 *
 * @author DAW
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa una frase: ");
        Scanner sc = new Scanner(System.in);
        String frase;
        frase = sc.nextLine();
        System.out.println(frase.length()+" es la cantidad de letras de la frase");

    }
}
