/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej17;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, max, min, suma, c;
        System.out.println("Introduce un numero: ");
        a = sc.nextInt();
        max=a;
        min=a;
        suma =0;
        c=0;
        while (a!=0){
            if(a>max){
                max=a;
            }
            if (a<min) {
                min=a;
            }
            suma= suma+a;
            c=c+1;
            System.out.println("Introduce otro numero");
            a = sc.nextInt();
        } 
        System.out.println("El maximo es: " +max);
        System.out.println("El minimo es: " +min);
        System.out.println("La media es: " +(suma/c));
        
        
    }
    
}
