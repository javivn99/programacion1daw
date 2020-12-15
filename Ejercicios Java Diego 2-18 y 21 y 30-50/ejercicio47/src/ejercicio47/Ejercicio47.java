/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio47;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,exp,digito;
        String resultado;
        double binario;
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("Introduce un numero decimal: ");
            n=scan.nextInt();            
        }while(n<0);
        resultado=Integer.toBinaryString(n);
        System.out.println(resultado);
        
        exp=0;
        binario=0;
        while(n!=0){
            digito=n%2;
            binario=binario+digito*Math.pow(10,exp);
            exp++;
            n=n/2;
        }
        System.out.printf("Binario: %.0f \n",binario);
    }
    
}
