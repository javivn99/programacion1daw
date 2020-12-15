/*
Algoritmo que lea un número, en caso de que ese numero sea 0 o menor que cero,
se saldrá del programa imprimiendo un mensaje de error.
Si es mayor que cero que calcule su cuadrado y la raíz cuadrada del mismo,
sacando en pantalla el numero que ha tecleado el usuario y su resultado.
Para calcular la raíz podéis suponer que existe la función interna Raíz(x)
o la potencia elevado a 1/2.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double cuadrado;
        double raiz;
        
        System.out.println("Introduce un numero: ");
        a = sc.nextInt();
        raiz = (double) Math.pow(2, a);
        cuadrado = a*a;
        if (a > 0){ 
            System.out.println("La raiz cuadrada es: " + raiz);
            System.out.println("El cuadrado de ese numero es: " + cuadrado);
        }else {
            System.out.println("Error");
        }
            
        
            
    }
    
}
