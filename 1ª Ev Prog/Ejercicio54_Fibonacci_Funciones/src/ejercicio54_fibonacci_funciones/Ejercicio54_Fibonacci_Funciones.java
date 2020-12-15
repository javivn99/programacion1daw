/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio54_fibonacci_funciones;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio54_Fibonacci_Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de elementos a mostrar de la serie: ");
        int limite = sc.nextInt();
        for(int i=0; i<limite; i++){
            System.out.print(fibonacciRecursivo(i) + ", ");
        }
        System.out.println("");
        for(int i=0; i<limite; i++){
            System.out.print(fibonacciIterativo(i) + ", ");
        }
        //System.out.println(fibonacciIterativo(5));
    }//main
    
    public static int fibonacciRecursivo(int n){
        if (n==0 || n==1){
            return 1;
        } else{
            return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
        }
    }
    public static int fibonacciIterativo(int n){        
        if (n==0 || n==1){
            return 1;
        } else{
        
            int fibN = 0, contador = 2;
            int fibN1 = 1;
            int fibN2= 2;
            
            while (contador <= n){
                fibN = fibN1 + fibN2; //obtener siguiente numero
                fibN1 = fibN2;
                fibN2= fibN;
                contador++;
            } //While
            return fibN;
        }//else
    }//fibonacciIterativo

}//modulo Fibonacci
