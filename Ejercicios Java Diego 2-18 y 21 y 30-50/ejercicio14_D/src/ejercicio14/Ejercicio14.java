/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author DAW
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,suma,par;
        System.out.println("Introduce un nº: ");
        n=scan.nextInt();
        par=0;
        suma=0;
        for(int c=1;c==n;c++){
            par=c*2;
            suma=suma+par;
        }
        System.out.println("La suma es: "+suma);
            
    }
    
}
