/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n, c, suma;
        System.out.println("Introduce un numero");
        n= sc.nextInt();
        suma=0;
        c=0;
        while (n!=-1) {
            suma= suma+n;
            c=c+1;
            System.out.println("Introduce otro numero");
            n= sc.nextInt();
        }
        System.out.println("La media es: " + (suma/c));
    }
    
}
