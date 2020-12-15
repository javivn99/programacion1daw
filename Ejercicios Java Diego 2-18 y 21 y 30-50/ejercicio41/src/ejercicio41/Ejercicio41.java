/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio41;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,positivos=0,negativos=0,cero=0;
        int[] numeros=new int[10];
        for(i=0;i<numeros.length;i++){
            System.out.println("numeros["+i+"]= ");
            numeros[i]=scan.nextInt();
        }
        for(i=0;i<numeros.length;i++){
            if(numeros[i]>0){
                positivos++;
            }
            if(numeros[i]<0){
                negativos++;
            }
            if(numeros[i]==0){
                cero++;
            }
        }
        System.out.println("Hay "+positivos+" numeros positivos");
        System.out.println("Hay "+negativos+" numeros negativos");
        System.out.println("Hay "+cero+" numeros que son cero");
    }
    
}
