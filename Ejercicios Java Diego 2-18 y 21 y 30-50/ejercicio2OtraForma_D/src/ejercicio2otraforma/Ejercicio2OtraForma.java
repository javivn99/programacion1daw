/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2otraforma;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2OtraForma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader bufEntrada=new BufferedReader(new InputStreamReader(System.in));
        double n1,n2;
        System.out.println("Introduce un nº: ");
        n1=Double.parseDouble(bufEntrada.readLine());
        System.out.println("Introduce un nº: ");
        n2=Double.parseDouble(bufEntrada.readLine());
        System.out.println("La suma es: " + (n1+n2));
        System.out.println("La resta es: " + (n1-n2));
        System.out.println("El producto es: " + (n1*n2));
        System.out.println("La división es: " + (n1/n2));
    
    }
}