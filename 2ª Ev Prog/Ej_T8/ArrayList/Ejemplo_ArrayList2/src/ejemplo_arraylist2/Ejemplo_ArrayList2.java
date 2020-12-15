/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_arraylist2;

import java.util.ArrayList;

/**
 *
 * @author DAW
 */
public class Ejemplo_ArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
        
        Persona p1 = new Persona("Felix", 67);
        Persona p2 = new Persona("Gloria", 57);
        Persona p3 = new Persona("Alex", 12);
        
        
        ArrayList lista = new ArrayList();
        
        lista.add("hello");
        lista.add(",");
        lista.add("are");
        lista.add("you");
        lista.add("?");
         
        for (int i = 0; i < lista.size(); i++)
            System.out.println(lista.get(i) + " ");
        
        
        
    }
    
}


    

