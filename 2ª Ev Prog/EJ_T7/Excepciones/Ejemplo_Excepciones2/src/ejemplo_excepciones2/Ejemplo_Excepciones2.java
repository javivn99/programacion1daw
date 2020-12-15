/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_excepciones2;

import misClases.*;

/**
 *
 * @author DAW
 */
public class Ejemplo_Excepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p= new Persona();
        
        try {
            
            p.ponEdad(150);
        }
        
        catch (EdadFueraDeRangoException e) {
            
            System.out.println("Se ha producido la exception");
            System.out.println(e.toString());
        }
    }
    
}
