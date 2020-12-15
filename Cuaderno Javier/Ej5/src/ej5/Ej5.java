/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, b, c;
        System.out.println("Introduce el primero numero: ");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        b = sc.nextInt();
        System.out.println("Introduce el tercer numero: ");
        c = sc.nextInt();
        if (a<0) {
            System.out.println("El resultado es: " + (a*b*c));
        } else {
            System.out.println("El resultado es: " + (a+b+c));
        }
    }
    
}
