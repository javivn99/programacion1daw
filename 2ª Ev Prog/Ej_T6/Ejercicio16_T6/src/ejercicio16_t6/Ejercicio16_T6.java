/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16_t6;


import MisClases.*;

/**
 *
 * @author DAW
 */
public class Ejercicio16_T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mago ml;
        Guerrero gl;
        
        Guerrero g1 = new Guerrero("Alfa", 50, "Burbujitas de jabón");
        g1.combatir( 2 );
        
        System.out.println( "El nivel de energia de" + g1.getNombre() + "es" + g1.getEnergia());
    
        Mago m1 = new Mago("Harry" , "Quemar");
        m1.encantar();
        System.out.println( "El nivel de energia de " + m1.getNombre() + "es" + m1.getEnergia());
    }
    
}
