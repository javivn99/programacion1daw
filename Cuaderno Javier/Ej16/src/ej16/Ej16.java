/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String clave;
        int c=0;
        boolean clave_correcta=false;
        while (c<3 && clave_correcta==false) {
            System.out.println("Introduce la clave: ");
            clave = sc.nextLine();
            if (clave.equals("eureka")) {
                System.out.println("Clave correcta");
                clave_correcta=true;
            }
            c=c+1;
            if (c==3 && clave_correcta==false) {
                System.out.println("Has agotado los 3 intentos");
            }
        }
    }
    
}
