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
public class ShortestPath {
    int vertice;
    LinkedList<Edge> lista[];
    int inf = Integer.MAX_VALUE;
    
    ShortestPath(int v){
        vertice = v;
        lista = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            lista[i]=new LinkedList();
        }
    }
    
    
        static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }
    
    void addEdge(int vertice,int destino, int peso){
        Edge edge = new Edge(vertice, destino, peso);
        lista[vertice].add(edge);
    }
    
    public void printGraph(){
         for (int i = 0; i <vertice ; i++) {
                LinkedList<Edge> list = lista[i];
                for (int j = 0; j <list.size() ; j++) {
                    System.out.println("vertex-" + list.get(j).source + " is connected to " +
                            list.get(j).destination + " with weight " +  list.get(j).weight);
                }
            }
    }
    
    public void topologicalSort(int posicion, boolean visitado[], Stack stack){
        visitado[posicion] = true;
        
        Iterator<Edge> i = lista[posicion].listIterator();
        while (i.hasNext()){
            Edge nodo = i.next();
            if (visitado[nodo.destination] == false) {
                topologicalSort(nodo.destination, visitado, stack);
            }
        }
          stack.push(posicion);

    }
    
    public void shortestPath(int s){
        Stack stack = new Stack(); 
        int dist[] = new int[vertice];
        boolean visitado[] = new boolean[vertice];
        
        for (int i = 0; i < vertice; i++){
            visitado[i] = false; 
        }
                
        
        for (int i = 0; i < vertice; i++) {
            if (visitado[i] == false) {
                topologicalSort(i,visitado,stack);
            }
        }
        
        for (int i = 0; i < vertice; i++) {
            dist[i] = inf;
            
            dist[s] = 0;
            
        }
        
         
        while(stack.isEmpty() == false){
            int u = (int) stack.pop();
            System.out.print(u + " ");  
            
            Iterator<Edge> it = lista[u].listIterator();
                if (dist[u] != inf) {
                    while (it.hasNext()){
                         Edge siguiente = it.next(); 
                           if (dist[siguiente.destination] > dist[u] + siguiente.weight){
                            dist[siguiente.destination] = dist[u] + siguiente.weight; 
                    } 
                    }
                }
            
            
            }   
        System.out.println("");
        // Print the calculated shortest distances 
            for (int i = 0; i < vertice; i++){ 
                if (dist[i] == inf){
                    System.out.print( "INF "); 
                }else{
                    System.out.print( dist[i] + " "); 
                }       
            }   
    }
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShortestPath sp = new ShortestPath(4);
        
        sp.addEdge(0, 1, 1);
        sp.addEdge(1, 2, 4);
        sp.addEdge(1, 3, 2);
        sp.addEdge(2, 3, 5);
        
        /*sp.addEdge(0, 1, 5); 
        sp.addEdge(0, 2, 3); 
        sp.addEdge(1, 3, 6); 
        sp.addEdge(1, 2, 2); 
        sp.addEdge(2, 4, 4); 
        sp.addEdge(2, 5, 2); 
        sp.addEdge(2, 3, 7); 
        sp.addEdge(3, 4, -1); 
        sp.addEdge(4, 5, -2); */
        
        /*sp.addEdge(0, 1, 2);
        sp.addEdge(0, 2, 1);
        sp.addEdge(1, 2, 4);
        sp.addEdge(1, 4, 3);
        sp.addEdge(2, 3, 6);
        sp.addEdge(3, 4, 1);
        sp.addEdge(3, 5, 2); 
        sp.addEdge(4, 5, 1);*/
        
        
        sp.shortestPath(0);
        System.out.println("");

        sp.printGraph();
    }
    
}
