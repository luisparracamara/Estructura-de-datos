/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/**
 *
 * @author Luis Parra
 */
public class problemasRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []arreglo = {10,20,30};
        System.out.println(sumaArreglo(arreglo,0,0));
        
    }
    
    public static int sumaArreglo(int []arreglo, int indice, int suma){
        
        
        if (arreglo.length == indice) {
            return suma;
        }
        
        suma = arreglo[indice] + sumaArreglo(arreglo,indice+1,suma);
        return suma;
    }
    
}
