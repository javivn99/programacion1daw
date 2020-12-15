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
    
    private String id;
    private String nombre;
    private String apellidos;
    

    public Persona() {
        
        this.id = "";
        this.nombre = "";
        this.apellidos = "";

    }

    public Persona(String id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        
        if (o instanceof Persona) {
            
            Persona p = (Persona) o;
            String nombre2 = p.getNombre();
            
            if (nombre2.equals(nombre))
                
                return true;
            
            else
                
                return false;
        }
        
        else
            
            return false;
       
        }
        
}
    
    
    
    
    
    
    

