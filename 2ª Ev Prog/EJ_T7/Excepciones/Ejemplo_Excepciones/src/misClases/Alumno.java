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
public class Alumno {
    
    String nombre, apellidos;
    
    public Alumno(String nombre, String apellidos) throws Exception {
        
        if (nombre==null || apellidos==null)
            throw new Exception ("Argumentos no Validos");
        // si el cosntructor lanza la excepcion, el objeto no se crea
    }
    
}
