/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej37;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,positivos=0,negativos=0;
        int[] numeros=new int[10];
        double media=0,mediapos=0,medianeg=0;
        for(i=0;i<10;i++){
            System.out.println("numeros["+i+"]= ");
            numeros[i]=scan.nextInt();
        }
        for(i=0;i<10;i++){
            media=media+numeros[i];
            if(numeros[i]>0){
                mediapos=mediapos+numeros[i];
                positivos++;
            }else{
                medianeg=medianeg+numeros[i];
                negativos++;
            }
        }
        media=media/numeros.length;
        System.out.println("La media es: "+media);
        mediapos=mediapos/positivos;
        System.out.println("La media de los positivos es: "+mediapos);
        medianeg=medianeg/negativos;
        System.out.println("La media de los negativos es: "+medianeg);
    }
    
}
