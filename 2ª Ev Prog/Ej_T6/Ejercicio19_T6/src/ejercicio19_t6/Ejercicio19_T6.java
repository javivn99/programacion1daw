/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19_t6;

import misClases.*;
/**
 *
 * @author DAW
 */
public class Ejercicio19_T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Funcionario Pedro = new Funcionario("NRP001","Juan", "c/Alameda",15,20000);
        Pedro.pagarImpuestos();
        
        PresentadorTv Chusa = new PresentadorTv("Telecinco","paz", "mMadriZ",40,80000);
        Chusa.pagarImpuestos();
        
        Hacienda h=new Hacienda();
        h.quePaguetolMundo(Chusa);
        h.quePaguetolMundo(Pedro);
        
    }
    
}
