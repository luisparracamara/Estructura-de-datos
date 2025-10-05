package grafos.nuevosGrafos;

import java.util.*;

public class BaseProblemas {

    public static void main(String[] args) {

        int[][] graph = {
                {1, 2},
                {3},
                {1, 3},
                {}
        };

        List<List<Integer>> edges = new ArrayList<>();

        edges.add(Arrays.asList(1, 3));
        edges.add(Arrays.asList(2, 0));
        edges.add(Arrays.asList(2, 3));
        edges.add(Arrays.asList(1, 0));
        edges.add(Arrays.asList(4, 1));
        edges.add(Arrays.asList(0, 3));

        //System.out.println(pacificAtlantic(new int[][]{{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}}));

        System.out.println(shortestPathBinaryMatrix(new int[][]{{0,0,0},{1,1,0},{1,1,0}}));

    }

    public static int shortestPathBinaryMatrix(int[][] grid) {

        bfs2D(grid, 0, 0);
        return 0;
    }

    public static void bfs2D(int[][] grid, int startRow, int startCol) {

    }



    private static void dfs(int node, List<List<Integer>> edges, boolean[] visited, int n) {

        if (node >= edges.size()) {
            return;
        }

        visited[node] = true;
        System.out.println(Arrays.toString(visited));

        for (int i = 0; i < edges.get(node).size(); i++) {
            int neighbor = edges.get(node).get(i);
            if (!visited[neighbor]) {
                dfs(neighbor, edges, visited, n);
            }

        }

    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}

class NodeRoutes {
    public int src;
    public int direction;

    public NodeRoutes(int src, int direction) {
        this.src = src;
        this.direction = direction;
    }

    public int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "NodeRoutes{" +
                "src=" + src +
                ", direction=" + direction +
                '}';
    }
}