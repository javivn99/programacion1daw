/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

/**
 *
 * @author DAW
 */
public class PresentadorTv extends Persona implements Trabajador{
    
    String cadena_television;
    
    public PresentadorTv(String cadena_television, String nombre, String direccion, int edad, double sueldo) {
        
        super(nombre, direccion, edad, sueldo);
        this.cadena_television = cadena_television;
    }

    public void pagarImpuestos() {
        
        System.out.println("Yo pago mas por trabajar en al tele");
        sueldo = sueldo-(0.3*sueldo);


    }

}   

