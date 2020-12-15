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
public class Funcionario extends Persona implements Trabajador{
    
    String codigo;
    
    public Funcionario(String codigo, String nombre, String direccion,int edad , double sueldo) {
        
        super(nombre, direccion, edad, sueldo);
        this.codigo = codigo;
    }
    
    public void pagarImpuestos() {
        
        System.out.println("Soy funcionario y pago impuestos");
        sueldo = sueldo - (0.16*sueldo);
    }
    
}
