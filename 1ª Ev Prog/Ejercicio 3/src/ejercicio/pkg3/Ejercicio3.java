/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import java.util.Scanner;



/**
 *
 * @author DAW
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduzca primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = sc.nextInt();
        if (n1 == n2){
            System.out.println("Los numeros son iguales");
        }
        else if (n1 > n2) {
                System.out.println("El mayor es: " + n1);
            } else {
                System.out.println("El mayor es: " + n2);
            }
        }
}

