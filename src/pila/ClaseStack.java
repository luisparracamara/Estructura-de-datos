/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author Luis Parra
 */
import java.util.Stack;
public class ClaseStack {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack pila = new Stack();
        int[] arreglo = new int[10];
        
        pila.push(20);
        pila.push(10);
      
        System.out.println(pila.pop());
        System.out.println(pila.peek());
        System.out.println(pila.size());
        System.out.println(pila.isEmpty());
        
    }
    
}
