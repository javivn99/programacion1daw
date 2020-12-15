/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres_hanoi;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Torres_Hanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();
        Hanoi(n,1,2,3);  //1:origen  2:auxiliar 3:destino
        
    public static void Torres_Hanoi {
    int n, origen, auxiliar, destino;
    
    if(n==1)
    System.out.println("mover disco de " + origen + " a " + destino);
        else{
        Hanoi(n-1, origen, destino, auxiliar);
        System.out.println("mover disco de "+ origen + " a " + destino);
        Hanoi(n-1, auxiliar, origen, destino);
        
        }
    }
}
