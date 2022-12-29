/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Luis Parra
 */
public class ClassQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<String>();
        
        cola.add("n1");
        cola.add("n2");
        cola.add("n3");
        
        cola.peek();
        cola.isEmpty();
        cola.poll();
        cola.size();
        cola.contains("n1");
        System.out.println(cola.toArray()[0]);
        
        System.out.println(cola);
        
    }
    
}
