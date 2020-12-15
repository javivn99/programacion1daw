/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14_t6;

import MisClases.*;
/**
 *
 * @author DAW
 */
public class Ejercicio14_T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Trabajador trabajador;
        Empleado empleado;
        Consultor consultor;
        
        trabajador = new Trabajador("Juan", "456");
        empleado = new Empleado ("Jose", "123", 24000.0);
        consultor = new Consultor ("Juan", "456", 10, 50.0);
        
    }
    
}
