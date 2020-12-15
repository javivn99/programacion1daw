/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

import java.util.GregorianCalendar;

/**
 *
 * @author DAW
 */
public class Trabajador {
    
    private String nombre;
    private String puesto;
    private String direccion;
    private String telefono;
    private GregorianCalendar fecha_nacimiento;
    private GregorianCalendar fecha_contrato;
    private String NSS;
    
    
    public Trabajador ( String nombre, String NSS) {
        
        this.nombre = nombre;
        this.NSS = NSS;
    }
    
    public boolean equals ( Trabajador t) {
        
        return this.NSS.equals(t.NSS);
    }

    public String toString () {
        
        return nombre + " (NSS " + NSS + ")";
    }
    
    
}
