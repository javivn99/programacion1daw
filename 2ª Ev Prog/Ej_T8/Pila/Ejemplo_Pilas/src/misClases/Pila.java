/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author DAW
 */
public class Pila {
        
    public static void InsertarPila( Stack pila, int num) {
        
        pila.push(num);
        System.out.println("Insertado: " + num);
        System.out.println("Contenido: " + pila);
        
    }
    
    static void ExtraerPila(Stack pila) {
        
        System.out.print("Extraccion: ");
        Integer a = (Integer) pila.pop();
        System.out.println(a);
        System.out.println("Contenido: " + pila);
    
    }
    
    public static void pila() {
        
        Stack pila = new Stack();
        System.out.println("Pila: " + pila);
        InsertarPila( pila, 3);
        InsertarPila( pila, 26);
        InsertarPila( pila, 35);
        ExtraerPila (pila);
        ExtraerPila (pila);
        ExtraerPila (pila);
        try {
            ExtraerPila (pila);
        }
        
        catch(EmptyStackException e) {
            
            //cola.isEmpty()
            System.out.println("La pila esta vacia: ");
            
        }
    }
    
    
    
    
    
}
