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
public class Triangulo {
    private float base, altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
    
    public float perimetro(){
        return (float)(base+2.0*Math.sqrt(altura*altura+(base*base/4.0)));
    }
    
    public float area(){
        return (float)(base*altura/2.0);
    }
    
    public static Triangulo mayorSuperficie(Triangulo[]t){
        Triangulo mayor=t[0];
        for(int i=1; i<t.length; i++)
            if(t[i].area()>mayor.area())
                mayor=t[i];
        return mayor;
    }
}
