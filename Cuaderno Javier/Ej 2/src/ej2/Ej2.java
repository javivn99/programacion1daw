/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, b;
        System.out.println("Introduce el primer numero: ");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        b = sc.nextInt();
        System.out.println("El resultado de la suma es: " + (a+b) );
        System.out.println("El resultado de la resta es: " + (a-b) );
        System.out.println("El resultado de la multiplicacion es: " + (a*b) );
        System.out.println("El resultado de la division es: " + (a/b));
    }
    
}
