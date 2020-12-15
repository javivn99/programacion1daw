/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej36;

import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class Ej36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Introduce una palabra: ");
        String sInvertida = null;
        for (int x=s.length()-1;x>=0;x--){ //s.length() devuelve la longitud de la cadena
            sInvertida+=sInvertida.charAt(x);
        }
        System.out.print(s+" con efecto espejo seria "+sInvertida);
    }
    
}
/*
1. Desde la penultima posicion de la palabra hasta la posicion 0, la x decrementa.
2. palabrainvertida ahora vale (nada)+(las letras desde la penultima hasta el principio) por lo que termina siendo la palabra invertida.
*/
