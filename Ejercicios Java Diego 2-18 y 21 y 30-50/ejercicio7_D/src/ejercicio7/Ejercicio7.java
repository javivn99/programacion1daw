/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;
/**
 *
 * @author DAW
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int niños,niñas;
        float pniños,pniñas;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce nº niños: ");
        niños=scan.nextInt();
        System.out.println("Introduce nº niñas: ");
        niñas=scan.nextInt();
        pniños=niños*100/(niños+niñas);
        pniñas=niñas*100/(niños+niñas);
        System.out.println("El % de niños es: "+pniños);
        System.out.println("El % de niñas es: "+pniñas);
    }
    
}
