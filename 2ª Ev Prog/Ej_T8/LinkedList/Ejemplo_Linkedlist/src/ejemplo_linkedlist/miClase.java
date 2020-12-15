/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_linkedlist;

/**
 *
 * @author DAW
 */
public class miClase {
    
    private int id_class;
    private String nombre; 

    public miClase(int id_class, String nombre) {
        this.id_class = id_class;
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + nombre + '}';
    }
}
