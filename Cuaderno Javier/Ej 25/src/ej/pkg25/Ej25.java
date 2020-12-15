/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg25;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a=0, b;
        System.out.println("Introduce hasta que numero deseas que imprima: ");
        b = sc.nextInt();
        System.out.println("\n");
        while (a<b) {
            a++;
            System.out.println(+a);
        }
    }
    
}
