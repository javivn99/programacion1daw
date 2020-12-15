/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio55;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce un codigo de la tabla ASCII: ");
        int codigo=scan.nextInt();
        //Pasamos el codigo a caracter
        char caracter=(char) codigo;
        System.out.println(caracter);
    }
    
}
