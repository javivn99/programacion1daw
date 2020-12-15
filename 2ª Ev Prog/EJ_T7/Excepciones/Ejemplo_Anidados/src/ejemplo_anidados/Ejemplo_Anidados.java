/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_anidados;

/**
 *
 * @author DAW
 */
public class Ejemplo_Anidados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            
            int a = args.length;
            int b = 42 / a;
            System.out.println("a- " + a);
      
        try{
            
                if (a ==1) a = a / (a - a);
           
                if (a==2) {
                
                int c[] = {1};
                c[42] = 99;
                }
            }  
        
        catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Desbordamiento: " + e);
            }
        }
        
        catch (ArithmeticException e) {
            
            System.out.println("Desbordamiento: " + e);
        }
    
    }
    
}
