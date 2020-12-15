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
public class Alumno extends Persona {

    protected String grupo;
    protected char horario;
    
    public Alumno() {}
        
        public Alumno(String nombre, String apellidos, int anyoNacimiento) {
            super(nombre, apellidos, anyoNacimiento);
    }
        public void ponGrupo(String grupo, char horario) {
            if (grupo == null || grupo.length() == 0) {
                System.out.println("Grupo no válido");
            if (horario != "M" && horario != "T") {
                System.out.println("Horario no válido");
            this.grupo=grupo;
            this.horario=horario;
        }

    
        public void imprimeGrupo(){
            System.out.println(" Grupo " + grupo + horario);
        }
    

}
