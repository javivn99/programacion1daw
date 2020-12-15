/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String bachiller, grado_medio, prueba_acceso;
        System.out.println("¿Tienes bachiller?");
        bachiller=sc.nextLine();
        if ("si".equals(bachiller)) {
            System.out.println("Puedes cursar un grado superior");
        } else {
            System.out.println("¿Tienes un grado medio?");
            grado_medio = sc.nextLine();
            if ("si".equals(grado_medio)) {
                System.out.println("Puedes cursar un grado superior");
            } else {
                System.out.println("¿Tienes una prueba de acceso?");
                prueba_acceso = sc.nextLine();
                if ("si".equals(prueba_acceso)) {
                    System.out.println("Puedes cursar un grado superior");
                } else {
                    System.out.println("No puedes cursar un grado superior");
                }
            }
        }
    }
    
}
