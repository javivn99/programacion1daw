/*
Defina una clase ‘Monedero’ que permita gestionar la cantidad de dinero 
que una persona dispone en un momento dado. 

La clase deberá tener un constructor que permitirá crear un monedero con 
una cantidad que le pasamos y deberá definir un método para meter dinero 
en el monedero, otro para sacarlo y finalmente, otro 
para consultar el disponible. 

Solo podrá conocerse la cantidad de dinero del monedero a través de
este último método. 

Por supuesto, no se podrá sacar más dinero del que haya
en un momento dado en el monedero.

Para probar el funcionamiento de la clase, escriba un método ‘main’ con 
una serie de instrucciones que hagan uso de los métodos definidos
 */
package ejercicio6_t6;

/**
 *
 * @author DAW
 */
public class Ejercicio6_T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double calderilla, dinero_monedero;
        Monedero mi_monedero = new Monedero(100);
        calderilla = mi_monedero.sacar(35);
        mi_monedero.meter(15);
        dinero_monedero = mi_monedero.get_cantidad();
    }
    
}
