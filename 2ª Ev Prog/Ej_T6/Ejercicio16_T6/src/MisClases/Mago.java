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
public class Mago extends Personaje {
    
    private String poder;
    
    public Mago ( String nombre, String poder) {
        
        super(nombre, 100);
        this.poder=poder;
    }
    
    public String encantar() {
        actualizarEnergia(-2);
        return poder;
    }
    
      public void actualizarEnergia(int en) {
        
        this.consumirEnergia(en);
    }
    
}
