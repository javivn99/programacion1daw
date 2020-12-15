/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio50;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena, subcadena, subcadenaUpper;
        int posicion;
        System.out.println("Introduce la cadena en la que buscar: ");
        cadena = sc.nextLine();
        System.out.println("Introduce la subcadena a buscar: ");
        subcadena = sc.nextLine();
        
        subcadenaUpper = subcadena.toUpperCase();
        cadena = cadena.replace(subcadena, subcadenaUpper);
        System.out.println(cadena);
    }
    
}