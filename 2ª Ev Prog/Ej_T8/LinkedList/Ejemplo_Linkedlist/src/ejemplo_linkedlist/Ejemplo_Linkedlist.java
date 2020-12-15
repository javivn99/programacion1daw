/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_linkedlist;

import java.util.LinkedList;

/**
 *
 * @author DAW
 */
public class Ejemplo_Linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList lista = new LinkedList();
        
        lista.add(new miClase(1,"clase1"));
        lista.add(new miClase(2,"clase2"));
        lista.add(new miClase(3,"clase3"));
        
        //muestro la lista
        System.out.println("Los elementos de esta lista son: ");
        
        for ( int i = 0; i < lista.size(); i++) {
            
            miClase obj =(miClase) lista.get(i);
            System.out.println(obj.getNombre());
        }
        
        //añado un cuarto elemento
        System.out.println("Añado un cuarto elemento: ");
        lista.addFirst(new miClase(4,"clase4"));
        
        
        //añado un quinto elemento a la lista
        System.out.println("Añado un quinto elemento: ");
        lista.addLast(new miClase(5,"clase5"));
       
        
        //mostrar primer elemento de la lista
        System.out.println("Muestro el primer elemento de la lista: ");
        System.out.println(lista.getFirst());
        
        //borrar ultimo elemento de la lista
        System.out.println("Borro el ultimo elemento de la lista: ");
        System.out.println(lista.removeLast());
        
        //borrar lista
        System.out.println("Elimino toda la lista ");
        lista.clear();
        
        
        }
        
}
    

