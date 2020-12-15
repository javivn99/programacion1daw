/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio44otraforma;

import java.io.IOException;

/**
 *
 * @author DAW
 */
public class Ejercicio44OtraForma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        char tabla[]=new char[10];
        char carl;        

        for(int i=0;i<tabla.length;i++){
            //limpiamos el buffer de entrada
            System.in.read();//se podria usar el scanner y si eso limpiarlo               
            System.out.print("Introduzca un caracter: ");
            carl=(char) System.in.read();//lee un caracter (si meto un n1 me da el ASCII de ese nº)
            tabla[i]=carl;
            if(tabla[i]>='0' && tabla[i]<='9'){
                System.out.println("Es un numero");
            }else{
                System.out.println("No es un numero");
            }
        }
        for(int i=0;i<10;i++){
            System.out.println(tabla[i]);
        }
    }
    
}
