/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DAW
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in)) ;
       double numero1;
       double numero2;
       double resultado;
       System.out.println("Introduce el primer numero");
       numero1 = Double.parseDouble(bufEntrada.readLine());
       System.out.println("Introduce el segundo numero");
       numero2 = Double.parseDouble(bufEntrada.readLine());
       resultado = 0;
       resultado = numero1+ numero2;
       System.out.println("La suma es: " + resultado);
       resultado = numero1 - numero2;
       System.out.println("La resta es: " + resultado);
       resultado = numero1 * numero2;
       System.out.println("La multiplicacion es: " + resultado);
       resultado = numero1 / numero2;
       System.out.println("La division es: " + resultado);
    }
    
}
