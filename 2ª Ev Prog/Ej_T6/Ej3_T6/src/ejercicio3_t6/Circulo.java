/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_t6;

/**
 *
 * @author DAW
 */
public class Circulo {
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }
    
    public float perimetro(){
        return (float)(2.0*Math.PI*radio);
    }
    
    public float area(){
        return (float)(Math.PI*radio*radio);
    }
    
    public static Circulo mayorDiametro (Circulo[]t){
        Circulo mayor=t[0];
        for(int i=1; i<t.length; i++)
            if(t[i].getRadio()>mayor.getRadio())
                mayor=t[i];
        return mayor;
    }
}
