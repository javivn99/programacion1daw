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
public class Producto {
    
    private String nombre;
    private int cantidad;

    public Producto(String s, int i) {
        nombre = s;
        cantidad = i;
    }

    @Override
    public String toString() {
        return ( "Nombre: " + nombre + "  Cantidad: " + cantidad );
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public boolean equals( Object objeto) {
        
        if (objeto == null) return false;
        
        Producto product = (Producto)objeto;
        if (this.getNombre().equals(product.getNombre()))
            return true;
        
            return false;
    }
    
    public int hashCode() {
        
        return this.getNombre().hashCode();
    }
    
    
    
}
