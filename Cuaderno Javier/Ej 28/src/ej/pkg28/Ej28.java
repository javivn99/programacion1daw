/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg28;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=3, c=0, n;
        System.out.println("Introduce hasta que numero quieres saber: ");
        n = sc.nextInt();
        System.out.println("\n");
        while(i<=n) {
            if (i==(i/3)*3) {
                System.out.println(i);
                c= c+1;
            } i= i+1;
        } System.out.println("El numero de multiplos de 3 es: " +c);
    }
}
