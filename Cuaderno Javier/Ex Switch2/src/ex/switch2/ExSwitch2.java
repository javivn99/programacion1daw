/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.switch2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class ExSwitch2 {

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
               int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida del lado"));
               System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
               break;
               
           case 2:
               int ladoc= Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida del lado menor"));
               int ladol= Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida del lado mayor"));;
               System.out.println("El area del rectangulo es: " + ladol*ladoc);
               break;
               
           case 3:
               int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la lognitud de la base: "));
               int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud de la altura: "));
               System.out.println("El area del triangulo es: " + (base*altura)/2);
               break;
               
           case 4:
               int radio= Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud del radio: "));
               System.out.print("El area del circulo es: ");
               System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2))); //Con printf hacemos que solo nos saque 2 decimales
               break;
               
           default:
               System.out.println("La opcion no es correcta");
       }
    }
    
}
