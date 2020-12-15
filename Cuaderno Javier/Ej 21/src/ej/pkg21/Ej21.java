/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg21;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       float x, y, a , b, c;
       System.out.println("Introduce la A: ");
       a = sc.nextFloat();
       System.out.println("Introduce la B: ");
       b = sc.nextFloat();
       System.out.println("Introduce la C: ");
       c = sc.nextFloat();
       x= (float) ((b*-1+(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/2*a); 
       y= (float) ((b*-1-(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/2*a);
       System.out.println("El resultado es: " +x);
       System.out.println("El resultado es: " +y);
    }
    
}
