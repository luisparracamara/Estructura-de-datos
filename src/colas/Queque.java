/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Luis Parra
 */
public class Queque {

    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<Integer>();
        cola.add(10);
        cola.add(20);
        
        cola.remove();
        System.out.println("inicio: "+cola.peek());
        System.out.println(cola.size());
        System.out.println(cola.isEmpty());
        cola.clear();
    }
    
}
