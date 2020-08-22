/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerrecursividad;

/**
 *
 * @author USUARIO
 */
public class Prueba {
    
    public static int Trinobachi(int n)
    {
        switch (n) {
            case 0:
            case 1:
            case 2:
                return 0;
            case 3:
            case 4:
                return 1;
            default:
                return Trinobachi(n - 1) + Trinobachi(n - 2) + Trinobachi(n - 3);
        }
    }
    
    public static boolean Buscar(int[] a, int b, int c)
    {  
        if(a[c] == b)
        {
            return true;
        }
        else if(a.length-1 > c)
        {
            return Buscar(a, b, c+1);
        }
        else
        {
            return false;
        }
    }
    
    public static boolean Palindroma(String a)
    {
        if(a.length()==0 || a.length()==1)
        {
            return true;
        }
        else if(a.charAt(0) == a.charAt(a.length()-1))
        {
           return Palindroma(a.substring(1, a.length()-1));
        }
        else
        {
            return false;
        }
    }
    
    public static int Numerológico(int n, String x, int z)
    {
        
        if(n < 10)
        {
            return n;
        }
        else
        {
            if (x.length()==0)
            {
                return Numerológico(z, String.valueOf(z), z-z);
            }
            else
            {   
                z += Integer.parseInt(x.substring(x.length()-1));
                return Numerológico(n, (x.substring(0, (x.length()-1))), z);
            }
        }
    }
}
