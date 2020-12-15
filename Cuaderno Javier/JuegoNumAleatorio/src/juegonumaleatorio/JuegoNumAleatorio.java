/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegonumaleatorio;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class JuegoNumAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
       
       int numero, intentos=1;
       double aleatorio;
       
       aleatorio = (int)(Math.random()*100);
       
       System.out.println("Introduce un numero del 0 al 100");
       numero = sc.nextInt();
       
       while (aleatorio!=numero) {
           
           intentos++;
           
           if (aleatorio>numero) {
               
               System.out.println("El numero es mayor");
               numero = sc.nextInt();
               
           } else {
               
               System.out.println("El numero es menor");
               numero = sc.nextInt();
           }
       }
       
       System.out.println("Enhorabuena lo has conseguido en " +intentos+ " intentos");
    }
    
}
