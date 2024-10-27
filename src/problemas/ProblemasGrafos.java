package problemas;

import java.util.*;

public class ProblemasGrafos {


    public static void main(String[] args) {

        int[][] graph = {
                {0,1},
                {0,2},
                {0,5},
                {0,4},
                {3,2},
                {6,5}
        };

//        char[][] graph = {
//                {'O','X','X','X','X'},
//                {'X','O','O','X','X'},
//                {'X','X','X','O','X'},
//                {'X','O','O','X','X'},
//                {'X','X','O','X','X'},
//        };


        //prueba(graph);

//        List<List<Integer>> request = new ArrayList<>();
//        request.add(Arrays.asList(1,3));
//        request.add(Arrays.asList(3,0,1));
//        request.add(Arrays.asList(2));
//        request.add(Arrays.asList(0));

//        request.add(Arrays.asList(1));
//        request.add(Arrays.asList(2));
//        request.add(Arrays.asList(3));
//        request.add(Arrays.asList());


//        BFS(0, graph);

        int[][] adjacencyMatrix = new int[7][7];

        addEdge(0,1, adjacencyMatrix);
        addEdge(0,2, adjacencyMatrix);
        addEdge(0,3, adjacencyMatrix);

        addEdge(1,0, adjacencyMatrix);
        addEdge(1,5, adjacencyMatrix);

        addEdge(2,0, adjacencyMatrix);
        addEdge(2,3, adjacencyMatrix);

        addEdge(3,0, adjacencyMatrix);
        addEdge(3,2, adjacencyMatrix);
        addEdge(3,4, adjacencyMatrix);

        addEdge(4,3, adjacencyMatrix);
        addEdge(4,6, adjacencyMatrix);

        addEdge(5,1, adjacencyMatrix);
        addEdge(5,6, adjacencyMatrix);

        addEdge(6,4, adjacencyMatrix);
        addEdge(6,5, adjacencyMatrix);

        printGraph(adjacencyMatrix);

    }

    public static void addEdge(int source, int destination, int[][] adjacencyMatrix) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1; // Para grafos no dirigidos
    }

    public static void printGraph(int[][] adjacencyMatrix) {
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix.length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void BFS(int startVertex, int[][] adjacencyMatrix) {
        boolean[] visited = new boolean[adjacencyMatrix.length];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int i = 0; i < adjacencyMatrix.length; i++) {
                if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }


    public static int dfsIslands(char[][] graph, int startRow, int startCol) {

        int res = 0;

        // Direcciones para moverse en la matriz (arriba, derecha, abajo, izquierda)
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};
        boolean[][] visited = new boolean[graph.length][graph[0].length];
        Stack<int[]> stack = new Stack<>();
        //crea arreglo con las posiciones, 0,0
        stack.push(new int[]{startRow, startCol});

        while (!stack.isEmpty()) {
            int[] cell = stack.pop();
            int row = cell[0];
            int col = cell[1];

            if (row >= 0 && row < graph.length && col >= 0 && col < graph[0].length && !visited[row][col]) {

                visited[row][col] = true;
                System.out.println("El valor en la fila " + row + " y columna " + col + " es: " + graph[row][col]);

                if (graph[row][col] == '1') {

                    if (col+1 < graph[0].length && graph[row][col + 1] == '1' && !visited[row][col+1]) {
                        stack.push(new int[]{row, col+1});
                        continue;
                    }

                    //validar que columnas esten en rango
                    //validar que filas estén en rango
                    if (col-1 >= 0 && graph[row][col - 1] == '1' && !visited[row][col-1]) {
                        stack.push(new int[]{row, col-1});
                        continue;
                    }

                    if (row+1 < graph.length && graph[row+1][col] == '1' && !visited[row+1][col]) {
                        stack.push(new int[]{row+1, col});
                        continue;
                    }

                    if (row-1 >= 0 && graph[row-1][col] == '1' && !visited[row-1][col]) {
                        stack.push(new int[]{row-1, col});
                        continue;
                    }

                    res++;
                    System.out.println(res);

                }
            } else {
                continue;
            }


            // Añadir celdas adyacentes a la pila
            for (int i = 0; i < 4; i++) {
                int newRow = row + dRow[i];
                int newCol = col + dCol[i];
                stack.push(new int[]{newRow, newCol});
            }
        }

        return res;
    }





    public static void prueba(char[][] graph) {
//        List<List<Integer>> list = convertToList(graph);
//        System.out.println(list);
//        List<Integer> dfs = dfsOfGraph(graph.length, list);
//        System.out.println(dfs);
//        List<Integer> bfs = bfsOfGraph(graph.length, list);
//        System.out.println(bfs);

        dfsMatrix(graph,0,0);

    }


    public static void dfs(List<List<Integer>> adj, List<Integer> ans, int node, int[] visited){
        visited[node]=1;
        ans.add(node);
        for(Integer i:adj.get(node)){
            if(visited[i]==0){
                System.out.println("NODO: "+adj.get(i));
                dfs(adj,ans,i,visited);
            }
        }
    }
    public static List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        List<Integer> ans=new ArrayList<>();
        int[] visited=new int[V];
        dfs(adj,ans,0,visited);
        return ans;

    }

    public static List<List<Integer>> convertToList(String[][] adjacencyMatrix) {
        int V = adjacencyMatrix.length;
        List<List<Integer>> adjacencyList = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adjacencyMatrix[i][j].equals("1")) { // Assuming 1 indicates an edge
                    adjacencyList.get(i).add(j);
                }
            }
        }

        return adjacencyList;
    }

    public static List<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
        ArrayList<Integer> bfs=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int[] visited=new int[V];

        q.add(0);
        visited[0]=1;
        while(!q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);
            for(Integer i:adj.get(node)){
                if(visited[i]==0){
                    q.add(i);
                    visited[i]=1;
                }
            }

        }
        return bfs;
    }

    public static void dfsMatrix(char[][] graph, int startRow, int startCol) {

        // Direcciones para moverse en la matriz (arriba, derecha, abajo, izquierda)
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};
        boolean[][] visited = new boolean[graph.length][graph[0].length];
        Stack<int[]> stack = new Stack<>();
        //crea arreglo con las posiciones, 0,0
        stack.push(new int[]{startRow, startCol});

        while (!stack.isEmpty()) {
            int[] cell = stack.pop();
            int row = cell[0];
            int col = cell[1];

            if (!isValid(graph, visited, row, col)) {
                continue;
            }

            visited[row][col] = true;
            //System.out.print("(" + row + "," + col + ") ");

            // Añadir celdas adyacentes a la pila
            for (int i = 0; i < 4; i++) {
                int newRow = row + dRow[i];
                int newCol = col + dCol[i];
                stack.push(new int[]{newRow, newCol});
            }
        }
    }

    private static boolean isValid(char[][] grid, boolean[][] visited, int row, int col) {

        if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && !visited[row][col]) {
            System.out.println("El valor en la fila " + row + " y columna " + col + " es: " + grid[row][col]);
            return true;
        }
        return false;
    }


}
