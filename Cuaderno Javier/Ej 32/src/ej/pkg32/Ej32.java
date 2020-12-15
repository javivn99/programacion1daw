/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg32;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String frase;
        int longitud;
        System.out.println("Introduce una frase: ");
        frase = sc.nextLine();
        longitud=frase.length();
        System.out.println("Contiene " +longitud+ " letras");
        
    }
    
}
