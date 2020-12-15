/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej34;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String palabra;
        String palabrainvertida="";
        System.out.println("Ingresa una palabra y se mostrara a la inversa:\n");
        palabra=s.nextLine();
 
        for (int i = palabra.length()-1; i>=0; i--){ //Esto dice que se situe entre la a y la l y que vaya bajando hasta que acabe la frase (hola que tal)
            palabrainvertida += palabra.charAt(i); //esto es como poner palabrainvertida = palabrainvertida + palabra.charAt(i), pero es mas largo
        }
 
        System.out.println("La palabra invertida es:\n"+ palabrainvertida);
    }
    
}
//hola que tal
/*
EXPLICACION DEL EJERCICIO
    1. Declaramoos los String, palabrainvertida no tiene nigun caracter dentro.
    2. Desde la penultima posicion de la palabra que hayamos metido hasta la primera letra, el valor de i va descrementando
    3. palabrainvertida ahora vale (nada)+(las letras desde la penultima hasta el principio) por lo que termina siendo la palabra invertida.
*/