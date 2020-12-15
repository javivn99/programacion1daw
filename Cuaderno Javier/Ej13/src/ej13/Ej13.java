/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, suma=0, contador=1;
        System.out.println("Introduce hasta que numero quieres que se sume: ");
        a= sc.nextInt();
        while (contador<=a) {
            suma = suma+contador;
            contador = contador+1;
        }
        System.out.println("La suma es: " +suma);
    } 
}
