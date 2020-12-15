/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccion6;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Correccion6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str;
        
        System.out.println("Introduce una cadena con caracteres duplicados: ");
        str=scan.nextLine();
        
        System.out.println("Despues de eliminar los caracteres duplicados la cadena es: \n"+quitacaracduplicados(str));        
    }
    public static String quitacaracduplicados(String cadena){
        char[] array=cadena.toCharArray();
        String resultado="";
        
        for(char value:array){
            if(resultado.indexOf(value)==-1){
                resultado+=value;
            }
        }
        /*
        for(int i=0;i<array.length;i++)
            if(resultado.indexOf(array[i])==-1
               resultado+=array[i];
        */
        return resultado;
    }
}
