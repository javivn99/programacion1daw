/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_set_1;


import java.util.HashSet;
import java.util.Iterator;
import misClases.*;
/**
 *
 * @author DAW
 */
public class Interface_SET_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Definir 5 instancias de la Clase Producto
        
        Producto pan = new Producto ("Pan",6);
        Producto leche = new Producto ("Leche",2);
        Producto manzanas = new Producto ("Manzanas",5);
        Producto brocoli = new Producto ("Brocoli",2);
        Producto cerdo = new Producto ("Carne",2);
        Producto vacuno = new Producto ("Carne",3);
        
        
        //Definir HashSet
        
        HashSet lista = new HashSet();
        
        lista.add(pan);
        lista.add(leche);
        lista.add(manzanas);
        lista.add(brocoli);
        lista.add(cerdo);
        lista.add(vacuno);
        
        //Imprimir el HashSet
        //Solo se imprimen 5 porque hay 2 "CARNES"
        // UN SET NO PERMITE ELEMENTOS DUPLICADOS
        System.out.println(" =======================================================================");
        System.out.println(" Lista del mercado con " + lista.size() + " productos: ");
        
        
        //ITERATOR PARA EXTRAE E IMPRIMIR VALORES
        
        for ( Iterator it = lista.iterator(); it.hasNext();) {
            
            Object objeto = it.next();
            
            Producto producto = ( Producto ) objeto;
            
            System.out.println( producto );
        }
        
        //No es posible eliminar elementos por indice
        //En un HashSet solo se elimina por valor de Objeto
        
        
        lista.remove(manzanas);
        
        System.out.println(" =======================================================================");
        System.out.println(" Lista del mercado con " + lista.size() + " productos ");
                
              
        for (Iterator it2 = lista.iterator(); it2.hasNext();) {
            Producto producto = (Producto)it2.next();
            System.out.println(producto);
        }
        
        //Eliminar todos los valores del HashSet
        
        lista.clear();
        System.out.println(" Lista del mercado con " + lista.size() + " productos ");
        
        }
  
}
    

