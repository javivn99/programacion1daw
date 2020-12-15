/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author DAW
 */
public class AppSet {
    
    
    public static void Conjunto() {
        Set <Integer> conjunto = new HashSet <Integer>();
        conjunto.add(5);
        conjunto.add(3);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(5);
        //solo hay 3 elementos, aunque sean 5, ya que se repiten
        
        System.out.println(" Numero de elementos: " + conjunto.size());
        
        for (int n: conjunto) {
            
            System.out.print(n + " ");
        }
        
        System.out.println();
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Conjunto(); 
        
    }
    
}
