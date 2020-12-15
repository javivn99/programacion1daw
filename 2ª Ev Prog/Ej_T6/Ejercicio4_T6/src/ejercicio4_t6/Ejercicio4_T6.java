/*
Defina una clase que permita controlar un sintonizador digital de emisoras FM.
Concretamente, se desea dotar al controlador de una interfaz que permita 
subir (up) o bajar (down) la frecuencia (en saltos de 0.5 MHz) y mostrar 
la frecuencia sintonizada en un momento dado (display).
Supondremos que el rango de frecuencias a manejar oscila entre los 80 Mhz y los 108 MHz
y que al inicio, el controlador sintoniza a 80 MHz.
Si durante una operación de subida o bajada se sobrepasa uno de los dos límites,
la frecuencia sintonizada debe pasar a ser la del extremo contrario.
 */
package ejercicio4_t6;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio4_T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String respuesta;
        Scanner scan=new Scanner(System.in);
        Sintonizador s=new Sintonizador();
        
        s.Display();
        while(s.getFrecuencia()<108.0){
            s.Subir();
            s.Display();
        }
        System.out.println("");
        while(s.getFrecuencia()>80){
            s.Bajar();
            s.Display();
        }   
    }
}
    

