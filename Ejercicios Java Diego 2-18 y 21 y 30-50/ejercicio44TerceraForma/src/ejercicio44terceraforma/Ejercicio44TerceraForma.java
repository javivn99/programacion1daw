/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio44terceraforma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 *
 * @author DAW
 */
public class Ejercicio44TerceraForma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       PrintStream flujoS=System.out;//Stream es flujo FlujoS(salida) FlujoE(entrada)
       BufferedReader flujoE=new BufferedReader(new InputStreamReader(System.in));
       char tabla[]=new char[10];
       char carl;
       int ncars;
       for(int i=0;i<10;i++){
           flujoS.print("Introduce un caracter: ");
           carl=(char) flujoE.read();
           //Limpiamos el buffer de entrada
           ncars=2;
           flujoE.skip(ncars); //salta dos caracteres y limpia el buffer de entrada
           tabla[i]=carl;
           if(Character.isDigit(tabla[i])){//usamos el metodo isDigit de la clase Character
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
