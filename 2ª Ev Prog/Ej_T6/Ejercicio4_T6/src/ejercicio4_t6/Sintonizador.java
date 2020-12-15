/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_t6;

/**
 *
 * @author DAW
 */
public class Sintonizador {
   
            private double frecuencia;
            public Sintonizador() {
                    frecuencia = 80;
            }
            
            public double getFrecuencia() {
            return frecuencia;
            }
            
            public void Subir() {
                frecuencia=frecuencia + 0.5;
                if (frecuencia > 108)
                    frecuencia = 80;
            }
            
            public void Bajar() {
                frecuencia = frecuencia - 0.5;
                if (frecuencia < 80)
                    frecuencia = 108;
                
            }
            
            public void Display() {
                System.out.println("Frecuencia sintonizada es: " + frecuencia);
            }
        }
        // TODO code application logic here
    
    

