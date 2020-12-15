/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio39;

import java.util.Scanner;


/**
 *
 * @author DAW
 */
public class Ejercicio39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int nalumnos,i;
        double media=0;
        System.out.println("Introduce numero de alumnos: ");
        nalumnos=scan.nextInt();
        int[] notas=new int[nalumnos];
        System.out.println("Introduce las notas: ");
        for(i=0;i<nalumnos;i++){
            System.out.println("notas["+(i+1)+"]= ");
            notas[i]=scan.nextInt();
        }
        for(i=0;i<nalumnos;i++){
            media=media+notas[i];
        }
        media=media/nalumnos;        
        System.out.println("La media es: %.2f /n"+media);//el nº despues de la f es cuantos decimales queremos,y /n es salto de linea
        System.out.println("Listado de alumnos con notas superiores a la media: ");
        for(i=0;i<nalumnos;i++){
            if(notas[i]>media){
                System.out.println("El alumno numero "+(i+1)+" Nota final: "+notas[i]);
            }
        }
        
                
    }
    
}
