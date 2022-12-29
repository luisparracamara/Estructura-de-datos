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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra = "luis";
        int longitud = palabra.length();
        System.out.println(invertirPalabra(palabra,longitud-1));
        
        
    }
    
    public static String invertirPalabra(String n, int longitud){
        if (longitud == 0) {
            return n.charAt(longitud)+ "";
        }else{
            
            String letra = n.charAt(longitud)+"";
            
            String palabra = letra + invertirPalabra(n,longitud-1);
            System.out.println("paso numero " + longitud + " " + palabra);
            return palabra;
        }
    }
    
}
