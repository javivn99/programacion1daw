/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicar;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
       
       int n, z=1;
       
       n=Integer.parseInt(JOptionPane.showInputDialog("Introduce la tabla que quieres consultar"));
       
       System.out.println("La tabla del " +n+ " es:");
           
           for (z=1; z<=10; z++) {
               
               System.out.println(+n+ "x" +z+ "= " +n*z);
           }
    }
    
}
