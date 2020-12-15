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
public class Producto implements Comparable{
    
    private String nombre;
    private int cantidad;

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return ( "Nombre: " + nombre +"\t" + "Cantidad: " + cantidad );
    }

    public String getNombre() {
        return nombre;
    }

    public String getCantidad() {
        return String.valueOf(cantidad);
    }
    
    public boolean equals(Object objeto) {
        
        //indica en base al nombre se iguala el objeto
        if (objeto == null) return false;
        Producto producto = (Producto)objeto;
        if(this.getNombre().equals(producto.getNombre())) return true;
        
        return false;
    }
    
    
    public int hasCode() {
        
        //retorna un identificador unico del objeto
        return this.getNombre().hashCode();
    }
        //LOS ORDENA POR LETRA MINUSCULA
    public int compareTo(Object objeto) {
        
        //indica base a que atributos se compara el objeto
        //Devuelve +1 si this es > que objeto
        //Devuelve -1 si this es < que objeto
        //Devuelve 0 si son iguales
        
        Producto producto = (Producto)objeto;
        String nombreObjeto = producto.getNombre().toLowerCase();
        String cantidadObjeto = producto.getCantidad().toLowerCase();
        
        String nombreThis = this.getNombre().toLowerCase();
        String cantidadThis = this.getCantidad().toLowerCase();
        
        
        
        
        return (( nombreThis + cantidadThis).compareTo(nombreObjeto + cantidadObjeto));
        
    }
}
