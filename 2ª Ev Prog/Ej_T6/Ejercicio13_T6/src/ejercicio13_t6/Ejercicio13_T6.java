/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13_t6;

import MisClases.*;
import java.util.GregorianCalendar;
/**
 *
 * @author DAW
 */
public class Ejercicio13_T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado a = new Empleado("David", 2000, new GregorianCalendar());
        Empleado b = a;
        
        System.out.println(a.añoContratacion());
        System.out.println(a.toString());
        
        
        Directivo d1 =  new Directivo("Manolo", 3500, new GregorianCalendar());
        Directivo d2 =  new Directivo("Jesus", 3500, new GregorianCalendar());
        
        System.out.println(d1.toString());
        
        if (d1.equals(d2))
            
            System.out.println(" Los objetos son iguales ");
        else
            System.out.println(" Los objetos son distintos ");
       
    }
    
}
