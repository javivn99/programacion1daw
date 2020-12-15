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
public class Persona {
    
    protected String nombre;
    protected String apellidos;
    protected int anyoNacimiento;
    
    public Persona() {
    }
        
        public Persona(String nombre, String apellidos,int anyoNacimiento) {
            this.nombre=nombre;
            this.apellidos=apellidos;
            this.anyoNacimiento=anyoNacimiento;
        }
        
        public void imprime() {
            System.out.println("Datos persoanles: " + nombre + "" + apellidos + "( " + anyoNacimiento + " )");
            
        }
   }
   

