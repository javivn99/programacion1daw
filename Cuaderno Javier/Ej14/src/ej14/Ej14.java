/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n, suma=0, contador;
        System.out.println("Introduce un numero: ");
        n= sc.nextInt();
        n=n+2;
        suma= n+suma;
        for(contador=0;contador==n;contador=contador+2) {
                   
        }
        System.out.println("La suma es: " +suma);
    }
    
}
