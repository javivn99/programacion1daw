/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_excepciones;

import misClases.Alumno;

/**
 *
 * @author DAW
 */
public class Ejemplo_Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
              Alumno alum = new Alumno (null, "Suarez");
           
            }
        
        catch(Exception e) {
            
            System.out.println("Excepcion: " + e.getMessage());
        }
    
    }
}
