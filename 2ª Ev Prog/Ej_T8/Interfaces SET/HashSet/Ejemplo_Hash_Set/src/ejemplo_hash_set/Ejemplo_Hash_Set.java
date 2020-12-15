/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_hash_set;



import java.util.HashSet;
import java.util.Set;
import misClases.*;


public class Ejemplo_Hash_Set {
    
    private int valor = -1;

    @Override
    public int hashCode() {
            return valor;
    }
    
    public static void main(String[] args) {
       
        Set set= new HashSet();
        set.add(new miObjeto(5));
        set.add(new miObjeto(7));
        System.out.println(set.contains(new miObjeto(5)));
        
     }
    
}
