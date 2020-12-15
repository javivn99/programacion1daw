/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        int suma, multiplicacion;
        System.out.println("Introduce el primer numero: ");
        n1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("Introduce el tercer numero: ");
        n3 = sc.nextInt();
        suma= n1+ n2+ n3;
        multiplicacion= n1*n2*n3;
        if (n1 < 0)
            System.out.println("La multiplicación es : " + multiplicacion);
            else  
            System.out.println("La suma es : " + suma);      
    }
    
}
