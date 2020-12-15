/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package esprimo;

/**
 *
 * @author Jose Luis
 */
public class EsPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
       if (args.length==0) 
              System.out.println("Error, falta un parametro");
       else if (args.length >1) 
              System.out.println("Error, solo debes introducir un parametro");
            else {
                  int num=Integer.parseInt(args[0]);
                  esprimo(num);
            }
    }
       
    public static void esprimo(int par) {
        if (par<=0) 
             System.out.println("Error, el numero debe ser positivo");
        else {
             if (par!=1) {
             for(int i=2;i<par;i++) 
                if (par%i==0) {
                     System.out.println("El numero "+par+" no es primo");
                     return;
                }
             System.out.println("El numero "+par+" es primo");
             }
             else System.out.println("El numero debe ser mayor que 1");
        }
    }
}