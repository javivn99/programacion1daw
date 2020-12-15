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
public class Empleado {
    
    String nombre;
    int numEmpleado, sueldo;
    
    static private int contador = 0;
    
    
    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        numEmpleado = ++contador;
    }
    
    public void aumentarSueldo(int aumento) {
        sueldo += (int)(sueldo*aumento/100);
    }
    
    public String toString() {
        return " Num. empleado" + numEmpleado +" Nombre: " + nombre + " Sueldo: " + sueldo; 
    }
}
