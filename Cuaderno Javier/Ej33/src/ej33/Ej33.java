/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej33;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;

        do{
            System.out.println("Introduce una frase: ");
            texto= sc.nextLine();
        }while (texto.isEmpty()); //Sirve para ques si no introduces nada vuelva al Do. 
        //Definicion: Método que devuelve true en el caso de que el tamaño de la cadena sera 0. En otro caso devuelve false
        texto=eliminarultimapalabra(texto);
        System.out.println(texto);
        }

    public static String eliminarultimapalabra(String s) {
        int pos;
        s=s.trim(); //Método que elimina los caracteres blancos iniciales y finales de la cadena, devolviendo una copia de la misma.
        //Por si escribes espacios al principio o al final esto los elimina.
        pos=s.lastIndexOf(" ");
        //Devuelve la ultima posicion que haya despues de un espacio
        if (pos!=-1){ //Pone -1 porque si la cadena esta vacia es lo que devuelve
            s=s.substring(0, pos); //Devuelve el contenido que haya desde el principio de la cadena hasta pos.
        }
        else {
            s="";
        }
        
        return s;
        
    }
    
}
/*
EXPLICACION DEL EJERCICO
    1. Declaramos la clas eliminarultimapalabra de tipo String y declara S de tipo String
    2. Declara pos de tipo entero
    3. Declara s con ese metodo que eliminar los espacios que haya al principio y al final de la frase que hayamos metido.
    3. pos ahora vale hasta donde se encuentre el ultimo espacio (no cuenta si hay uno al final de la frase)
    4. s ahora devuelve el contenido que haya desde el principio de la cadena hasta la ultima palabra donde llegue pos
    6. El else no se exactamente que quiere decir pero entiendo que sirve para devolver la linea en blanco que hay antes de que vuelva a pedirte introducir una frase.
*/
