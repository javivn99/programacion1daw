/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio33;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String texto;
    
    do{
        System.out.println("Introduce una texto: ");
        texto= sc.nextLine();
    }while (texto.isEmpty());
    texto=eliminarultimapalabra(texto);
    System.out.println(texto);
    }
    public static String eliminarultimapalabra(String s) {
        int pos;
        s=s.trim();
        pos=s.lastIndexOf(" ");
        if (pos!=-1){
            s=s.substring(0, pos);
        }
        else {
            s="";
        }
        return s;
        
    }
    
}

