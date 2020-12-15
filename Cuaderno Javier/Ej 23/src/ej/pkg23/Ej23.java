/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg23;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double hnormal, hextra, sueldo, htotal;
        System.out.println("Introduce el total de horas trabajadas: ");
        htotal=sc.nextInt();
        hextra= (htotal- 35);
        hnormal= (htotal - hextra);
        htotal = ((hnormal*10) + (hextra*15));
        sueldo = htotal;
        if (sueldo > 20000) {
            System.out.println("Tu sueldo aplicando los impuestos es de : " +sueldo*0.8+"€");
        } else {
            System.out.println("Tu sueldo es: " +sueldo+"€");
        }
        
    }
    
}
