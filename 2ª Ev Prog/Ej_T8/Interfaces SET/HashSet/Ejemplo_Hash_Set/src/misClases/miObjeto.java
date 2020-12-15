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
public class miObjeto {
    
    private int valor = -1;

    public miObjeto(int valor) {
        
        this.valor = valor;
    }
    
    public boolean equals(Object o) {
        
        if (!(o instanceof miObjeto)) return false;
        if (((miObjeto)o).valor == this.valor) return true;
        
        else
            return false;
    }
    
    
}
