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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] arreglo = {100,9,105,8};
         System.out.println(maximoArray(arreglo,0,0));
         System.out.println(maximoArrayV2(arreglo,0));
         System.out.println(minimoArray(arreglo,0,0));
         
         
    }
    //NO PARAR LA RECURSION
    static int maximoArray(int[] arreglo, int indice, int max){

        if (indice == arreglo.length) {
            return max;
        }else{
            if (arreglo[indice]>max) {
                max = maximoArray(arreglo, indice+1, arreglo[indice]);
            }else{
                max = maximoArray(arreglo, indice+1, max);
            }
        }
        
        return max;
        
    }
    
    
    //para encontrar al menor
    
    public static int minimoArray(int[] arreglo, int indice, int min){
        if (indice == arreglo.length) {
            return min;
        }else{
            if (arreglo[indice]<min) {
                min = minimoArray(arreglo, indice+1, arreglo[indice]);
            }else{
                min = minimoArray(arreglo, indice+1, min);
            }
        }
        
        return min;
    }
    
    static int maximoArrayV2(int[] arreglo, int indice){
        int maximo = Integer.MIN_VALUE;

        if (indice == arreglo.length) {
            return maximo;
        }else{
            
            if (arreglo[indice]>maximo) {
                maximo = Math.max(arreglo[indice], maximoArrayV2(arreglo,indice+1));
            }else{
                maximo = Math.max(arreglo[indice], maximoArrayV2(arreglo,indice+1));
            }
            
        }
        
        return maximo;
    }
    
}
