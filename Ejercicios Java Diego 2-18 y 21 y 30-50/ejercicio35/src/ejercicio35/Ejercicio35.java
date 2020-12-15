/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio35;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;
/**
 *
 * @author DAW
 */
public class Ejercicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Introduce una frase: ");
        StringTokenizer st = new StringTokenizer(s);
        System.out.println("Número de palabras: " + st.countTokens());
    }
    
}
