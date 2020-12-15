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
public class Directivo extends Empleado {
    
    private String nombreSecretaria;
    
    public Directivo(String n, double s, GregorianCalendar d) {
    
        super(n, s, d);
        nombreSecretaria = "";
    }
    //A esto se le llama sobrescribir un método (overriding)
    
    public void aumentarSalario(double porPorcentaje) {
    // añadir 1/2% bonus de por cada año de servicio
        
        GregorianCalendar today = new GregorianCalendar();
        double bonus = 0.5 * (today.get(Calendar.YEAR)) - añoContratacion();
        super.aumentarSalario(porPorcentaje + bonus);
        
    }
    
    public void setNombreSecretaria(String n) {
        
        nombreSecretaria = n;
   
    }
    
    public String getNombreSecretaria() {
        
    
        return nombreSecretaria;
    }
    
}
