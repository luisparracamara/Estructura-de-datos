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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = {10,20,30};
        int[] array2 = {10,20,10,10};
        
        System.out.println(compararArray(array1,array2,0));
        
        invertirArray(array1,array2,0,array1.length-1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print("["+array1[i]+"]");
        }
    }
    
    
    static boolean compararArray(int array1[],int array2[], int indice){
        
        if (indice == array1.length) {
            return true;
        }
        
        if (array1[indice] != array2[indice]) {
             return false;
        }else{
            
            return compararArray(array1,array2,indice+1);
        }
        
    }
    
    
    //invertir un array
    public static void invertirArray(int array1[],int array2[], int inicio, int fin){
        
        if (inicio < fin) {
            int aux = array1[inicio];
            array1[inicio] = array1[fin];
            array1[fin] = aux;
            
            invertirArray(array1,array2,inicio+1,fin-1);
            
        }
        
    }
    
}
