/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio32;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author DAW
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Introduce una frase o palabra: ");
	int contador = 1;
	for (int i = 0; i < s.length() - 1; i++){
	    if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')){
		contador++;
 
	    }
	}
 	System.out.println("El numero de palabras es: " + contador);
    }
    
}
