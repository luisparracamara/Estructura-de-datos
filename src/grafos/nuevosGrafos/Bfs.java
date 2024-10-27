package grafos.nuevosGrafos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bfs {

    public static void main(String[] args) {

        // Definir el número de vértices en el grafo
        //int vertex = 5;
        int vertex = 7;

        // Crear la lista de adyacencia usando un ArrayList de ArrayLists
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(vertex);

        // Inicializar la lista de adyacencia para cada vértice
        for (int i = 0; i < vertex; i++) {
            adj.add(new ArrayList<>());
        }

        // Agregar bordes al grafo (para este ejemplo, es un grafo no dirigido)
//        addEdge(adj, 0, 1);
//        addEdge(adj, 0, 4);
//        addEdge(adj, 1, 2);
//        addEdge(adj, 1, 3);
//        addEdge(adj, 1, 4);
//        addEdge(adj, 2, 3);
//        addEdge(adj, 3, 4);

//        addEdge(adj, 1, 2);
//
//        addEdge(adj, 2, 7);
//        addEdge(adj, 2, 3);
//        addEdge(adj, 2, 1);
//
//        addEdge(adj, 3, 5);
//        addEdge(adj, 3, 2);
//
//        addEdge(adj, 7, 2);
//        addEdge(adj, 7, 5);
//
//        addEdge(adj, 4, 6);
//        addEdge(adj, 6, 4);

//        addEdge(adj, 0, 1);
//        addEdge(adj, 1, 2);
//        addEdge(adj, 2, 0);
//        addEdge(adj, 2, 3);
//        addEdge(adj, 3, 3);

        addEdge(adj, 0, 1);

        addEdge(adj, 1, 2);
        addEdge(adj, 1, 6);

        addEdge(adj, 2, 1);
        addEdge(adj, 2, 4);

        addEdge(adj, 3, 5);

        addEdge(adj, 4, 2);
        addEdge(adj, 4, 6);

        addEdge(adj, 5, 3);

        addEdge(adj, 6, 1);
        addEdge(adj, 6, 4);


        System.out.println(adj);

        bfsOfGraph(vertex, adj);

    }

    // Método para agregar un borde entre dos vértices en la lista de adyacencia
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        //adj.get(v).add(u); // Si es un grafo no dirigido, agregar en ambas direcciones

    }

    // Function to return Breadth First Traversal of given graph.
    public static List<Integer> bfsOfGraph(int vertex, List<ArrayList<Integer>> adj) {

        //actual lista
        ArrayList<Integer> bfs = new ArrayList<>();
        //array de visitas
        boolean []vis = new boolean[vertex + 1];
        //declarar queue
        Queue<Integer> q = new LinkedList<>();

        //agregar primer elemento
        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            System.out.println("nodo: "+node);

            for(Integer i : adj.get(node)){
                if(!vis[i]){
                    q.add(i);
                    vis[i] = true;
                }
            }
        }

        System.out.println(bfs);
        return bfs;
    }

}
