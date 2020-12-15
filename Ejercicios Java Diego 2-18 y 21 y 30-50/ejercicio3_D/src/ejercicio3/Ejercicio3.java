/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int n1, n2;
        
        System.out.println("Introduce un nº: ");
        
        n1=scan.nextInt();
        
        System.out.println("Introduce un nº: ");
        
        n2=scan.nextInt();
        
        if(n1>n2){
        System.out.println(n1 +" es mayor que " + n2);
        }else{
            if(n1<n2){
                System.out.println(n1 + " es menor que n2 ");
        }else{
                System.out.println(n1 + " y " + n2 + " son iguales ");
            }
            
        }
        
    }
    
}
