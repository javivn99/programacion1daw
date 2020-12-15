/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodepurador;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 */
public class EjemploDepurador {

   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String sTipoTelegrama;
        char tipoTelegrama;
        int numPalabras;
        double costo;
// Lee el tipo de telegrama como una cadena
        System.out.println("Tipo de telegrama o/u? ");
        sTipoTelegrama = entrada.next();
// Obten el primer caracter de la cadena
        tipoTelegrama = sTipoTelegrama.charAt(0);
// Lee el número de palabras del telegrama
        System.out.println("Número de palabras? ");
        numPalabras = entrada.nextInt();
// Si el tipo de telegrama es ordinario
        if (tipoTelegrama == 'O' || tipoTelegrama == 'o') // Si el número de palabras es menor o igual a 10
        {
            if (numPalabras <= 10) {
                costo = 25.0f;
            } // Si el número de palabras es mayor a 10
            else {
                costo = 25.0f + 5.0f * (numPalabras - 10);
            }
        } // Si el tipo de telegrama es urgente
        else if (tipoTelegrama == 'U' || tipoTelegrama == 'u') // Si el número de palabras es menor o igual a 10
             {
               if (numPalabras <= 10) {
                 costo = 40.0f;
               } // Si el número de palabras es mayor a 10
               else {
                 costo = 40.0f + 7.5f * (numPalabras - 10);
               }
             } 
             else {
                 costo = 0;
             }
// Escribe el costo del telegrama
        System.out.println("Costo del telegrama: " + costo);
    }
}
