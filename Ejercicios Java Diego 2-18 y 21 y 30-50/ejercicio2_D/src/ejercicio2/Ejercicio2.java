/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n1,n2;     
        System.out.println("Introduce un nº: ");
        n1=scan.nextInt();
        System.out.println("Introduce otro nº: ");
        n2=scan.nextInt();
        System.out.println("La suma es: " + (n1+n2));
        System.out.println("La resta es: " + (n1-n2));
        System.out.println("El producto es: " + (n1*n2));
        System.out.println("La división es: " + (n1/n2));
    }
}      

   
