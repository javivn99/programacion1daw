/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio54;

import javax.swing.JOptionPane;

/**
 *
 * @author DAW
 */
public class Ejercicio54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("introduce un caracter ASCII");
        //Pasamos el String a char con el metodo charAT
        char caracter=texto.charAt(0);
        //Pasamos el caracter a codigo
        int codigo=(int)caracter;
        System.out.println(codigo);
    }
    
}
