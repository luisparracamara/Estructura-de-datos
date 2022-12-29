/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

// Java program to find single source shortest paths in Directed Acyclic Graphs 
import java.io.*; 
import java.util.*; 
  
class prueba { 

    class Edge{
        int src,dest,weight;
        Edge(){
        src = dest = weight = 0;
        }
    }
    
    int vertices, arcos;
    Edge edge[];

    prueba(int cantidadVertices, int cantidadArcos){
        vertices = cantidadVertices;
        arcos = cantidadArcos;
        edge = new Edge[cantidadArcos];
        
        for (int i = 0; i < cantidadArcos; i++) {
            edge[i] = new Edge(); 
        }
    }
    
    void BellmanFord(prueba graph, int src){
        
        
        int dist[] = new int[vertices];
        
        for (int i = 0; i < vertices; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        
        for (int i = 1; i < vertices; i++) {
            for (int j = 0; j < arcos; j++) {
                int u = graph.edge[j].src;
                int v = graph.edge[j].dest;
                int weight = graph.edge[j].weight;
                
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u]+weight;
                }
            }
        }
        
        //por si existen ciclos negativos
         for (int j = 0; j < arcos; ++j) { 
            int u = graph.edge[j].src; 
            int v = graph.edge[j].dest; 
            int weight = graph.edge[j].weight; 
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) { 
                System.out.println("Graph contains negative weight cycle"); 
                return; 
            } 
        }
        
        imprimir(dist,vertices);
    }
    
    public void imprimir(int dist[], int vertices){
        System.out.println("Distancia del vertice inicio-fin");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }
    
    public static void main(String[] args){ 
        int V = 4; // Number of vertices in graph 
        int E = 4; // Number of edges in graph 
  
        prueba graph = new prueba(V, E); 
  
        // add edge 0-1 (or A-B in above figure) 
        graph.edge[0].src = 0; 
        graph.edge[0].dest = 1; 
        graph.edge[0].weight = 1; 
  
        // add edge 0-2 (or A-C in above figure) 
        graph.edge[1].src = 1; 
        graph.edge[1].dest = 2; 
        graph.edge[1].weight = 4; 
  
        // add edge 1-2 (or B-C in above figure) 
        graph.edge[2].src = 1; 
        graph.edge[2].dest = 3; 
        graph.edge[2].weight = 2; 
  
        // add edge 1-3 (or B-D in above figure) 
        graph.edge[3].src = 2; 
        graph.edge[3].dest = 3; 
        graph.edge[3].weight = 5; 
  
        
  
        graph.BellmanFord(graph, 0);                                                                                                                                                                           
     
    } 



}
