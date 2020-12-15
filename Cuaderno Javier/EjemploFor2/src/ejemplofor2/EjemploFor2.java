/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofor2;

import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class EjemploFor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int arroba=0;
       
       boolean punto=false;
       
       String mail=JOptionPane.showInputDialog("Introduce tu direccion email");
       
       int i;
       
       for (i=0; i<mail.length();i++){
           
           if (mail.charAt(i)=='@'){
               arroba++;
           }
           if (mail.charAt(i)=='.'){
               punto=true;
           }
       }
       if (arroba==1 && punto==true){
           System.out.println("El correo es correcto");
       } else{
           System.out.println("El correo es erroneo");
       }
    }
    
}
