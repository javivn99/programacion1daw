/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg20_foro;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej20_Foro {

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
            if (!nombre.equals("")){
                System.out.println("Introduce la nota de la practica: ");
                NPract = sc.nextFloat();
                System.out.println("Introduce la nota de los problemas: ");
                NProblem = sc.nextFloat();
                System.out.println("Introduce la nota de la teoria: ");
                NTeori = sc.nextFloat();
 
                sc.nextLine();//Esto es para quitar el salto de linea almacenado
 
                if ((NPract>=0 && NPract<=10) && (NProblem>=0 && NProblem<=10) && (NTeori>=0 && NTeori<=10))
                    System.out.println("La media de " +nombre+ " es: " +((NPract*0.1) + (NProblem*0.5) + (NTeori*0.4))+"\n");
                else
                    System.out.println("Error, las notas no son válidas\n");
            }
        }while ((!nombre.equals("")));
            System.out.println("Fin del programa");
    }
    
}
