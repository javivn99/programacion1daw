/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_otroejemplo_word;

/**
 *
 * @author DAW
 */


import javax.swing.JOptionPane;

public class Ej_OtroEjemplo_Word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Introduce una frase o palabra: ");
	String salida = " ";
	s = s.replace(" ", ""); //quitamos los espacios en blanco
	StringBuffer sb = new StringBuffer(s); //pasamos s como argumento a StringBuffer
	sb = sb.reverse(); //invertimos el orden de las letras
	if (s.equalsIgnoreCase(sb.toString()))	{ //comparamos sin importar si hay mayúsculas

            salida = "Es un Palíndromo";
	}
        else {

            salida = "No es un Palíndromo";
	}
	JOptionPane.showMessageDialog(null, salida);

    }
    
}
