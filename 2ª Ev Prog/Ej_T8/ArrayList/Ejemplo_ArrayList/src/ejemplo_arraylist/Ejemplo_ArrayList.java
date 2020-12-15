/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DAW
 */
public class Ejemplo_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p1 = new Persona("Manolo", 65);
        Persona p2 = new Persona("Magdalena", 47);
        Persona p3 = new Persona("Eduardo", 29);
        
        
        ArrayList mi_lista = new ArrayList();
//agregamos unos elementos: perosnas.        
        mi_lista.add(p1);
        //manolo=0
        mi_lista.add(p2);
         //Magdalena=1
        mi_lista.add(p3);
         //Eduardo=2
         
        mi_lista.remove(1);
        //quitamos el elemento 1 de array= Magdalena, en este caso.
        
        
        System.out.println(mi_lista);
        
        Iterator it = mi_lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
                   
        
    }
    
    }
    
}
