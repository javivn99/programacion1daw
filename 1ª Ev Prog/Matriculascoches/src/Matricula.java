/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Luis
 */
public class Matricula {
    private static final char letras[]={'B','C','D','F','G','H','J','K','L','M','N','P','R','S','T','V','W','X','Y','Z'};
    private static final char numeros[]={'0','1','2','3','4','5','6','7','8','9'};
    //private String matricula;

   
    public static boolean Letras_Correcta(String mat)
    {
        char aux;
        boolean correcta;
        for (int i=4;i<mat.length();i++) 
        {
           correcta=false;
           aux= mat.charAt(i);
           for (int j=0;j<letras.length;j++)
           {
               if (letras[j]==aux)
                   correcta=true;
           }
           if (!correcta )
             return false;
        } 
        return true;
    }
    public static boolean Numeros_Correctos(String mat)
    {        
        char aux;
        boolean correcta;
        for (int i=0;i<4;i++) 
        {
           correcta=false;
           aux= mat.charAt(i);
            for (int j=0;j<numeros.length;j++)
           {
               if (numeros[j]==aux)
                   correcta=true;
           }
           if (!correcta )
             return false;
        } 
        return true;
            
        
        
    }
    
}
