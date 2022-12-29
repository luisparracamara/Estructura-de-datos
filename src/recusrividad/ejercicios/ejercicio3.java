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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = {1,2,10,4,5};
        recorrerArreglo(arreglo, 1);
    }
    
    public static void recorrerArreglo(int[] arreglo, int indice){
        
        if (indice == arreglo.length) {
            System.out.println("se acabó");
        }else{
            System.out.println(arreglo[indice]);
            int aum = indice+1;
           recorrerArreglo(arreglo, aum);
        }
    }
    
}
