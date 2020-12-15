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
public class Coche {
    
    //tipo enumerado
    public enum Color { ROJO, AZUL, VERDE}
    
    private String matricula;
    private Color color;

    public Coche(String matricula, Color color) {
        this.matricula = matricula;
        this.color = color;
    }
    
    public String matricula() {
        
        return matricula;
    }

    public Color getColor() {
        return color;
    }
    
    public void pinta(Color c) {
        
        color=c;
    }
    
    public boolean equals(Object c) {
        //devuelvo true si los coches son iguales o false si no lo son
        return matricula.equals(((Coche) c).matricula);
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", color=" + color + '}';
    }
    
    
    
    
    
}
