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
public class Dijkstra {

    int vertices;
    //origen-destino
    int matrix[][];
    
    public Dijkstra(int cantidadVertices){
        vertices = cantidadVertices;
        matrix = new int[vertices][vertices];
    }
    
    public void addEdge(int source, int destino, int peso){
        matrix[source][destino] = peso;
        
        //para utilizar en grafos no dirijidos
        //matrix[destino][source] = peso;
    }
    
    public void imprimirMatriz(){
        for (int i=0; i < vertices; i++){
            for (int j=0; j < vertices; j++)
                System.out.print(" | " + matrix[i][j]+ " | ");   
                System.out.println("\n----------------------------------------");
            }        
    }
    
    
    public void imprimirDijkstra(int source, int[]distancia){
        System.out.println("Dijkstra Algorithm: (Adjacency Matrix)");
        for (int i = 0; i <vertices ; i++) {
                System.out.println("Vertice fuente: " + source + " hacia el vertice " +   + i +
                        " distancia: " + distancia[i]);
            }
    }
    
    public void metodoDijkstra(int source){
        boolean revisado[] = new boolean[vertices];
        int distancia[] = new int[vertices];
        int inf = Integer.MAX_VALUE;
        
        //inicializar todas las distancias a infinito
        for (int i = 0; i < vertices; i++) {
            distancia[i] = inf;
        }
        
        //posicion "source" inicializara a 0
        distancia[source] = 0;
        
        
        //crear el camino mas corto
        for (int i = 0; i < vertices; i++) {
            //obtener la poscion del nodo revisado "source"
            int encontrado  = obtenerMinimoVertice(revisado,distancia);
            
            //marcar nodo como revisado
            revisado[encontrado] = true;
            
            for (int j = 0; j < vertices; j++) {
                
                //si el peso de encontrado y j es mayor a 0 (segun la matriz adyacente]
                if (matrix[encontrado][j] > 0) {
                    
                    //si la posicion j en el arreglo revisado es igual a falso (menos importante)
                    //si el nodo en la posicion encontrado con el destino de j es distinto de ifninito
                    if (revisado[j] == false && matrix[encontrado][j] != inf) {
                        //System.out.println(matrix[encontrado][j]);
                        
                        int actualizado = matrix[encontrado][j] + distancia[encontrado];
                        //System.out.println(actualizado);
                        if (encontrado<distancia[j]) {
                            distancia[j] = actualizado;
                        }
                    }    
                }
            }   
        }
        
        imprimirDijkstra(source, distancia);
    }
    
    
    
    public int obtenerMinimoVertice(boolean revisado[], int distancia[]){
        int inf = Integer.MAX_VALUE;
        int vertice = 0;
        
        for (int i = 0; i < vertices; i++) {
            if (revisado[i] == false && inf > distancia[i]) {
                inf = distancia[i];
                vertice = i;
            }
        }
        return vertice;
    }
    
 
    
  
  
    public static void main(String args[]) { 
        Dijkstra dij = new Dijkstra(4);
        dij.addEdge(0, 1, 1);
        dij.addEdge(1, 2, 4);
        dij.addEdge(1, 3, 2);
        dij.addEdge(2, 3, 5);
           
        
        dij.imprimirMatriz();

        dij.metodoDijkstra(0);
        
    } 
} 
    

