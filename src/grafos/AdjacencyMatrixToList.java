package grafos;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrixToList {
    public static List<List<Integer>> convertToList(int[][] adjacencyMatrix) {
        int V = adjacencyMatrix.length;
        List<List<Integer>> adjacencyList = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adjacencyMatrix[i][j] == 1) { // Assuming 1 indicates an edge
                    adjacencyList.get(i).add(j);
                }
            }
        }

        return adjacencyList;
    }

    public static void main(String[] args) {
        int[][] adjacencyMatrix = {
                {0, 1, 1, 0},
                {1, 0, 0, 1},
                {1, 0, 0, 1},
                {0, 1, 1, 0}
        };

        List<List<Integer>> adjacencyList = convertToList(adjacencyMatrix);

        // Printing the converted adjacency list
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int j : adjacencyList.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
