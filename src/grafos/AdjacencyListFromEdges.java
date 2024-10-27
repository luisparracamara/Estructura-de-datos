package grafos;

import java.util.*;

public class AdjacencyListFromEdges {
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        // Create an adjacency list representation of the graph
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        System.out.println(graph);

        boolean[] visited = new boolean[n];
        return true;
    }

    


    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {
                {0, 1},
                {0, 2},
                {3, 5},
                {5, 4},
                {4, 3},
        };
        int source = 0;
        int destination = 5;

        boolean isValidPath = validPath(n, edges, source, destination);
        System.out.println("Is there a valid path from source to destination? " + isValidPath);
    }
}
