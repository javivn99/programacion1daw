/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio48;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long numero, aux, digito, decimal;
        int exponente;
        boolean esBinario;
        Scanner sc = new Scanner(System.in);
        
        //Leer numero  por teclado y comprobar si es binario
        
        do {
            System.out.println("Introduce un numero binario: ");
            numero = sc.nextLong();
            //comprobamos que sea un numero binario es decir
            //que este formado solo por ceros y unos
            esBinario=true;
            aux = numero;
            while (aux != 0) {
                digito = aux % 10; //ultima cifra del numero
                if (digito != 0 && digito != 1) {
                    esBinario = false; //no es un numero binario
                    
                }
                aux = aux / 10; //quitamos la ultima cifra para repetir el proceso
            }
        } while (!esBinario); //se vuelve a pedir si no es binario
        
        //proceso para pasar de binario a decimal
        exponente = 0;
        decimal = 0; //sera el equivalente en base decimal
        while (numero !=0) {
            //se toma la ultima cifra
            digito = numero % 10;
            // se multiplica por la potencia de 2 correspondiente y se suma al numero
            decimal = decimal + digito * (int) Math.pow(2, exponente);
            //se aumenta el exponente
            exponente++;
            //se quita la ultima cifra para repetir el proceso
            numero = numero / 10;
        }
        System.out.println("Decimal: " + decimal);
    }
    
}
