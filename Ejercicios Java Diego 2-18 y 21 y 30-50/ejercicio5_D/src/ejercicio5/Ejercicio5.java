/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;
/**
 *
 * @author DAW
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n1,n2,n3;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce un nº: ");
        n1=scan.nextInt();
        System.out.println("Introduce un nº: ");
        n2=scan.nextInt();
        System.out.println("Introduce un nº: ");
        n3=scan.nextInt();
        if(n1<0){
            System.out.println("El producto de los tres es: "+(n1*n2*n3));
        }else{
            System.out.println("La suma de los tres es: "+(n1+n2+n3));
        }
    }
    
}
