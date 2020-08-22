/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerrecursividad;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TallerRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here      
        
        int Punto;
        System.out.println("Ingrese un Numero Dependiendo el Ejercicio: ");
        System.out.println("1. Secuencia de Tribonacci");
        System.out.println("2. Buscar Número");
        System.out.println("3. Palabra Palíndroma");
        System.out.println("4. Número Lógico");
        
        Scanner Teclado = new Scanner(System.in);
        Punto = Teclado.nextInt();
        
        switch(Punto)
        {
            case 1:
            {
                // Primer Punto
                System.out.println("----- Secuencia de Tribonacci -----");
                
                int Num;
                System.out.println("Ingrese un Número: ");
                Num = Teclado.nextInt();

                System.out.println("El Resultado es: " + Prueba.Trinobachi(Num));
                break;
            }
            case 2:
            {
                //Segundo Punto
                System.out.println("----- Buscar Número -----");
                
                int[] Matriz = {1, 5, 9, 7, 5, 3, 4};
                int Acu = 0;              
                int Buscar;

                System.out.println("Ingrese el Número que desea Buscar: ");
                Buscar = Teclado.nextInt();
                
                System.out.println("El Número se Encuentra: " + Prueba.Buscar(Matriz, Buscar, Acu));
                
                break;
            }
            case 3:
            {
                //Tercer Punto
                System.out.println("----- Palabra Palíndroma -----");
                
                String Pal;
                System.out.println("Ingrese una Palabra sin Espacio: ");
                Pal = Teclado.next();
                
                System.out.println("La Palabra es: " + Prueba.Palindroma(Pal));   
                break;
            }
            case 4:
            {
                //Cuarto Punto
                System.out.println("----- Número Lógico -----");
  
                int Acu = 0;
                int Num;
                String Pal;
                
                System.out.println("Ingrese un Número: ");
                Num = Teclado.nextInt();
                
                
                Pal = String.valueOf(Num);
                System.out.println("El Resultado es: " + Prueba.Numerológico(Num, Pal, Acu));
                break;
            }
        }
    } 
}
