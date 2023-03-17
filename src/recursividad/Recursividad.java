/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
// * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author CURLING
 */
public class Recursividad {

  
    public static void main(String[] args) {
        
//       Fibonnaci fi = new Fibonnaci();
//       fi.run();
//      
       Factorial f= new Factorial();
       f.run();
////        System.out.println(potencia(5,3));
    }
    
    public static int potencia (int x, int n)
    {
         if (n==0) 
            return 1; // paso base
        else 
             return x*potencia(x,n-1); // paso recursivo
    }
    
     public static int factorial(int n)
     {
         int resultado;
         
         if (n==0) {
           resultado = 1;  // Basico
         } else {
           resultado = n*factorial(n-1);  // paso recursivo
         }
         return resultado;
     }

}
