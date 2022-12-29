/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author Luis Parra
 */
public class ClassStringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 3;
        StringBuilder s = new StringBuilder(n);
        
        //agregar al final;
        s.append("hola");
        System.out.println(s.capacity());
        System.out.println(s.length());
        s.reverse();
        
        //modifica una letra de la palabra
        s.setCharAt(0, 'q');
        //modficar capacidad
        s.setLength(4);
        //convertir a string
        String res = s.toString();
        //añadir por posicion
        s.insert(0, "gol");
        s.delete(0, 5);
        s.deleteCharAt(0);
        s.replace(0, 1, "luis");
        
        //encontrar el primer indice// devuelve posicion
        System.out.println(s.indexOf("s"));
        
        //regresa una parte del string segun la posicion
        System.out.println(s.substring(2));
        
        System.out.println(s);
        
        
        //utilizar numeros preasignados como abecedario
        for (int i = 0; i < s.length(); i++) {
            char letra = s.charAt(i);
            int resp = letra - 'a';
            System.out.println("valor en el abecedario:"+ resp);
        }
        
        
    }
    
}
