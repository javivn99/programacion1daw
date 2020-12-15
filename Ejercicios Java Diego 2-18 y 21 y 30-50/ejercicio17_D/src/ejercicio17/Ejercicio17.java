/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;
import java.util.Scanner;
/**
 *
 * @author DAW
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int max,min,c,suma,n,media;
        System.out.println("Introduce un numero: ");
        n=scan.nextInt();
        max=n;
        min=n;
        suma=0;
        c=0;
        while(n!=0){
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }
            suma=suma+n;
            c=c+1;
            System.out.println("Introduce otro numero: ");
            n=scan.nextInt();
        }
        media=suma/c;
        System.out.println("El maximo es: "+max);
        System.out.println("El minimo es: "+min);
        System.out.println("La media es: "+media);
    }
    
}
