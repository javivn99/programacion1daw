/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej42;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int suma=0, media, up=0, down=0;
        System.out.println("Indica cuantas alturas vas a meter");
        int i = sc.nextInt();
        

        if (i>0){
            
            String [] nombres = new String [i];
            int [] persona = new int [i];
            
            for (i=0;i<persona.length;i++) {
                sc.nextLine();
                System.out.println("Introduce el nombre");
                String nombre = sc.nextLine();
                System.out.println("Introduce la altura de " +nombre);
                int altura = sc.nextInt();
                persona[i]=altura;
                suma=suma+persona[i];
            }
            
            media = suma/persona.length;
            System.out.println("La media de altura es " +media+ "cm");
            
            for (i=0;i<persona.length;i++){
                if (persona[i]>media){
                    up++;
                    
                } else {
                    down++;
                    
                }
            }
            System.out.println("El numero de personas por encima de la media es " +up);
            System.out.println("El numero de personas por debajo de la media es " +down);
        }
    }
    
}
