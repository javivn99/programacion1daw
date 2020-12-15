/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_t6;

import java.util.GregorianCalendar;

/**
 *
 * @author DAW
 */
public class Paciente {
    
    private String nombre;
    private int dni;
    private String diagnostico;
    private String tratamiento;
    private GregorianCalendar fechaEntrada;
    private int habitacion;
    private GregorianCalendar fechaSalida;
    private static boolean[] habitacionesHospital= new boolean[200];
    
    
    public Paciente(String nombre, int dni, String diagnostico, String tratamiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.diagnostico= diagnostico;
        this.tratamiento=tratamiento;
        
    }

    public void Ingresar(GregorianCalendar fechaEntrada) {
        
        this.fechaEntrada= fechaEntrada;
        for (int i=0; i < habitacionesHospital.length; i++)
        if (habitacionesHospital[i]==false)
        { habitacion=i; habitacionesHospital[i]=true; return;}
    
    }
    
    public void DarAlta(GregorianCalendar fechaSalida) {
        
        this.fechaSalida=fechaSalida;
        habitacionesHospital[habitacion]=false;
        
    }
    
    public int Habitacion () {return habitacion;
    
    }
    
    }

