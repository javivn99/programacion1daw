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
public class CuentaDeposito extends CuentaBancaria {
    
    private static final double interes = 5;
    
    public CuentaDeposito(String numeroCuenta, String titularCuenta, double cantidadInicial){
        
        super(numeroCuenta, titularCuenta, cantidadInicial);
    
    }
    
    public void depositar(double cantidad) {
        
        if (cantidad >= 1000) {
            
            setSaldo(saldo + cantidad + cantidad*interes/100);
        }
        
        else
            super.depositar(cantidad);
    }
    
    public String getTipo() {
        return " CuentaDeposito ";
    }
}
