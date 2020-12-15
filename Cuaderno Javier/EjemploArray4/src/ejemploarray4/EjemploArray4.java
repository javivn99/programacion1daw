//Crea un array insertando numeros aleatorios entre el 0 y el 100. Muestralos por pantalla.


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarray4;

import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class EjemploArray4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int longitud= Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud del array"));
        
        int [] array = new int[longitud];
        
        double n;
        
        
        
        for(int i=0; i<array.length;i++) {
            
            n=(int) (Math.random()*100);
            array[i]=(int) n;
            System.out.println(array[i]);
            
        }
        
    }
    
}
