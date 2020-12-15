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
public class CuentaPlatino extends CuentaBancaria {
    
    private static final double limiteDescubierto = 2500.00;
    private double fondosDisponibles;
    
    public CuentaPlatino(String numeroCuenta, String titularCuenta, double cantidadInicial) {
     
     super(numeroCuenta, titularCuenta, cantidadInicial);
     
    }
    
    public void retirar (double cantidad) {
        
        fondosDisponibles = limiteDescubierto + getSaldo();
        
        if (getSaldo() >= cantidad) {
            super.retirar(cantidad);
        }
        
        else
            System.out.println(" No hay suficientes fondos ");

        }
    
    public double getLimiteDescubierto() {
        
        return limiteDescubierto;
    }
    
    public double getFondosDisponibles() {
        
        return fondosDisponibles;
    }
    
    public void setFondosDisponibles(double fondosDisponibles) {
        
        this.fondosDisponibles = fondosDisponibles;
        
    }
    
    public String getTipo() {
        
        return " CuentaPlatino ";
    }
    
}
