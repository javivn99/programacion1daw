/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccion4;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author DAW
 */
public class Correccion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String base=JOptionPane.showInputDialog("Introduce la base: ");
        String exp=JOptionPane.showInputDialog("Introduce el exponente: ");
        int b=Integer.parseInt(base);
        int e=Integer.parseInt(exp);
        System.out.println("El resultado de elevar "+base+" a "+exp+" es: "+potenciarecursiva(b,e));
        
    }
    public static double potenciarecursiva(int base, int exp){
        if(exp<0){
            exp=exp*(-1);
            return 1/potenciarecursiva(base,exp);
        }else if(exp==0){
            return 1;
        }else{
            return base*potenciarecursiva(base,exp-1);
        }
    }
}
