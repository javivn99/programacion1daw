/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionscuatro;

import java.util.HashMap;
import java.util.Iterator;
import misClases.*;
public class CollectionsCuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        HashMap<String, Usuario> estudiantesTecnicas = new HashMap<String, Usuario>();
        //Insertar datos
        
        Usuario objUsuario1 = new Usuario("Juan", 15);
        Usuario objUsuario2 = new Usuario("Pedro", 17);
        Usuario objUsuario3 = new Usuario("Maria", 16);
        
        estudiantesTecnicas.put("Cristian", objUsuario1);
        estudiantesTecnicas.put("Julian", objUsuario2);
        estudiantesTecnicas.put("Alba", objUsuario3);
        
        //¿Qué pasa si descomentan la línea siguiente y vuelven a compilar?
        //estudiantesTecnicas.put("Julian", 786);
        //recuperando todas las claves
        
        System.out.println("claves " + estudiantesTecnicas.keySet());
        //recuperando todas las claves
        
        System.out.println("valores " + estudiantesTecnicas.values());
        //recuperando el valor de la clave Julian
        
        System.out.println("valores clave Julian " + estudiantesTecnicas.get(103));
        //recorrer los elementos de la lista
        
        for (Iterator it2 = estudiantesTecnicas.keySet().iterator(); it2.hasNext(); )
        {
        String clave = (String)it2.next();
        Usuario objUsuario = estudiantesTecnicas.get(clave);
        System.out.println(" Valores recuperado clave " + clave + " valor " +
        objUsuario.getNombre());
        }
    }
}
    

