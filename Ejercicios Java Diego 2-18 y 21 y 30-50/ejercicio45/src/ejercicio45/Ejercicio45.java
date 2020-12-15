/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio45;

import java.util.Random;

/**
 *
 * @author DAW
 */
public class Ejercicio45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamano=10;
        int tabla[]=new int[tamano];
        tabla=llenarArrayAleatorio(0,10,tamano);
        mostrararray(tabla);
    }
    public static int[] llenarArrayAleatorio(int desde, int hasta, int tam){
        int[] numeros=new int[tam];
        Random rnd=new Random();
        int n;
        for(int i=0;i<numeros.length;i++){
            do{
                //n=rnd.nextInt(hasta-desde+1)+desde;
                n=(int)(rnd.nextDouble()*11.0); //multiplico por 11 porque quiero generar numeros entre 0 y el numero por el que multiplicas, el 11 no entra
            }while(comprobarSiContiene(numeros,i,n));
            numeros[i]=n;
        }
        return numeros;
    }
    public static boolean comprobarSiContiene(int[] numeros, int indice, int valor){
        for(int i=0;i<indice;i++){
            if(numeros[i]==valor){
                return true;
            }
        }
        return false;
    }
    public static void mostrararray(int[] t){
        for (int i=0;i<t.length;i++){
            System.out.println(t[i]);
        }
    }
}
