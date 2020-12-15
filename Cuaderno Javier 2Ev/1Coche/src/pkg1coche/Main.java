/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1coche;

import misclases.Coche;

/**
 *
 * @author Javier
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche BMW=new Coche(); //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE
        
        System.out.println("Este coche tiene " +BMW.ruedas+ " ruedas.");
    }
    
}
