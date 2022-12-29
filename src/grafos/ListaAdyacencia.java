/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.*;



public class ListaAdyacencia {

    private int vertice;   // No. of vertices 
    private LinkedList<Integer> lista[]; //Adjacency Lists 
  
    // Constructor 
    ListaAdyacencia(int v) 
    { 
        vertice = v; 
        lista = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            lista[i] = new LinkedList(); 
    } 
  
    // Function to add an edge into the graph 
    void addEdge(int vertice,int peso) 
    { 
        lista[vertice].add(peso); 
    } 
    
        public void printGraph(){
        for (int i = 0; i <vertice ; i++) {
            if(lista[i].size()>0) {
                System.out.print("Vertex " + i + " is connected to: ");
                for (int j = 0; j < lista[i].size(); j++) {
                    System.out.print(lista[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }

	public static void main(String[] args) {
		ListaAdyacencia g=new ListaAdyacencia(10);
                g.addEdge(0, 1);
                g.addEdge(0, 3);
                g.addEdge(0, 4);

                g.addEdge(1, 0);
                g.addEdge(1, 2);

                g.addEdge(2, 1);
                g.addEdge(2, 3);
                g.addEdge(2, 4);

                g.addEdge(3, 0);
                g.addEdge(3, 2);

                g.addEdge(4, 0);
                g.addEdge(4, 2);
                
                
		
                g.printGraph();

	}
}
 

    

    

