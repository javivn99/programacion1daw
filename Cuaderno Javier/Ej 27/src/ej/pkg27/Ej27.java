/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg27;

import java.util.Scanner;
/**
 *
 * @author Javi
 */
public class Ej27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, n;
        boolean letra_correcta = false;
        System.out.print("Solo puedes introducir dos letras mayusculas correctas, primer intento: ");
        s = sc.nextLine();
        System.out.print("Segundo intento: ");
        n = sc.nextLine();
        if ("S".equals(s) || "N".equals(n) || "N".equals(s) || "S".equals(n)) {
            System.out.print("Enhorabuena");
            letra_correcta = true;
        } else {
            System.out.print("La cagaste");
        }
    }
    
}
