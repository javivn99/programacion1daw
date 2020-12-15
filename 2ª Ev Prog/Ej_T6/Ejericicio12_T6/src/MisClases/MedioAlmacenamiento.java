/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author DAW
 */
public class MedioAlmacenamiento {
    
    protected String nombre;
    protected int capacidadMb;
    
    public MedioAlmacenamiento (String nombre, int capacidadMb) {
        
        this.nombre = nombre;
        this.capacidadMb = capacidadMb;
    }
    
    public void mostrar() {
        
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Capacidad (Mb): " + capacidadMb);
        
    }
}
