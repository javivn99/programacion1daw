/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesoideal;

import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class PesoIdeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String genero;
       int altura;
       
       do{
       genero=JOptionPane.showInputDialog("Introduce tu genero (H/M)");
       
       }while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
       
       altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
       int pesoideal=0;
       
       if (genero.equalsIgnoreCase("H")){
           pesoideal=altura-110;
       }
       else if (genero.equalsIgnoreCase("M")){
           pesoideal=altura-120;
       }
       
       System.out.println("Tu peso ideal es " +pesoideal);
    }
    
}
