/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int coste, total;
        String mes;
        total=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el coste de la prenda: ");
        coste = sc.nextInt();
        mes = sc.nextLine();
        System.out.println("Introduce el mes en que compro la prenda: ");
        mes = sc.nextLine();
        if ("octubre".equals(mes)){
            System.out.println("El precio es: "+(total=coste*85/(100)));
        } else {
            System.out.println("El precio de la prenda es: " + coste);
        }
    }
    
}
