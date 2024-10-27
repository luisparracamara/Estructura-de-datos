package grafos.nuevosGrafos;

import java.util.ArrayList;

public class Dfs {

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
        addEdge(adj, 0, 2);
        addEdge(adj, 3, 5);
        addEdge(adj, 5, 4);
        addEdge(adj, 4, 3);
        vertex = 6;


        System.out.println(adj);


        System.out.println(dfsOfGraph(vertex, adj));
    }

    // Método para agregar un borde entre dos vértices en la lista de adyacencia
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        //adj.get(v).add(u); // Si es un grafo no dirigido, agregar en ambas direcciones

    }

    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> dfsStore = new ArrayList<>();
        boolean vis[] = new boolean[V + 1];

        for(int i = 0; i < V; i++){
            if(!vis[i]){
                dfs(i, vis, adj, dfsStore);
            }
        }
        return dfsStore;
    }
    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfsStore){
        dfsStore.add(node);
        vis[node] = true;

        for(Integer i : adj.get(node)){
            if(!vis[i]){
                dfs(i, vis, adj, dfsStore);
            }
        }
    }

}
