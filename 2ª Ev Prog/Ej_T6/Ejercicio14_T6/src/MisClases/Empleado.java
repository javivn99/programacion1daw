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
public class Empleado extends Trabajador {
    
    private double sueldo;
    private double impuestos;

    private final int PAGAS = 14;
    
    public Empleado ( String nombre, String NSS, double suledo) {
        
        super(nombre, NSS);
        
        this.sueldo = sueldo;
        this.impuestos = 0.3 / sueldo;
    }
    
    public double calcularPaga() {
        return (sueldo - impuestos) / PAGAS;
    }
    
    public String toString() {
        return "Empleado " + super.toString();
    }
}
