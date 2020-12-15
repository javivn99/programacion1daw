/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;
import java.util.Scanner;
/**
 *
 * @author DAW
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,c,suma;
        System.out.println("Introduce un nº: ");
        n=scan.nextInt();
        suma=0;
        c=1;
        while(n!=-1){
            suma=suma+n;
            c=c+1;
            System.out.println("Introduce otro numero: ");
            n=scan.nextInt();
        }
        System.out.println("La media aritmética es: "+suma/(c-1));
    }
    
}
