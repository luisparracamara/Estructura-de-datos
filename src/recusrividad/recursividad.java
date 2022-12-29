/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recusrividad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Luis Parra
 */
public class recursividad {

    static long factorial(int n){
   
        if(n<=1){
            return 1;
        }
         long res = n * factorial(n-1);
         return res;
      
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        int n, res;
        BufferedReader entrada = new BufferedReader(
        new InputStreamReader(System.in));
        
        
        do {
          System.out.print("Introduzca número n: ");
           n = Integer.parseInt(entrada.readLine());  
        } while (n<0);
         System.out.println("\n \t" + n + "!= " + factorial(n));

      
      
    }
    
}
