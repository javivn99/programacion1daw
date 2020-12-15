/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

/**
 *
 * @author DAW
 */
public class Coche extends Vehiculo implements Movible {
    
    String color;
    int posicionx, posiciony;
    
    public Coche(String color, int posicionx, int posiciony, int numRuedas) {
        super (numRuedas);
        this.color = color;
        this.posicionx =posicionx;
        this.posiciony = posiciony;
    }
    
    public void moverse (int x, int y) {
        
        posicionx = x;
        posiciony = y;
    }
            
    
}
