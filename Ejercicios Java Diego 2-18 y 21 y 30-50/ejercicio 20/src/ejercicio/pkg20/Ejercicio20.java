/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg20;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float NPract, NProblem, NTeori;
        String nombre;
        do {
            System.out.println("Introduce el nombre del alumno: ");
            nombre = sc.nextLine();
            System.out.println("Introduce la nota de la practica: ");
            NPract = sc.nextFloat();
            System.out.println("Introduce la nota de los problemas: ");
            NProblem = sc.nextFloat();
            System.out.println("Introduce la nota de la teoria: ");
            NTeori = sc.nextFloat();
            System.out.println("La media de " +nombre+ " es: " +((NPract+NProblem+NTeori)/3));
            System.out.println("\n");
            }
        while ((NPract>=0 && NPract<=10) && (NProblem>=0 && NProblem<=10) && (NTeori>=0 && NTeori<=10) && (nombre!=null));
    }
}

