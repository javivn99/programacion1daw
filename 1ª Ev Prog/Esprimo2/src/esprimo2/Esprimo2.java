/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package esprimo2;

/**
 *
 * @author Jose Luis
 */
public class Esprimo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error, falta un parametro");
        } else if (args.length > 1) {
            System.out.println("Error, solo debes introducir un parametro");
        } else {
            int num = Integer.parseInt(args[0]);
            esprimo(num);
        }
    }

    public static void esprimo(int par) {
        int divisor;
        String numprimo;

        if (par <= 0) {
            System.out.println("Error, el numero debe ser positivo");
        } 
        else {
            divisor = 2;
            numprimo = "TRUE";
            while (divisor <= par && numprimo == "TRUE") {
                if (par != divisor) 
                    if (par > divisor) 
                        if ((par % divisor) != 0) 
                            numprimo = "TRUE";
                        else 
                            numprimo = "FALSE";
                divisor++;
            }
            if (numprimo == "TRUE") 
                System.out.println("El numero "+ par +" es primo");
            else 
                System.out.println("El numero "+ par +" no es primo");
            
        }
    }
}
