/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a;
        System.out.println("Introduce un numero: ");
        a = sc.nextInt();
        while (a<=0) {
            System.out.println("El numero introducido debe ser mayor que 0, introduza otro: ");
            a = sc.nextInt();
        }
        if (a%2==0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("EL numero es impar");
        }
    }
    
}
