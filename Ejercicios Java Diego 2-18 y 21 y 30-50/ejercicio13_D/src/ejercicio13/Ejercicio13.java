/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;
import java.util.Scanner;
/**
 *
 * @author DAW
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int n,suma=0,contador;
       System.out.println("Introduce un nº: ");
       n=scan.nextInt();
       for(contador=1;contador==n;contador++){
           suma=n+suma;
           n=n+1;
       }
       System.out.println("La suma es: "+suma);
    }
    
}
