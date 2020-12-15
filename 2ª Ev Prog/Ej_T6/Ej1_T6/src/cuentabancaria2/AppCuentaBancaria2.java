/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria2;

/**
 *
 * @author DAW
 */
public class AppCuentaBancaria2 {
    
    public static void main(String[] args) {
        
        CuentaBancaria2 cuenta1 = new CuentaBancaria2 ("1111", "Ana Lopez",2000);
        cuenta1.retirar(200);
        System.out.println(cuenta1.getSaldo());
        cuenta1.depositar(1000);
        System.out.println(cuenta1.getSaldo());
        cuenta1.retirar(4000);
        System.out.println(cuenta1.getSaldo());
    }
    
}
