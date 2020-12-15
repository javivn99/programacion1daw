//No funciona pero yo creo que es asi

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej43;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String maxnombre=null;
        int maxsueldo=0, i;
        String [] nombre = new String[20];
        int [] sueldo = new int[20];
        
        for (i=0; i<20; i++) {
            sc.nextLine();
            System.out.println("Nombre del empleado: ");
            nombre[i] = sc.nextLine();
            System.out.println("Introduce su sueldo: ");
            sueldo[i] = sc.nextInt();
        }
        
        if (sueldo[i]>maxsueldo){
            maxsueldo=sueldo[i];
            maxnombre=nombre[i];
        }
        
        System.out.println("El empleado con mayor sueldo es "+maxnombre+ " con " +maxsueldo+ "€ de sueldo");
    }
    
}
