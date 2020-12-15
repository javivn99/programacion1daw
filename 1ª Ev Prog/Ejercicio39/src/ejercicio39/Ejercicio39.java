/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio39;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAlum, i;
        double suma = 0, media = 0;
        
        //Lectura del numero de alumnos
        do {
            System.out.print("Numero de alumnos de la clase: ");
            numAlum = sc.nextInt();
        } while (numAlum <= 0);
        
        //Se crea un array llamado notas de cada alumno y se guarda en vada elemento del array
        double[] notas = new double[numAlum];
        
        for (i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i +1) + " Nota final: ");
            notas[i] = sc.nextDouble();
        }
        //Sumar todas las notas
        for (i = 0; i < notas.length; i++){
            suma = suma + notas[i];
        }
        
        //Calcular la media
        media = suma / notas.length;
        
        //Mostrar la media
        System.out.printf("Nota media del curso: %.2f \n", media);
        
        //Mostrar los valores superiores a la media
        System.out.println("Listado de notas superiores a la media: ");
        for (i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno numero " + (i +1)+ " Nota final: " + notas[i]);
            }
        }
    }
    
}
