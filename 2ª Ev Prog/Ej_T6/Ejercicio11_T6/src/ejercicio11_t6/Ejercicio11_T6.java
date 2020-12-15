/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11_t6;


import MisClases.*;
/**
 *
 * @author DAW
 */
public class Ejercicio11_T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ejecutivo eje= new Ejecutivo ("Amancio", 4500, 750);
        Empleado emple = new Empleado ("Manolo", 1500);
        System.out.println(emple);
        System.out.println(eje);
        System.out.println("Los incentivos de: " + eje + " son: " + eje.getIncentivos());
        
}

    
}
