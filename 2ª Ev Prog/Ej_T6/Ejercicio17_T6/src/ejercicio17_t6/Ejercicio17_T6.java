/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17_t6;

import misClases.Gato;
import misClases.Perro;
import misClases.Polimorfismo;
import static misClases.Polimorfismo.muevete;
/**
 *
 * @author DAW
 */
public class Ejercicio17_T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Gato tomas= new Gato();
        Perro lucas = new Perro();
        
        muevete(tomas);
        muevete(lucas);
        
        
        
    }
    
}
