/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio46otraforma;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio46OtraForma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce un numero de elementos: ");
        int n=scan.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(fibonacciRecursivo(i)+", ");
        }
        System.out.println("");
        for(int i=0;i<=n;i++){
            System.out.println(fibonacciIterativo(i)+", ");
        }
    }
    public static int fibonacciRecursivo(int n) {
        if(n==0 || n==1){
            return 1;
        }else{
            return fibonacciRecursivo(n-1)+fibonacciRecursivo(n-2);
        }
    }
    public static int fibonacciIterativo(int n) {
        if(n==0 || n==1){
            return 1;
        }else{
            int fibN=0, contador=2;
            int fibN1=1;
            int fibN2=1;
            
            while(contador<=n){
                fibN=fibN1+fibN2;
                fibN1=fibN2;
                fibN2=fibN;
                contador++;
            }
            return fibN;
        }
    }
}    
