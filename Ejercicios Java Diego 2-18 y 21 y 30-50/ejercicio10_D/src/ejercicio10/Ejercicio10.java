/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        System.out.println("introduce un nº: ");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        while(n<=0){
            System.out.println("Escribe un nº mayor que cero");
            n=scan.nextInt();
        }
        if(n%2==0){
            System.out.println("El nº es par");
        }else{
            System.out.println("El nº es impar");
        }
        
    }
    
}
