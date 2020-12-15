/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoarrays1;

/**
 *
 * @author DAW
 */
public class PasoArrays1 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    int a[] = {0,1,2,3,4};
    int n1=3;
    int n2=7;
       
    modificarArray(a);
    modificarElemento(a[3]);
    System.out.println("El valor de a[3] fuera del metodo es: " + a[3]);
    for (int i = 0; i< a.length; i++ )
        System.out.print(a[i]+",");
    intercambio(n1,n2);
    //System.ou.print("\n"+"n1 vale: "+n1+ " y n2 vale: " +n2);
    System.out.printf("n1=%d y n2=%d,",n1,n2);
}

public static void modificarArray(int b[]){
    for (int j = 0; j< b.length; j++)
        b[j] *= 2;
}
public static void modificarElemento(int e){
    e *= 2;
    System.out.println("El valor de e dentro del metodo es : " + e);
}
public static void intercambio(int x,int y){
    int auxiliar;
    auxiliar=y;
    y=x;
    x=auxiliar;
    System.out.println("\n"+"x bale: "+x+ " e y vale: "+y);
}

}
