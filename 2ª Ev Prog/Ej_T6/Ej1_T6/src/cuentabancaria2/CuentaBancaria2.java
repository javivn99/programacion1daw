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
public class CuentaBancaria2 {

    /**
     * @param args the command line arguments
     */
        
// Atributos de clase. Son variables de instancia
    private String numero;
    private String titular;
    private double saldo;
// Método constructor de la clase. Es invocado cada vez que se crea o instancia un objeto de la clase
    public CuentaBancaria2(String numeroCuenta, String titularCuenta, double cantidaInicial) {
    numero = numeroCuenta;
    titular = titularCuenta;
    saldo = cantidaInicial;
    }
    public double getSaldo() {
        return saldo;
    }
// Métodos retirar y depositar
    public void retirar(double cantidad) {
    if (saldo >= cantidad) {
    saldo = saldo - cantidad;
    }
    else
    System.out.println("No hay suficientes fondos");
    }
    public void depositar(double cantidad){
    if(cantidad > 0){
    saldo = saldo + cantidad;
    }
    }
        // TODO code application logic here
}
    

