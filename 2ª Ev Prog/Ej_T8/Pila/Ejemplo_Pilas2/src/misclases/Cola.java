/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;


/**
 *
 * @author DAW
 */
public class Cola {

    static void InsertarCola (Queue cola, int num) {
        
        cola.add(num);
        System.out.println("Insertado: " + num);
        System.out.println("Contenido: " + cola);
        
    }
    
    static void ExtraerCola (Queue cola) {
        
        System.out.print("Extraccion: ");
        Integer a = (Integer)cola.remove();
        System.out.println(a);
        System.out.println("Contenido: " + cola);
        
    }
    
    public static void cola() {
        
        Queue <Integer> cola = new LinkedList();
        System.out.println("Cola: " + cola);
        InsertarCola( cola, 3);
        InsertarCola( cola, 26);
        InsertarCola( cola, 35);
        ExtraerCola(cola);
        ExtraerCola(cola);
        ExtraerCola(cola);
    
    
    try {
            ExtraerCola(cola);
        }
        
        catch(NoSuchElementException e) {
            
           System.out.println("La cola esta vacia: ");
            
        }
    
    }

}
