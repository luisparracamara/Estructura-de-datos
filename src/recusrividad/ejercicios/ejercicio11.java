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
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(contarCaracteres("hola",0));
        mostrarCadena("hola",0);
    }
    
    public static int contarCaracteres(String cadena, int indice){
        try{
            cadena.charAt(indice);
            return 1+contarCaracteres(cadena, indice+1);
        }catch(IndexOutOfBoundsException ex){
            System.out.println("fin");
        }
        
        return 0;
    }
    
    
    public static void mostrarCadena(String cadena, int indice){
        try{
            char c = cadena.charAt(indice);
            System.out.print(c+"-");
            mostrarCadena(cadena,indice+1);
        }catch(IndexOutOfBoundsException ex){
            System.out.println("fin");
        }
    }
    
    
}
