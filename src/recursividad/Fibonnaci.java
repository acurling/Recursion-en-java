
package recursividad;


public class Fibonnaci {
    
    public static int printFibonacci(int n) {
        if (n == 0)  // punto basico
            return 0; 
        else if (n == 1)  // punto basico
            return 1;
        else
            return printFibonacci(n - 1) + printFibonacci(n - 2);  // punto recursivo
    }  
    
    public void run(){
        
          int maxCount = 50;
        for (int i = 0; i <= maxCount; i++) {
            int fibonacciNumber = printFibonacci(i);
            System.out.print(" " + fibonacciNumber);
        }
    }
    
}
