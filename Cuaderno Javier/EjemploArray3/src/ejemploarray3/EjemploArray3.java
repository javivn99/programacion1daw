//Crea un array de una longitud que determine el usuario y que le permita insertar numeros entre el 0 y 10.


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarray3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class EjemploArray3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        int longitud= Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud del array"));
        
        int [] array = new int[longitud];
        
        int n;
        
        for (int i=0;i<array.length;i++){
            
            System.out.println("Introduce un numero en la posicion " +i);
            
            do{
                n = sc.nextInt();
                
                if(!(n>0 && n<=10)){
                    System.out.println("Error. Introduce un numero entre 0 y 10." + " Inserte un numero en la posicion "+i);
                }
                
            } while(!(n>0 && n<=10));
            
            array[i]=n;
        }
        
        
        System.out.println("Los numeros introducidos son:");
        for (int numeros=0; numeros<array.length; numeros++){
            System.out.println(array[numeros]);
        }
    }
    
}
