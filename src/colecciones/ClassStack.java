/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Stack;

/**
 *
 * @author Luis Parra
 */
public class ClassStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<String> pila = new Stack();
        
        pila.add("kovid");
        pila.add("shore");
        pila.add("dunbo");
        pila.add("chorito");
        pila.push("push");
        
        pila.peek();
        pila.pop();
        pila.contains("shore");
        pila.isEmpty();
        pila.get(0);
        pila.set(0, "nuevo");
        pila.size();
        
        System.out.println(pila);
    }
    
}
