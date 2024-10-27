package grafos.nuevosGrafos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class PruebaBFS {

    public static void main(String[] args) {

        // Definir el número de vértices en el grafo
        int vertex = 7;

        // Crear la lista de adyacencia usando un ArrayList de ArrayLists
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(vertex);

        // Inicializar la lista de adyacencia para cada vértice
        for (int i = 0; i < vertex; i++) {
            adj.add(new ArrayList<>());
        }

//        addEdge(adj, 0, 1);
//
//        addEdge(adj, 1, 2);
//        addEdge(adj, 1, 6);
//
//        addEdge(adj, 2, 1);
//        addEdge(adj, 2, 4);
//
//        addEdge(adj, 3, 5);
//
//        addEdge(adj, 4, 2);
//        addEdge(adj, 4, 6);
//
//        addEdge(adj, 5, 3);
//
//        addEdge(adj, 6, 1);
//        addEdge(adj, 6, 4);

        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 6);
        addEdge(adj, 6, 4);
        addEdge(adj, 4, 2);
        addEdge(adj, 3, 5);

        BFS(0, vertex, adj);

    }

    // Método para agregar un borde entre dos vértices en la lista de adyacencia
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        //adj.get(v).add(u); // Si es un grafo no dirigido, agregar en ambas direcciones

    }

    // Function to perform BFS traversal from a given source vertex
    static void BFS(int start, int vertices, ArrayList<ArrayList<Integer>> adj) {
        // Mark all vertices as not visited
        boolean visited[] = new boolean[vertices];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue and print it
            start = queue.poll();
            System.out.print(start + " ");

            // Get all adjacent vertices of the dequeued vertex start.
            // If an adjacent vertex has not been visited, then mark it
            // visited and enqueue it
            for (int n : adj.get(start)) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

}
