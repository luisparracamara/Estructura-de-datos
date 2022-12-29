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
public class reverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra = "Techie Delight";
        int longitud = palabra.length();
        
        System.out.println(reversa(palabra,longitud-1));
    }
    
    
    static String reversa(String palabra, int indice){
        
        String p = palabra.charAt(indice)+"";
        
        if (indice == 0) {
            return p;
        }
        
        return p + reversa(palabra, indice-1);
        
    }
    
}
