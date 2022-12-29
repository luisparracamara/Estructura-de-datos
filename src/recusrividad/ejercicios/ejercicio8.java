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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 789;
        System.out.println(sumaDigitos(n));
    }
    
    public static int sumaDigitos(int n){
        if (n < 10) {
            return n;
        }
        
        int a = n%10;
        int nuevaN = n/10;
        System.out.println(nuevaN);
        int res = sumaDigitos(nuevaN) + a;
        
        return res;
        
        
    }
}
