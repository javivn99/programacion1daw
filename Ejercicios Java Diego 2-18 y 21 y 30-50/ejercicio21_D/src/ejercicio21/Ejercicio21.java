/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

import javax.swing.JOptionPane;

/**
 *
 * @author DAW
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String textoA=JOptionPane.showInputDialog("Introduce el valor de a");
        int a=Integer.parseInt(textoA);
        String textoB=JOptionPane.showInputDialog("Introduce el valor de a");
        int b=Integer.parseInt(textoA);
        String textoC=JOptionPane.showInputDialog("Introduce el valor de a");
        int c=Integer.parseInt(textoA);
        
        double discriminante=Math.pow(b,2)-(4*a*c);
        
        System.out.println(">>"+discriminante);
        
        if(discriminante>0){
            double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
            double x2=((b*(-1))+Math.sqrt(discriminante))/(2*a);
            
            System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
    }
    
}
