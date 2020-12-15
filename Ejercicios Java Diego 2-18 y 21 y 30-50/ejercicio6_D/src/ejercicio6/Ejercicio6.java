/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author DAW
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce un nº: ");
        n1=scan.nextInt();
        if(n1<=0){
            System.out.println("Error");
        }else{
            System.out.println("El nº es: "+n1);
            System.out.println("Y su cuadrado es: "+(n1*n1));
            System.out.println("Y su raíz es: "+(sqrt(n1)));
        }
    }
    
}
