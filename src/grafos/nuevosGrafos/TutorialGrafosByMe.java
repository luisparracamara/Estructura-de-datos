package grafos.nuevosGrafos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TutorialGrafosByMe {

    public static void main(String[] args) {

        System.out.println("---ADJACENCY MATRIX---");
        int[][] adjacencyMatrix = createMatrix(7, 7);
        System.out.println("---BFS MATRIX---");
        bfsMatrix(adjacencyMatrix, 0);

        System.out.println("---ADJACENCY LIST---");
        List<List<Integer>> adjacencyList = createAdjacencyList(7);
        System.out.println(adjacencyList);

        System.out.println("---DFS ADJACENCY LIST---");
        dfs(adjacencyList, 0);
        System.out.println();

        System.out.println("---BFS ADJACENCY LIST---");
        bfsAdjacencyList(adjacencyList, 0);

        System.out.println("---MATRIX TO ADJACENCY LIST---");
        List<List<Integer>> convertedList = matrixToList(adjacencyMatrix);
        System.out.println(convertedList);

        System.out.println("---MATRIX OF EDGES TO ADJACENCY LIST---");
        int[][] edges = createEdgesList();
        List<List<Integer>> edgesToList = edgesToList(edges, 7);
        System.out.println(edgesToList);

    }

    public static int[][] createMatrix(int numRows, int numColumns) {
        int[][] adjacencyMatrix = new int[numRows][numColumns];

        addEdge(0, 1, adjacencyMatrix);
        addEdge(0, 2, adjacencyMatrix);
        addEdge(0, 3, adjacencyMatrix);

        addEdge(1, 0, adjacencyMatrix);
        addEdge(1, 5, adjacencyMatrix);

        addEdge(2, 0, adjacencyMatrix);
        addEdge(2, 3, adjacencyMatrix);

        addEdge(3, 0, adjacencyMatrix);
        addEdge(3, 2, adjacencyMatrix);
        addEdge(3, 4, adjacencyMatrix);

        addEdge(4, 3, adjacencyMatrix);
        addEdge(4, 6, adjacencyMatrix);

        addEdge(5, 1, adjacencyMatrix);
        addEdge(5, 6, adjacencyMatrix);

        addEdge(6, 4, adjacencyMatrix);
        addEdge(6, 5, adjacencyMatrix);

        printGraph(adjacencyMatrix);

        return adjacencyMatrix;
    }

    /**
     * creacion de matriz adyacente
     */
    public static void addEdge(int source, int destination, int[][] adjacencyMatrix) {
        adjacencyMatrix[source][destination] = 1;

        //si es grafo dirigido, solo comentar esta linea
        //o si insertas todos los valores
        //adjacencyMatrix[destination][source] = 1; // Para grafos no dirigidos
    }

    //O(V+E) VERTEX+EDGES
    public static void bfsMatrix(int[][] adjacencyMatrix, int value) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(value);

        boolean[] visited = new boolean[adjacencyMatrix.length];
        visited[value] = true;

        while (!queue.isEmpty()) {
            //System.out.println("queue: " + queue);
            int node = queue.poll();
            System.out.println(node + " ");

            for (int i = 0; i < adjacencyMatrix[0].length; i++) {
                if (adjacencyMatrix[node][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }


    //O(V+E) VERTEX+EDGES
    public static void bfsAdjacencyList(List<List<Integer>> adjacencyList, int starterVertex) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(starterVertex);

        boolean[] visited = new boolean[adjacencyList.size()];
        visited[starterVertex] = true;

        while (!queue.isEmpty()) {
            System.out.println("queue: " + queue);
            int node = queue.poll();
            //System.out.println(node + " ");

            for (int i = 0; i < adjacencyList.get(node).size(); i++) {
                int value = adjacencyList.get(node).get(i);
                if (!visited[value]) {
                    queue.add(value);
                    visited[value] = true;
                }
            }
        }
    }

    public static void printGraph(int[][] adjacencyMatrix) {
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix.length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> createAdjacencyList(int numVertex) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numVertex; i++) {
            list.add(new ArrayList<>());
        }

        fillAdjacencyList(0, 1, list);
        fillAdjacencyList(0, 2, list);
        fillAdjacencyList(0, 3, list);

        fillAdjacencyList(1, 0, list);
        fillAdjacencyList(1, 5, list);

        fillAdjacencyList(2, 0, list);
        fillAdjacencyList(2, 3, list);

        fillAdjacencyList(3, 0, list);
        fillAdjacencyList(3, 2, list);
        fillAdjacencyList(3, 4, list);

        fillAdjacencyList(4, 3, list);
        fillAdjacencyList(4, 6, list);

        fillAdjacencyList(5, 1, list);
        fillAdjacencyList(5, 6, list);

        fillAdjacencyList(6, 4, list);
        fillAdjacencyList(6, 5, list);

        return list;
    }

    public static void fillAdjacencyList(int source, int destination, List<List<Integer>> adjacencyList) {
        adjacencyList.get(source).add(destination);
        //si es grafo dirigido, solo comentar esta linea
        //o si insertas todos los valores
        //adjacencyList.get(destination).add(source);
    }

    //Matriz de Aristas
    //Ventaja: Directa y sencilla para grafos muy pequeños.
    //
    //Desventaja: Ineficiente para operaciones frecuentes debido a la complejidad de
    //O(E) por cada vértice.
    //
    //Lista de Adyacencia
    //Ventaja: Más eficiente para la mayoría de las operaciones, con una complejidad de tiempo de
    //O(V+E). Fácil para BFS y DFS.
    //
    //Desventaja: Requiere una conversión inicial.
    public static void dfs(List<List<Integer>> adjacencyList, int startVertex) {
        boolean[] visited = new boolean[adjacencyList.size()];
        dfsAdjacencyList(startVertex, adjacencyList, visited);
    }

    //O(V+E)
    //VERTEX+EDGES
    public static void dfsAdjacencyList(int node, List<List<Integer>> adjacencyList, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int i = 0; i < adjacencyList.get(node).size(); i++) {
            int neighbor = adjacencyList.get(node).get(i);
            if (!visited[neighbor]) {
                dfsAdjacencyList(neighbor, adjacencyList, visited);
            }

        }
    }

    // N'2 square
    public static List<List<Integer>> matrixToList(int[][] adjacencyMatrix) {

        List<List<Integer>> adjacencyList = new LinkedList<>();

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            List<Integer> adyacentes = new ArrayList<>();

            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    adyacentes.add(j);
                }
            }
            adjacencyList.add(adyacentes);
        }

        return adjacencyList;
    }

    // Método para convertir la matriz de aristas a lista de adyacencia, cuando la matriz tiene posicion 0 y es representada por los valores del arreglo en posicion 0
    // O(V+E)
    public static List<List<Integer>> convertToAdjacencyList(int[][] graph) {
        List<List<Integer>> adjacencyList = new ArrayList<>(graph.length);
        for (int i = 0; i < graph.length; i++) {
            List<Integer> neighbors = new ArrayList<>();
            for (int j = 0; j < graph[i].length; j++) {
                neighbors.add(graph[i][j]);
            }
            adjacencyList.add(neighbors);
        }
        return adjacencyList;
    }


    // el 0 se conecta con el 1,2,3
    public static int[][] createEdgesList() {
        return new int[][]{
                {0, 1},
                {0, 2},
                {0, 3},
                {1, 5},
                {2, 3},
                {3, 4},
                {4, 6},
                {5, 6},
        };

    }

    //crear lista de adyacencia a partir de solo los vertices
    // O(V+E)
    public static List<List<Integer>> edgesToList(int[][] edges, int numVertex) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < numVertex; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int source = edges[i][0];
            int dest = edges[i][1];
            adjacencyList.get(source).add(dest);
            adjacencyList.get(dest).add(source); // Para grafos no dirigidos
        }
        return adjacencyList;
    }

    public static void bfsMatrixValuesMoreThanOneAndZero(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println("Visitando: " + node);

            for (int i = 0; i < graph[node].length; i++) {
                int neighbor = graph[node][i];
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    // DFS Recursivo para matriz 2D
    public static void dfs2DRecursive(int[][] grid, int row, int col, boolean[][] visited) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Caso base: fuera de límites o ya visitado
        if (row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col]) {
            return;
        }

        // Procesar la celda actual
        visited[row][col] = true;
        System.out.println("Visitado: (" + row + ", " + col + ") = " + grid[row][col]);

        // Llamar recursivamente a los 4 vecinos DIRECTAMENTE
        dfs2DRecursive(grid, row-1, col, visited);    // Arriba
        dfs2DRecursive(grid, row+1, col, visited);    // Abajo
        dfs2DRecursive(grid, row, col-1, visited);    // Izquierda
        dfs2DRecursive(grid, row, col+1, visited);    // Derecha

    }

    // BFS para matriz 2D (iterativo con cola)
    public static void bfs2D(int[][] grid, int startRow, int startCol) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> queue = new LinkedList<>();

        // Direcciones: arriba, abajo, izquierda, derecha
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Iniciar BFS desde el punto inicial
        queue.offer(new int[]{startRow, startCol});
        visited[startRow][startCol] = true;

        System.out.println("=== BFS empezando desde (" + startRow + ", " + startCol + ") ===");

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];

            // Procesar la celda actual
            System.out.println("Visitado: (" + row + ", " + col + ") = " + grid[row][col]);

            // Explorar todos los vecinos
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                // Verificar límites y si no ha sido visitado
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                        && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }
    }

}
