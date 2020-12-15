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
public class CuentaAhorros extends CuentaBancaria {
    
    public CuentaAhorros(String numeroCuenta, String titularCuenta, double cantidadInicial) {
        
        super(numeroCuenta, titularCuenta, cantidadInicial);
        
    }
    
    public String getTipo() {
        
        return " CuentaAhorros ";
    }
            
}
