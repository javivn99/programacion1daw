/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg30;

/**
 *
 * @author Javi
 */
public class Ej30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0, m2=0, m3=0, c2=0, c3=0;
        while (i<101) {
            if (i==(i/2)*2) {
                m2=m2+i;
            }
            if (i==(i/3) *3) {
                m3=m3+i;
            }
            c2= c2+1;
            c3= c3+1;
        } 
        System.out.println("Los multiplos de 2 son: "+m2);
        System.out.println("Los multiplos de 3 son: "+m3);
    }
}
//NO FUNCIONA
