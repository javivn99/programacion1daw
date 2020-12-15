//Con el anterior array, calcula la suma y la media de todos sus valores.


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarray2;

/**
 *
 * @author Javi
 */
public class EjemploArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] numeros = new int[100];
        int suma=0, media;
        
        for (int i=0; i<100; i++){
            numeros[i]=i+1;
            suma=suma+numeros[i];
            
        }
        media = suma/numeros.length;
        
        System.out.println("La suma es " +suma);
        System.out.println("La media es " +media);
    }
    
}
