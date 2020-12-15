/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg34;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String palabra;
        String palabrainvertida="";
        System.out.println("Ingresa una palabra y se mostrara a la inversa:\n");
        palabra=s.nextLine();
 
        for (int i = palabra.length()-1; i>=0; i--){
            palabrainvertida += palabra.charAt(i);
        }
 
        System.out.println("La palabra invertida es:\n"+ palabrainvertida);
    }
    
}
