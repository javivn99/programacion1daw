/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej19;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int dia, mes, año;
        System.out.println("Introducer el dia: ");
        dia = sc.nextInt();
        System.out.println("Introducer el mes: ");
        mes = sc.nextInt();
        System.out.println("Introducer el año: ");
        año = sc.nextInt();
        if ((dia>=1 || dia<=31) || (mes>=1 || mes <=12) || año>0) {
            switch (mes) {
                case 1: mes = 1;
                    System.out.println(+dia+" de Enero de " +año);
                    break;
                case 2: mes = 2;
                    System.out.println(+dia+" de Febrero de "+año);
                    break;
                case 3: mes = 3;
                    System.out.println(+dia+" de Marzo de "+año);
                    break;
                case 4: mes = 4;
                    System.out.println(+dia+" de Abril de "+año);
                    break;
                case 5: mes = 5;
                    System.out.println(+dia+" de Mayo de "+año);
                    break;
                case 6: mes = 6;
                    System.out.println(+dia+" de Junio de "+año);
                    break;
                case 7: mes = 7;
                    System.out.println(+dia+" de Julio de "+año);
                    break;
                case 8: mes = 8;
                    System.out.println(+dia+" de Agosto de "+año);
                    break;
                case 9: mes = 9;
                    System.out.println(+dia+" de Septiembre de "+año);
                    break;
                case 10: mes = 10;
                    System.out.println(+dia+" de Octubre de "+año);
                    break;
                case 11: mes = 11;
                    System.out.println(+dia+" de Noviembre de "+año);
                    break;
                case 12: mes = 12;
                    System.out.println(+dia+" de Diciembre de "+año);
                    break;
            }
        } else {
            System.out.println("Error");
        }
        
    }
    
}
