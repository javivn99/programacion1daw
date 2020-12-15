/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio43;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creamos los arrays
        String[] empleados = new String[20];
        double[] sueldos = new double [5];
        
        //variables donde guardar el nombre y sueldo 
        
        
        //se lee el primer empleado
        System.out.println("Lectura de nombres y sueldos de empleados: ");
        System.out.print("Empleado " + (i+1) + ": ");
        empleados[i] sc.nextLine();
        System.out.print("Sueldo: ");
        sueldos[i] = sc.nextDoueble;
        
       //se toma el primero como mayor
       mayorSueldo= sueldos[i];
       nombreMayor= empleados[i];
       
       //se leen el resto de empleados
       
       for (i=1; i< empleados.length; i++) {
           sc.nextLine(); //limpiar el buffer
           System.out.print("Empleado " + (i + 1) + ": ");
           empleados[i] = sc.nextLine();
           System.out.print("Sueldo: ");
           sueldos[i] = sc.nextDouble();
           //se compara el sueldo leido con el mayor
           if (sueldos[i] > mayorSueldo) {
               mayorSueldo = sueldos[i];
               nombreMayor = empleados[i];
           }
       }
       
       //mostrar resultados
       System.out.println("Empleado con mayor sueldo: " + nombreMayor);
       System.out.println("Sueldo: " + mayorSueldo);
    }
    
}
