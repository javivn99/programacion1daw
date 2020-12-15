/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_t6;

/**
 *
 * @author DAW
 */
public class CuentaCorriente {
    
            private double saldo;

        
            public double Saldo () {
            return saldo;
            }
            
            public void Imposicion(double cantidad){
            saldo = saldo + cantidad;
            }
       
            public double Reintegro(double cantidad){
            saldo = saldo - cantidad;
            return cantidad;
            }
}


