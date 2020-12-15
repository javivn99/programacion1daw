/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.switch1;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class ExSwitch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
       
       int opcion;
       
       System.out.println("Elige una opcion: \n 1: Cuadrado \n 2: Rectangulo \n 3: Triangulo \n 4: Circulo");
       opcion=sc.nextInt();
       
       switch(opcion){
           case 1:
               int lado;
               System.out.println("Introduce la medida del lado");
               lado = sc.nextInt();
               System.out.println("El area del cuadrado es: " + lado*lado);
               break;
               
           case 2:
               int ladoc, ladol;
               System.out.println("Introduce la medida del lado largo: ");
               ladol=sc.nextInt();
               System.out.println("Introduce la medida del lado corto: ");
               ladoc=sc.nextInt();
               System.out.println("El area del rectangulo es: " + ladol*ladoc);
               break;
               
           case 3:
               int base, altura;
               System.out.println("Introduce la longitud de la base: ");
               base = sc.nextInt();
               System.out.println("Introduce la longitud de la altura: ");
               altura = sc.nextInt();
               System.out.println("El area del triangulo es: " + (base*altura)/2);
               break;
               
           case 4:
               int radio;
               System.out.println("Introduce la longitud del radio: ");
               radio = sc.nextInt();
               System.out.println("El area del circulo es: " + 3.14*radio);
               break;
               
           default:
               System.out.println("La opcion no es correcta");
       }
    }
    
}
