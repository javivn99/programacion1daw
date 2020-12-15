/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;
/**
 *
 * @author DAW
 */
public class Ejercicio8 {

   
    public static void main(String[] args){
        int coste,total;
        String mes;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce el coste de la compra: ");
        coste=scan.nextInt();
        mes=scan.nextLine();
        System.out.println("Introduce el mes de la compra: ");
        mes=scan.nextLine();
        total=0;
        if("octubre".equals(mes)){
            System.out.println("El coste es: "+(total=coste*85/(100)));
        }else{
            System.out.println("El coste es: "+coste);
        }
    }
    
}
