/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodepurador2;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 */
public class EjemploDepurador2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edades[] = new int[5];
        int numAlumnos = 0;
        int sumaEdades = 0;
        double edadPromedio;
        int mayores = 0;
        while (true) {
// Si ya no queda espacio en el arreglo de edades
            if (numAlumnos >= 5) {
                System.out.println("Arreglo de edades lleno!");
                break;
            }
// Lee una edad
            System.out.println("Edad del alumno " + (numAlumnos + 1) + 
            "?, 0 para terminar");
            edades[numAlumnos] = entrada.nextInt();
// Si el usuario teclea 0 en la edad
            if (edades[numAlumnos] == 0) {
                break;
            }
// Acumula la edad del alumno
            sumaEdades += edades[numAlumnos];
// Incrementa el contador de alumnos
            numAlumnos++;
        }
// Calcula la edad promedio
        edadPromedio = (double) sumaEdades / numAlumnos;
// Para cada edad del arreglo
        for (int i = 0; i < numAlumnos; i++) {
// Si la edad mayor que la edad promedio
            if (edades[i] > edadPromedio) {
// incrementa el contador del número de edades
// mayores al promedio.
                mayores++;
            }
        }
// Escribe el resultado
        System.out.println("La edad promedio es " + edadPromedio);
        System.out.println("Hay " + mayores + " alumnos con edad mayor que el promedio");
    }
}
