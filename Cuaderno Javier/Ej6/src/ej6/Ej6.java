/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a;
        System.out.println("Introduce un numero: ");
        a= sc.nextInt();
        if (a<=0) {
            System.out.println("ERROR");
        } else{
            System.out.println("El numero introducido es: " +a);
            System.out.println("El cuadrado de dicho numero es: " + (a*a));
            System.out.println("La raiz de dicho numero es: " + (sqrt(a)));
        }
    }
    
}
