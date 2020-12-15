/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg26;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        String frase;
        System.out.println("Introduce una frase: ");
        frase = sc.nextLine();
        System.out.println("La frase es: " +frase);
        while (!"stop".equals(frase)){
            System.out.println("Introduce otra frase: ");
            frase = sc.nextLine();
            System.out.println("La frase es: " +frase);
        }
    }   
    
}
