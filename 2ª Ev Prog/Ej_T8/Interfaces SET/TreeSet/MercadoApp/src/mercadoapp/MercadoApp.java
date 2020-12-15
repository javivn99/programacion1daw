/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadoapp;


import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;
import misClases.*;
/**
 *
 * @author DAW
 */
public class MercadoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Definir 5 instancias
        Producto pan = new Producto("Pan", 6);
        Producto leche = new Producto("Leche", 2);
        Producto manzanas = new Producto("Manzanas", 5);
        Producto brocoli = new Producto("Brocoli", 2);
        Producto brocoli2 = new Producto("Brocoli", 2);
        Producto cerdo = new Producto("Carne", 2);
        Producto vacuno = new Producto("Carne", 3);
        

        // Definir un TreeSet
        TreeSet lista = new TreeSet();
        lista.add(pan);
        lista.add(leche);
        lista.add(manzanas);
        lista.add(brocoli);
        lista.add(brocoli2);
        lista.add(cerdo);
        lista.add(vacuno);
        
        // Imprimir contenido de TreeSet
        // Aunque se agregan 6 elementos, el TreeSet solo contiene 5
        // TreeSet no permite elementos duplicados,
        // TreeSet detecta que el elemento "Carne" esta duplicado
        // Notese que el orden del TreeSet refleja un orden ascendente
        
        mostrarLista(lista);
        
        
        // No es posible eliminar elementos por indice
        // Un TreeSet solo elimina por valor de Objeto
        
        lista.remove(manzanas);
        mostrarLista(lista);
        
        // Eliminar todos los valores del TreeSet
        lista.clear();
        mostrarLista(lista);
        
     }
    
    public static void mostrarLista(Collection lista) {
           
           //LA LISTA ESTA ORDENADO POR NOMBRE POR  EL CompareTo
           System.out.println("\n Lista del mercado con " + lista.size() + " productos");
           for( Iterator it = lista.iterator(); it.hasNext();)
           {
           Producto producto = (Producto)it.next();
           System.out.println("\t" + producto);
           }   
    }
}
