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
public class CuentaBancaria {
    
    protected String numero;
    protected String titular;
    protected double saldo;
    
    
    public CuentaBancaria(String numeroCuenta, String titularCuenta, double cantidadInicial ) {
        
        numero = numeroCuenta;
        titular = titularCuenta;
        saldo = cantidadInicial;
    }

    public void retirar (double cantidad) {
        
        if (getSaldo() >= cantidad) {
            
            setSaldo(getSaldo() - cantidad);
        }
        else
            System.out.println(" No hay suficientes fondos ");
    }
    
    public void depositar (double cantidad) {
        
        if (cantidad > 0) {
            
            setSaldo(getSaldo() + cantidad);
        }
    }
    
    public double getSaldo() {
        
        return saldo;
     
    }
    
    public void setSaldo (double saldo) {
        
        this.saldo = saldo;
    }
    
         
}
