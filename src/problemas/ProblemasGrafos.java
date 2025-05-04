package problemas;

import java.util.*;

public class ProblemasGrafos {


    public static void main(String[] args) {


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

        int[][] graph = {
                {0,1},
                {1,2},
                {2,0},
        };

        System.out.println(canFinish(3, graph));
        //findCircleNum(graph);
//        System.out.println(findCircleNum(graph));

    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> list = createList(numCourses, prerequisites);
        Set<Integer> validados = new HashSet<>();

        for (int i = 0; i < numCourses; i++) {
            boolean[] visited = new boolean[list.size()];
            boolean dfs = dfsFull(i, list, visited, validados);
            if (!dfs){
                return false;
            } else {
                validados.add(i);
            }
        }

        return true;
    }


    public static boolean dfsFull(int vertex, List<List<Integer>> list, boolean[] visited, Set<Integer> validados) {
        visited[vertex] = true;
        System.out.println("valor: "+vertex);

        for (int i = 0; i < list.get(vertex).size(); i++) {
            int value = list.get(vertex).get(i);
            if (!visited[value]) {
                if (validados.contains(value)) {
                    return false;
                }
                dfsFull(value, list, visited, validados);
            }
        }
        return true;
    }

    public static List<List<Integer>> createList(int numCourses, int[][] prerequisites) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            res.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int src = prerequisites[i][0];
            int dest = prerequisites[i][1];
            res.get(src).add(dest);
        }

        return res;
    }


    private static void dfs(int vertex, List<List<Integer>> graph, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int i = 0; i < graph.get(vertex).size(); i++) {
            int neighbor = graph.get(vertex).get(i);
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
    }

    public static  List<List<Integer>> getList(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < graph[i].length; j++) {
                list.add(graph[i][j]);
            }
            res.add(list);
        }
        return res;
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
