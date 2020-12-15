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
public class Guerrero extends Personaje {
    
    private String arma;
    
    public Guerrero(String nombre, int energia, String arma) {
        
        super(nombre, energia);
        this.arma = arma;
    }
    
    public String combatir (int energ) {
        
        actualizarEnergia (energ);
        return arma + "" + energ;
        
    }
    
    public void actualizarEnergia(int en) {
        
        this.consumirEnergia(en);
    }
    
    
}
