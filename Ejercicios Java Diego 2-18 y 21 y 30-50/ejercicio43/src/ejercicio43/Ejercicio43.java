/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio43;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i;
        String mejorpagado=null;
        String[] nombres=new String[20];
        double[] sueldos=new double[20];
        double mejorsueldo=0;
        for(i=0;i<nombres.length;i++){
            scan.nextLine();
            System.out.println("nombres["+(i+1)+"]: ");
            nombres[i]=scan.nextLine();
            System.out.println("sueldos["+(i+1)+"]:");
            sueldos[i]=scan.nextDouble();
            if(sueldos[i]>mejorsueldo){
                mejorsueldo=sueldos[i];
                mejorpagado=nombres[i];
            }
        }
        System.out.println("El empleado con mas sueldo es "+mejorpagado+" y tiene un sueldo de "+mejorsueldo);
        
    }
    
}
