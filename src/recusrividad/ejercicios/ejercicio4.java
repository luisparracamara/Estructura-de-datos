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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] arreglo = {10,20,30,40,50};
       
       
       
       try{
           buscarArreglo(arreglo, 0, 30);
       }catch(Exception e){
           System.out.println("Valor buscado no encontrado");
       }
    }
    
    public static void buscarArreglo(int arreglo[], int indice,int elemento){
            if (elemento == arreglo[indice] && indice <= arreglo.length) {
            System.out.println("encontrado " + arreglo[indice]);
        }else{
            System.out.println(arreglo[indice]);
            int aum = indice + 1;
            buscarArreglo(arreglo,aum,elemento);
        }
    }
    
}
