/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio44_2;

import java.io.IOException;

/**
 *
 * @author DAW
 */
public class Ejercicio44_2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        char tabla[] = new char[10];
        char carl;
        System.out.println("Pulsa enter para continuar: ");
        for (int i=0; i < 10; i++) {
            //limpiamos el buffer de entrada
            System.in.read();
            System.out.print("Introduzca carácter: ");
            carl = (char) System.in.read(); //lee un caracter
            tabla[i] = carl;
            if (tabla[i] >= '0' && tabla[i] <= '9') {
                System.out.println("Es un numero");
            }else {
                System.out.println("NO es un numero");
            }
    }
    for (int i=0; i < 10; i++) {
        System.out.println(tabla[i]);
    }
    }
}
