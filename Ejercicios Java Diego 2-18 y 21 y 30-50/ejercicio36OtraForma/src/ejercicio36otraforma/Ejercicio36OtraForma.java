/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio36otraforma;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio36OtraForma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String palabra;
        int posicion;
        char caracter;
        System.out.println("Introduce una palabra: ");
        palabra=scan.next();
        posicion=palabra.length()-2;
        while(posicion>=0){
            caracter=palabra.charAt(posicion);
            palabra=palabra+caracter;
            posicion--;
        }
        System.out.println("Palabra espejo: "+palabra);
    }
    
}
