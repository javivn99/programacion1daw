/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio46;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,fibo1,fibo2,i;
        do{
            System.out.println("Introduce un numero: ");
            n=scan.nextInt();  
        }while(n<=1);
        System.out.println("Los "+n+" primeros terminos de la serie de Fibonacci son: ");
        
        fibo1=1;
        fibo2=1;
        
        System.out.println(fibo1+" ");
        for(i=2;i<=n;i++){
            System.out.println(fibo2+" ");
            fibo2=fibo1+fibo2;
            fibo1=fibo2-fibo1;
        }

      
    }
}
