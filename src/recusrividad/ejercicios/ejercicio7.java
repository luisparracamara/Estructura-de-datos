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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 10;
        int potencia = -3;
        System.out.println(potenciaRecursiva(numero,potencia,numero));
    }
    
    public static double potenciaRecursiva(int n, int potencia, int base){
        int nuevaN;
        
        if (potencia == 0) {
            return 1;
        }else if (potencia == 1) {
            return n;
        }else if (potencia < 0) {
        return potenciaRecursiva(n, potencia+1,base)/base;
        }else{
        nuevaN = n * base;
        return potenciaRecursiva(nuevaN, potencia-1,base);
        }
       
        
        
        
    }
    
}
