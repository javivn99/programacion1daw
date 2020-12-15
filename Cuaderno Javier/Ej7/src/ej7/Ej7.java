/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, b;
        System.out.println("Introduce el numero de niños que hay: ");
        a = sc.nextInt();
        System.out.println("Introduce el numero de niñas que hay: ");
        b = sc.nextInt();
        System.out.println("El porcentaje de niños que hay es: " + ((a*100)/(a+b)) + "%");
        System.out.println("El porcentaje de niñas que hay es: " + ((b*100)/(a+b)) + "%" );
    }
    
}
