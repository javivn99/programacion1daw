/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_saludo2_word;

/**
 *
 * @author DAW
 */
public class Ej_Saludo2_Word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String saludo = "Hola";
        System.out.println(saludo.concat("Maria"));
        System.out.println(saludo.toUpperCase());
        System.out.println(saludo);
        saludo=saludo.concat("Maria");
        System.out.println(saludo);
        
        StringBuffer sb = new StringBuffer();
    // el tamaño va aumentando a medida que vayamos añadiendo caracteres
    // el metodo append convierte automaticamente cualquier tipo de String
    
        sb.append("Esto es un a cadena");
    // tambien podemos insertarlo en una linea
        sb.insert(4, " no");
    // o borrar trozos de la cadena
        System.out.println(sb);
        sb.delete(4,11); // sb = "Esto prueba"
        System.out.println(sb);
    }
    
}
