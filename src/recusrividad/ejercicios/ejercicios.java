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
public class ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 10;
        int arreglo[] = {10,20,30,50,4}; 
        int indice = 0;
        String palabra = "Luis Parra";
        
        System.out.println(sumaNumeros(numero));
        System.out.println(factorial(numero));
        recorrerArreglo(arreglo,indice);
        buscarElemento(arreglo, indice, 50);
        System.out.println(revertirString(palabra, palabra.length()-1));
    }
    
    public static int sumaNumeros(int n){
        
        
        if (n==1) {
            return 1;
        }else{
            int suma = n+sumaNumeros(n-1);
            return suma;
        }
    }
    
    public static int factorial(int n){
        if (n==1) {
            return 1;
        }else{
            int fac = n * factorial(n-1);
            return fac;
        }
    }
    
    public static void recorrerArreglo(int []a, int indice){
        if (indice == a.length-1) {
            System.out.println(a[indice]);
        }else{
            System.out.print("-"+a[indice]+"-");
           recorrerArreglo(a,indice+1);
        }
    }
    
    
    public static void buscarElemento(int []a, int indice, int elemento){
        if (elemento == a[indice] && indice <= a.length) {
            System.out.println("Encontrado: " + a[indice] + " En la posicion " + indice);
        }else{
            
            buscarElemento(a,indice+1,elemento);
        }
    }
    
    public static String revertirString(String palabra,int indice){
        if (indice == 0) {
             return palabra.charAt(indice)+"";
        }else{
            char p = palabra.charAt(indice);
            return  p + revertirString(palabra, indice-1);
        }
    
}
 
    
}
