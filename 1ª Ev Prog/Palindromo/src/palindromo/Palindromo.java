/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import javax.swing.JOptionPane;

/**
 *
 * @author DAW
 */
public class Palindromo {

   
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Introduce una frase o palabra");
        String salida = " ";
        s = s.replace(" "," "); //quitamos los espacios en blanco
        StringBuffer sb = new StringBuffer(s); //pasamos s como argumento a StringBuffer
        sb = sb.reverse(); //invertimos el orden de las letras
        if (s.equalsIgnoreCase(sb.toString())){
            //comparamos sin importar si hay mayusculas
            salida = "Es un Palindromo";
        }
        else {
            salida = "No es un Palindromo";
        }
        JOptionPane.showMessageDialog(null, salida);
                
                
    }
    
}
