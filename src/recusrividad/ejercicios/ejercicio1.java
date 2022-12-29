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
public class ejercicio1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sumaRecursiva(9));
    }
    
    public static int sumaRecursiva(int n){
        
        if (n == 1) {
            return 1;
        }
        int res  = n-1;
        int rf = sumaRecursiva(res);
        int total = rf + n;
        
        return total;
    }
    
}
