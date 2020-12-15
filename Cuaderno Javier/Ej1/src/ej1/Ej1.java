/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;
/**
 *
 * @author Javi
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, b, c;
        System.out.println("Introduce el primero numero (a): ");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero (b): ");
        b = sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("El valor de a es: " +a + " y el valor de b es: " +b);
    }
    
}
