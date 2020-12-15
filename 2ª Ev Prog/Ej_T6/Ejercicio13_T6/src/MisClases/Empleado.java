/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author DAW
 */
public class Empleado {
    
    protected String nombre;
    protected double salario;
    protected GregorianCalendar fechaContratacion;
    
    public Empleado(String n, double s, GregorianCalendar d) {
        
        nombre = n;
        salario = s;
        fechaContratacion = d;
    }
    
    public String getNombre() {
        
        return nombre;
    }
            
    public void setNombre(String nuevoNombre) {
        
        nombre = nuevoNombre;
    }
    
    public double getSalario() {
            
            return salario;
    }
    
    public void aumentarSalario(double porPorcentaje) {
        
        salario *=1 + porPorcentaje / 100;
    }
    
    public GregorianCalendar getfechaContratacion() {
        
        return fechaContratacion;
    }

    public int añoContratacion() {
            
            return fechaContratacion.get(Calendar.YEAR);
    
    }
    
    public String toString() {
        
        String cadena = "nombre=" + nombre + ", salario=" + salario + ", fecha contratación="
        + fechaContratacion.get(Calendar.DAY_OF_MONTH) + "/" + fechaContratacion.get(Calendar.MONTH) +
        "/" + fechaContratacion.get(Calendar.YEAR);
        
        return cadena;
    }
}
