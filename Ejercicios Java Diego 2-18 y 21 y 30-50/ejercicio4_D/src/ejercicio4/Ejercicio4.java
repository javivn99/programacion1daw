/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;
/**
 *
 * @author DAW
 */
public class Ejercicio4 {
        public static void main(String[] args) {
        int n1,n2,n3;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce un nº: ");
        n1=scan.nextInt();
        System.out.println("Introduce un nº: ");
        n2=scan.nextInt();
        System.out.println("Introduce un nº: ");
        n3=scan.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1+" es el mayor");
        }else{
            if(n2>n1 && n2>n3){
            System.out.println(n2+" es el mayor");
            }else{
           System.out.println(n3+" es el mayor");
        }
        }
    }
}

   
