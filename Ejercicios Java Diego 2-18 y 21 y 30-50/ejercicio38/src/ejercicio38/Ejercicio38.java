/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio38;

import java.util.Scanner;
/**
 *
 * @author DAW
 */
public class Ejercicio38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int[] numeros=new int[10];
        double media=0;
        
        //lectura de datos y llenar el array
        System.out.println("Lectura de los elementos del array: ");
        for(i=0;i<10;i++){
            System.out.println("numeros["+i+"]= ");
            numeros[i]=sc.nextInt();
        }
        
        //Recorrer el array y calcular la media
        for(i=0;i<10;i++){
            if(i%2==0){//si la posicion actual es par
                media=media+numeros[i]; //se suma el valor de esa posicion
            }
        }
        //Calcular y mostrar la media
        System.out.println("Media de los valores que se encuentran en posiciones pares: "+media/5);
    }
    
}
