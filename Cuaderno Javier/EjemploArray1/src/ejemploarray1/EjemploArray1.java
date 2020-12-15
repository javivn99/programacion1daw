//Crea un array que contenga los numeros del 1 al 100. Muestralos por pantalla.


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarray1;

/**
 *
 * @author Javi
 */
public class EjemploArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] numeros = new int[100];
        
        for (int i=0; i<100; i++){
            numeros[i]=i+1;
            System.out.println(numeros[i]);
        }
    }
    
}
