/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parquemovilapp;

/**
 *
 * @author DAW
 */

import java.util.ArrayList;
import misClases.*;


public class ParqueMovilApp {
    
    private static ArrayList<Coche> parque = new ArrayList<Coche>();
    
    public  static Coche coche(int pos) {
        //posicion = pos
        return parque.get(pos);
    }
    
        //añado un coche al final
    public static void add(Coche c) {
        
        parque.add(c);
    }
    
    
    //elimino un coche
    public static boolean elimina(Coche c) {
        
        return parque.remove(c);
    }
    
    
    //cambiar color del coche
    public static void pintaCoches(int pos, Coche.Color color) {
        
        parque.get(pos).pinta(color);
        
    }
    
    
    //pintar todos los coches del parque
   public static void PintarTodoslosCoches(Coche.Color color) {
        
        for (Coche c : parque) {
            c.pinta(color);
    }
    
   }
    
    //Devuele String con todos los elementos de la coleccion
    public String toString() {
        
        return parque.toString();
    }



    public static void main(String[] args) {
        
// crear coches
        
        Coche cRojo = new Coche("1717", Coche.Color.ROJO);
        Coche cAzul = new Coche("2589", Coche.Color.AZUL);
        Coche cVerde = new Coche("4563", Coche.Color.VERDE);
        
        
      
        
        //añado los coches al parque
        add(cRojo);
        add(cAzul);
        add(cVerde);
        
        //Mostrar los coches una vez añadidos
        
        System.out.println("El coche de la posicion 0 es" + parque + " " + coche(0));
        System.out.println("El coche de la posicion 1 es" + parque + " " + coche(1));
        System.out.println("El coche de la posicion 2 es" + parque + " " + coche(2));
        System.out.println("El parque queda asi: " + parque);
        
        //pintar todos los coches de azul
        PintarTodoslosCoches(Coche.Color.AZUL);
        //mostrar array coches azules
        System.out.println("El parque queda así: "+ parque);
        
        //se pintan todos los coches de verde
        for (int i=0; i < parque.size(); i++) {
            
            pintaCoches(i,Coche.Color.VERDE);
        }
        
        //mostrar el array de coches verdes
        System.out.println("El parque queda así:" + parque);
        
        //elimino el primer coche
        System.out.println("Elimino el primer coche");
        elimina(cRojo);
        
        
        //muestro el parque finalmente
        System.out.println("El parque queda asi: " + parque);
        
        
        
        
    
        
        
    
        
        
        
        
        
    }
    
}
