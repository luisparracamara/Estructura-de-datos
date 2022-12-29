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
public class ejercicio5 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 254;
        int contador = Integer.toString(numero).length();
        System.out.println(invertirNumero(numero,contador-1));
        
    }
    
    public static int invertirNumero(int n, int pos){
        
        if (n < 10) {
            return n;
        }
        
        int res =  (n%10) * (int)Math.pow(10, pos);
        int nuevapos = pos -1;
        int nuevaN = n/10;
        int res2 = invertirNumero(nuevaN,nuevapos) + res;
        
        
        return res2;
        
    }
    
}
