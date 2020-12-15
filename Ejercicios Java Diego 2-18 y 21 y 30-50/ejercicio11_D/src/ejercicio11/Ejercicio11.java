/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;
import java.util.Scanner;
/**
 *
 * @author DAW
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String bachiller,grado_medio,prueba_acceso;
        System.out.println("¿Tienes el bachiller?");
        bachiller=scan.nextLine();
        if(bachiller.equals("si")){
            System.out.println("Puedes hacer grado superior");
        }else{
            System.out.println("¿Tienes la prueba de acceso?");
            prueba_acceso=scan.nextLine();
            if(prueba_acceso.equals("si")){
                System.out.println("Puedes hacer grado superior");
            }else{
                System.out.println("¿Tienes el grado medio?");
                grado_medio=scan.nextLine();
                if(grado_medio.equals("si")){
                    System.out.println("Puedes hacer grado superior");
                }else{
                    System.out.println("No puedes hacer grado superior");
                }
            }
        }
        
    }
    
}
