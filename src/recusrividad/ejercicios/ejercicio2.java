/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recusrividad.ejercicios;

/**
 *
 * @author Luis Parra
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(factorial(4));
    }
    
    
    public static int factorial(int n){
        
        if (n < 1) {
            return 1;
        }
        
        int decremento = n - 1;
        int resfac = factorial(decremento);
        int res = resfac * n;
        
        return res;
    }
}
