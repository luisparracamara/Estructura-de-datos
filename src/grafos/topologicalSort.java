/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Luis Parra
 */
public class topologicalSort {

    int vertice;
    LinkedList<Integer> lista[];
    
    topologicalSort(int total){
        vertice = total;
        lista = new LinkedList[total];
        for (int i = 0; i < vertice; i++) {
            lista[i] = new LinkedList();
        }
    }
    
    public void addEdge(int vertice, int conectar){
        lista[vertice].add(conectar);
    }
    
    public void imprimir(){
        for (int i = 0; i < vertice; i++) {
            if (lista[i].size()>0) {
                System.out.println("Vertice "+i+" conectado con " + lista[i]);
            }
        }
    }
    
    public void topologicalSort(){
        Stack<Integer> stack = new Stack<Integer>();
        boolean visitado[] = new boolean[vertice];
        for (int i = 0; i < vertice; i++) {
            visitado[i] = false;
        }
        
        for (int i = 0; i < vertice; i++) {
            if (visitado[i] == false) {
                ordenamientoTopologico(i,visitado,stack);
            }
        }
        
        while(stack.isEmpty() == false){
            System.out.print(stack.pop() + " ");  
        }

    }
    
    
    public void ordenamientoTopologico(int posicion, boolean visitado[], Stack<Integer> stack){
        visitado[posicion] = true;
        int siguiente;
        
        Iterator<Integer> i = lista[posicion].listIterator();
        System.out.println(lista[2]);
        while (i.hasNext()){
            siguiente = i.next();
            if (visitado[siguiente]==false){
                ordenamientoTopologico(siguiente, visitado, stack); 
            }
        }
        
        stack.push(posicion);  

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        topologicalSort tps = new topologicalSort(6);
     
        
        /*tps.addEdge(0, 1);
        tps.addEdge(0, 4);
        tps.addEdge(1, 2);
        tps.addEdge(1, 3);
        tps.addEdge(3, 0);
        tps.addEdge(4, 0);*/
        
        tps.addEdge(5, 2);  
        tps.addEdge(5, 0);  
        tps.addEdge(4, 0);  
        tps.addEdge(4, 1);  
        tps.addEdge(2, 3);  
        tps.addEdge(3, 1);  

        
        
          
        tps.topologicalSort();
        System.out.println("");
        
        tps.imprimir();
    }
    
}
