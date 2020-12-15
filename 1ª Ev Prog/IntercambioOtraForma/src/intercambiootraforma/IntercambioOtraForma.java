/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercambiootraforma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DAW
 */
public class IntercambioOtraForma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        String num1,num2,aux;
        BufferedReader bufer=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduce un numero entero: ");
        num1=bufer.readLine();
        System.out.println("Introduce otro numero entero: ");
        num2=bufer.readLine();
        aux=num1;
        num1=num2;
        num2=aux;
        System.out.println("El valor de num1 es: " + num1);
        System.out.println("El valor de num2 es: " + num2);
    }
    
}
