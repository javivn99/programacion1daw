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
 public class Ejecutivo extends Empleado {
     
     int incentivos;
     
    public Ejecutivo(String n, int s, int i) {
         super(n,s);
         incentivos=i;
     }
    
   public  void aumentarsueldo(int p) {
         super.aumentarSueldo(p);
         
     }
   
   public int getIncentivos() {
        return incentivos;
    }
}
