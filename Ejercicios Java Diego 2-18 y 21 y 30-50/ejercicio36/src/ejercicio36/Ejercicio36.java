/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio36;

import javax.swing.JOptionPane;
/**
 *
 * @author DAW
 */
public class Ejercicio36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Introduce una palabra: ");
        String sInvertida = null;
        for (int x=s.length()-1;x>=0;x--){
            sInvertida+=sInvertida.charAt(x);
        }
        System.out.print(s+" con efecto espejo seria "+sInvertida);
    }
    
}
