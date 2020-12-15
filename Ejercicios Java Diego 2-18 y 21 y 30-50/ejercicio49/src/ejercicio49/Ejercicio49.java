/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio49;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio49 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String cadena1, cadena2;
        int numeroveces=0;
        do{
            System.out.println("Introduce cadena: ");
            cadena1=scan.nextLine();
        }while(cadena1.isEmpty());
        System.out.println("Introduce otra cadena: ");
        cadena2=scan.nextLine();
        numeroveces=contarConcurrencias(cadena1,cadena2);
        System.out.println("La cadena "+cadena2+" aparece "+numeroveces+" veces en la primera");
    }
    public static int contarConcurrencias(String cadena1,String cadena2) {
        int posicion, contador=0;
        //se busca la primera vez que aparece
        posicion=cadena1.indexOf(cadena2);
        while(posicion!=-1){ //mientras se encuentre el caracter
            contador++;
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion=cadena1.indexOf(cadena2,posicion+1); 
        }
        return contador;
    }
}
