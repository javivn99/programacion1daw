/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio33;

import javax.swing.JOptionPane;
/**
 *
 * @author DAW
 */
public class Ejercicio33 {
    
    public static String eliminarUltimaPalabra(String s) {
    int posicion;
    s = s.trim();
    posicion = s.lastIndexOf(" ");
    if (posicion != -1) {
        s = s.substring(0, posicion);
    }
    return s;
}


    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Introduce una frase: ");
        s = eliminarUltimaPalabra(s);
        System.out.println(s);
    }
    
}
