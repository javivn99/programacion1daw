/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_t6;

/**
 *
 * @author DAW
 */
public class Monedero {
            private double dinero;

    Monedero(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
            
            public void meter(double cantidad){
            dinero = dinero + cantidad;
            }
            
            public double sacar(double cantidad) {
            double dinero_sacado = cantidad;
            
            if (cantidad <= dinero)
            {dinero = dinero - cantidad;
            return cantidad;}
            
            else
            
            if ((cantidad>dinero) && (dinero>0)){
            dinero_sacado = dinero;
            dinero = 0.0;
            return dinero_sacado;}
            
            else
            return -1.0;
            }
            
            public double get_cantidad() {
            return dinero; }
    
}
