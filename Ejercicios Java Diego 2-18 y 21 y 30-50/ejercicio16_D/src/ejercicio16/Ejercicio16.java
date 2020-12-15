/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author DAW
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String clave;
        int c;
        boolean clave_correcta;
        c=0;
        clave_correcta=false;
        while(c<3 && clave_correcta==false){
            System.out.println("Introduce la clave: ");
            clave=scan.nextLine();
            if(clave.equals("eureka")){
                System.out.println("La clave es correcta");
                clave_correcta=true;
            }
            c=c+1;
            if(c==3 && clave_correcta==false){
                System.out.println("No tienes más intentos");
            }
        }
    }
    
}
