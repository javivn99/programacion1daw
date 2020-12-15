/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, b;
        System.out.println("Introduce el primero numero: ");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        b = sc.nextInt();
        if (a>b) {
            System.out.println("El numero mayor es: " +a);
        } else if (a<b) {
            System.out.println("El numero mayor es: " +b);
        } else {
            System.out.println("Los numero son iguales");
        }
    }
    
}
