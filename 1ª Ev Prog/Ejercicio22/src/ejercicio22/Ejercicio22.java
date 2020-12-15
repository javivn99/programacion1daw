/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DAW
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
       double edad;
       String sexo;
       do{
          System.out.println("Introduce tu edad");
          edad = Double.parseDouble(bufEntrada.readLine());
       } while ((edad <=0));
       do {
           System.out.println("Introduce tu sexo (M/H):");
           sexo = bufEntrada.readLine();
       } while (!((sexo.equals("H") || sexo.equals("M"))));
       if ((sexo.equals("M"))) {
           if ((edad > 18)) {
               System.out.println("Eres mujer y puedes votar");
           } else {
               System.out.println("Eres mujer y no puedes votar");
           }
       } else {
           if ((edad > 18)) {
               System.out.println("Eres hombre y puedes votar");
           } else {
               System.out.println("Eres hombre y no puedes votar");
           }
       }
    }
    
}
