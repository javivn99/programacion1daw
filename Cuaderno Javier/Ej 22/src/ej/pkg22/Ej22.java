/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg22;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int edad;
        String sexo;
        System.out.println("Introduce tu sexo: ");
        sexo = sc.nextLine();
        System.out.println("Introduce tu edad: ");
        edad = sc.nextInt();
        while (edad>18 && sexo.equals("hombre")) {
            System.out.println("Puedes votar");
        } 
        if (edad>18 && sexo.equals("mujer")) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("No puedes votar");
        }
    }
    
}
