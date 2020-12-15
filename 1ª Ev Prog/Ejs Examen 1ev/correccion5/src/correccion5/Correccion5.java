/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccion5;

import java.util.Arrays;

/**
 *
 * @author DAW
 */
public class Correccion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabla[];
        tabla=generaarray();
        System.out.println(Arrays.toString(tabla));
        valorpareja(tabla,36);

    }
    public static int [] generaarray(){
        int[] tab=new int[15];
        int n;
        for(int i=0;i<tab.length;i++){
            n=(int) (Math.random()*(42-(-2)+1)+(-2));
            tab[i]=n;
        }
        return tab;
    }
    static void valorpareja(int t[],int n){
        System.out.println("Parejas de elementos y su producto:");
        for(int i=0;i<t.length;i++){
            for(int j=i+1;j<t.length;j++){
                if(t[i]*t[j]==n){
                    System.out.println(t[i]+" * "+t[j]+" = "+n);
                }
            }
        }
    }
}
