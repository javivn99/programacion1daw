/*
 Se desea llevar un control del estado de una cuenta corriente; 
la cuenta corriente está caracterizada por su saldo y 
sobre ella se pueden realizar tres tipos de operaciones:
saldo: devuelve el saldo de la cuenta (puede ser negativo).
imposición (cantidad): ingresa en la cuenta una cantidad de dinero. 
reintegro (cantidad): saca de la cuenta una determinada cantidad de dinero.

Suponga que la cuenta inicialmente tiene un saldo de cero. 

Escriba una clase CuentaCorriente que implemente
la funcionalidad descrita; 

escriba un pequeño programa principal para
probar su funcionamiento.
 */
package ejercicio5_t6;

/**
 *
 * @author DAW
 */
public class Ejercicio5_T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double calderilla, miSaldo;
        CuentaCorriente miCuenta = new CuentaCorriente();
        System.out.println("Metemos 100 en la cuenta");
        miCuenta.Imposicion(100);
        calderilla = miCuenta.Reintegro(35);
        System.out.println("Sacamos " + calderilla + " de la cuenta");
        System.out.println("El saldo es : " + miCuenta.Saldo());
    }
    
}
