/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
       
        int numtotal,numhombres,nummujeres,porcmujeres,porchombres;
       
        System.out.println("Ingrese el numero de niños");
        numhombres=sc.nextInt();
       
        System.out.println("Ingrese el numero de niñas");
        nummujeres=sc.nextInt();
       
       
        numtotal=numhombres+nummujeres;
       
        porchombres=(100*numhombres)/numtotal;
        porcmujeres=(100*nummujeres)/numtotal;
       
       
       
        System.out.println("El total de hombres y mujeres son : "+numtotal);
        System.out.println(""+porchombres+"% de hombres");
        System.out.println(""+porcmujeres+"% de mujeres");
    }
    
}
