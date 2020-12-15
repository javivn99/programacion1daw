/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paso_arrays_2;

/**
 *
 * @author DAW
 */
public class Paso_Arrays_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        
        
        modificarArray(a);
        System.out.println("");
        for (int i = 0; i< a.length; i++ )
            System.out.print(a[i]+","); 
    }
    public static void modificarArray(int a[]){
        int b[] = {4,5,5};
        a[0] = b[0];
        b[1] = a[1];
        a = b;
        for (int i = 0; i< a.length; i++)
            System.out.print(a[i]+",");
    }
}
