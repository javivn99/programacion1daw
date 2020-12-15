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
    
    protected String nombre;
    protected String direccion;
    protected int edad;
    protected double sueldo;
    
    public Persona(String nombre, String direccion, int edad, double sueldo) {
        
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.sueldo= sueldo;
        
      }
    
    
}
