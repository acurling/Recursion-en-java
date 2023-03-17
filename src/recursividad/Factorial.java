/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author CURLING
 */
public class Factorial {

    // Esto es un método recursivo
    long facR(long n) {
        long resultado;
        if (n == 1) {
            return 1; //Paso basico
        }
        resultado = n * facR(n - 1); // Paso recursivo
        return resultado;
    }
    
    /*
    PILA
       resultado = 5 * FacR(4)
       resultado = 4 * FacR(3)
       resultado = 3 * FacR(2)
       resultado = 2 * FacR(1)
    
      resultado = 2*1 = 2
      resultado = 2*3 = 6
      resultado = 6*4 = 24
      resultado = 24*5 = 120
    
    */


    // Esto es un equivalente iterativo
    int facI(int n) {
        int t, resultado;

        resultado = 1;
        for (t = 1; t <= n; t++) {
            resultado *= t; 
        }
        return resultado;
    }

    public void run() {
        Factorial f = new Factorial();

        System.out.println("Factorial utilizando un método recursivo:");
     //   System.out.println("El factorial de 5 es: " + f.facI(5));
       System.out.println("El factorial de 10 es: "+f.facR(5));
        System.out.println();
//
//        System.out.println("Factorial utilizando un método iterativo:");
//        System.out.println("El factorial de 3 es: "+f.facI(3));
//        System.out.println("El factorial de 6 es: "+f.facI(6));
//        System.out.println();

    }
}
