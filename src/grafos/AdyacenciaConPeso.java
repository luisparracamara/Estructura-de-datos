/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.LinkedList;

/**
 *
 * @author Luis Parra
 */
public class AdyacenciaConPeso {
 int vertice;
    LinkedList<Edge> lista[];
    
    AdyacenciaConPeso(int v){
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
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShortestPath sp = new ShortestPath(6);
        
        sp.addEdge(0, 1, 1);
        sp.addEdge(1, 2, 4);
        sp.addEdge(1, 3, 2);
        sp.addEdge(2, 3, 5);
 
        
        sp.printGraph();
    }
    
}

