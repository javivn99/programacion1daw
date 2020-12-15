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
        Scanner scan=new Scanner(System.in);
        String cadena1, cadena2,cadenaUpper;
        int posicion;
        System.out.println("Introduce cadena: ");
        cadena1=scan.nextLine();
        System.out.println("Introduce otra cadena: ");
        cadena2=scan.nextLine();
        
        cadenaUpper=cadena2.toUpperCase();
        cadena1=cadena1.replace(cadena2, cadenaUpper);
        System.out.println(cadena1);


    }

}

