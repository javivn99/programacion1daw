/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio42;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,n,supmedia=0,infmedia=0;
        double media=0.0;
        System.out.println("Introduce un numero de personas: ");
        n=scan.nextInt();
        if(n>0){
            String[] personas=new String[n];
            double[] altura=new double[n];
            for(i=0;i<n;i++){
                scan.nextLine();
                System.out.println("La persona: ");
                personas[i]=scan.nextLine();    
                System.out.println("Tiene de altura: ");
                altura[i]=scan.nextDouble();
                media=media+altura[i];
            }
            media=media/n;
            System.out.println("La altura media es: "+media);
            for(i=0;i<n;i++){
                if(altura[i]>media){
                    supmedia++;
                }else{
                    infmedia++;               
                }          
            }
            System.out.println("Hay "+supmedia+" personas mas altas que la media");
            System.out.println("Hay "+infmedia+" personas mas bajas que la media");
        }        
    }
    
}
