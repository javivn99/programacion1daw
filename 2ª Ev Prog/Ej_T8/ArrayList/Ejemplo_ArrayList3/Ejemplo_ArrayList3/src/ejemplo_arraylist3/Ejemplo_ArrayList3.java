/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_arraylist3;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import misClases.*;

/**
 *
 * @author DAW
 */
public class Ejemplo_ArrayList3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList listaPersonas = new ArrayList();
        
        
        //metemos 3 personas
        
        int numPersonas = 3;
        
        
        
        for ( int i = 0; i< numPersonas; i++) {
            
            //creamos una nueva persona
            Persona p = new Persona();
            
            p.setId(JOptionPane.showInputDialog("Introduce el id de la persona "));
            
            p.setNombre(JOptionPane.showInputDialog("Introduce el nombre de la persona numero " + i));
            
            p.setApellidos(JOptionPane.showInputDialog("Introduce los apellidos de la persona numero" + i));
           
            //adjuntamos a la lista la persona que acabaos de crear
            listaPersonas.add(p);
        }
        
        for (int j = 0; j < listaPersonas.size(); j++) {
            
            //ahora imprimiremos las personas de nuestro ArrayList
            
            System.out.println("=========================================");
            
        
        System.out.println("Persona numero  " + j);
        Persona p = (Persona)listaPersonas.get(j);
        System.out.println("Id: " + p.getId());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellidos: " + p.getApellidos());
        
        
           System.out.println("=========================================");
           
           
        }//cierro el for
        
            Persona p1 = (Persona) listaPersonas.get(0);
            System.out.println("Nombre: " + p1.getNombre());
        
        //PARA COMPROBAR SI LOS OBJETOS SON IGUALES
        
           System.out.println(p1.equals(new Persona("1","Javier","Nieto Fonseca")));
        
    }
    
}

