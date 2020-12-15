/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

/**
 *
 * @author DAW
 */
public class Persona {
    
    int edad;
    
    public void ponEdad (int ed) throws EdadFueraDeRangoException {
        
        if ((ed < 0) || (ed > 130))
            
            throw new EdadFueraDeRangoException ("Demasiado joven o demasiado viejo");
        
        edad = ed;
    }
    
}
