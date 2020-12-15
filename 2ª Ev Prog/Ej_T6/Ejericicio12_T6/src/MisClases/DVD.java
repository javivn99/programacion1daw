/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author DAW
 */
public class DVD extends MedioAlmacenamiento {
    
    private boolean esRegrabable;
    
    public DVD( String nombre, int capacidadMb, boolean esRegrababale) {
       
        super(nombre, capacidadMb);
        this.esRegrabable = esRegrabable;
     }
    
    public void mostrar() {
        
        super.mostrar();
        System.out.println(" Es Regrabable: " + esRegrabable);
    }
}
