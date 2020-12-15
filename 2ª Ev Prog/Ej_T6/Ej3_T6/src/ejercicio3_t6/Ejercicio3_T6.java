/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_t6;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio3_T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Triangulo tri[]=new Triangulo[3];
        Circulo cir[]=new Circulo[3];
        float base, altura;
        Triangulo triMayor;
        Circulo cirMayor;
        
        for(int i=0; i<3; i++){
            System.out.println("Introduzca la base del triángulo "+(i+1));
            base=scan.nextFloat();
            System.out.println("Introduzca la altura del triángulo "+(i+1));
            altura=scan.nextFloat();
            tri[i]=new Triangulo(base,altura);
        }
        
        triMayor=Triangulo.mayorSuperficie(tri);
        System.out.println("La base del triángulo de mayor superficie es: "+triMayor.getBase());
        System.out.println("La altura del triángulo de mayor superficie es: "+triMayor.getAltura());
        System.out.println("El area del triángulo de mayor superficie es: "+triMayor.area());
        System.out.println("El perímetro del triángulo de mayor superficie es: "+triMayor.perimetro()+"\n");
        
        for(int i=0; i<3; i++){
            System.out.println("Introduce el radio del círculo "+(i+1));
            cir[i]=new Circulo(scan.nextFloat());
        }
        
        cirMayor=Circulo.mayorDiametro(cir);
        System.out.println("El radio del cículo de mayor diametro es: "+cirMayor.getRadio());
        System.out.println("El perimetro del cículo de mayor diametro es: "+cirMayor.perimetro());
        System.out.println("El area del cículo de mayor diametro es: "+cirMayor.area());
         
    }
    
}
