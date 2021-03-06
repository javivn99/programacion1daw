/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatreemap;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author DAW
 */
public class AgendaTreeMap {
    

    public static void main(String[] args) {
        
        // Definimos un TreeMap
        
        TreeMap agenda = new TreeMap();
        
        // Agregar partes "clave"-"valor" al HashMap
        agenda.put("Doctor", "(+52)-4000-5000");
        agenda.put("Casa", "(888)-4500-3400");
        agenda.put("Hermano", "(575)-2042-3233");
        agenda.put("Tio", "(421)-1010-0020");
        agenda.put("Suegros", "(334)-6105-4334");
        agenda.put("Oficina", "(304)-5205-8454");
        agenda.put("Abogado", "(756)-1205-3454");
        agenda.put("Papa", "(55)-9555-3270");
        agenda.put("Tienda", "(874)-2400-8600");
        // El orden del TreeMap refleja un orden ascendente
        // en sus elementos independientemente del orden de insercion.
        // Debido al uso de String se refleja un orden alfabetico
        
        mostrarMapa(agenda);
        
        
        // Definir dos TreeMap nuevos
        SortedMap agendaAO = agenda.subMap("A", "O");
        SortedMap agendaPZ = agenda.tailMap("P");
        System.out.println("---- Agenda A-O ----");
        mostrarMapa(agendaAO);
        System.out.println("---- Agenda P-Z ----");
        mostrarMapa(agendaPZ);
        }
        
        public static void mostrarMapa(Map agenda) {
            
            System.out.println(" Agenda con " + agenda.size() +
            " telefonos");

            for( Iterator it = agenda.keySet().iterator(); it.hasNext();) {
            String clave = (String)it.next();
            String valor = (String)agenda.get(clave);
            System.out.println(clave + " : " + valor);
        }
   
    }
    
}
