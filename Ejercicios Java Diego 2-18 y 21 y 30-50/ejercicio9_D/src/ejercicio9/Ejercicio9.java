/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author DAW
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        System.out.println("introduce un nº: ");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        if(n==0){
            System.out.println("El nº no es par ni impar");
        }else{
            if(n%2==0){
                System.out.println("El nº es par");
            }else{
                System.out.println("El nº es impar");
            }
        }
        
    }
    
}
