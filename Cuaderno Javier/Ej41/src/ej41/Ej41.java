/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej41;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int [] enteros = new int [10];
        int numero, i;
        
        
        for (i=0; i<enteros.length;i++){
            System.out.println("Introduce un numero");
            numero = sc.nextInt();
            enteros[i]=numero;
        }
        for (i=0;i<enteros.length;i++){
            if(enteros[i]>0) {
               System.out.println("El numero de la posicion " +i+ " es positivo");
           } else if (enteros[i]<0){
               System.out.println("Es numero de la posicion " +i+ " es negativo");
           } else if(enteros[i]==0){
               System.out.println("Es numero de la posicion "+i+ " es cero");
           }
        }
    }
    
}
