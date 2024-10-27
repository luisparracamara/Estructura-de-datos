package grafos.nuevosGrafos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CrearListaAdyacente {

    public static void main(String[] args) {
        int[][] edges = {
                {0,1},
                {0,2},
                {3,5},
                {5,4},
                {4,3}
        };

//        ArrayList<Integer>[] arrayList = (createGraph(6 ,edges));
//
//        for (int i = 0; i < arrayList.length; i++) {
//            ArrayList<Integer> arr = arrayList[i];
//            System.out.println(arr);
//        }


        ArrayList<ArrayList<Integer>> list = createGraphArrayList(6 ,edges);
        System.out.println(list);

        System.out.println(dfsOfGraph(6, list));

    }

    private static ArrayList<Integer>[] createGraph(int n, int[][] edges) {

        ArrayList<Integer>[] lista = (ArrayList<Integer>[]) Array.newInstance(ArrayList.class, n);


        for (int i = 0; i < n; i++) {
            lista[i] = new ArrayList<>();
        }

        for(int []edge : edges) {
            lista[edge[0]].add(edge[1]);
            lista[edge[1]].add(edge[0]);
        }

        return lista;
    }

    private static ArrayList<ArrayList<Integer>> createGraphArrayList(int n, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n);

        //llenar de listas la lista
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        //colocar la lista adyacente
        for(int []edge : edges) {
            //para grafos no dirigidos
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        return adj;

    }

    public static List<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
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
//            System.out.println(adj.get(node));
//            System.out.println(i);
            if(!vis[i]){
                dfs(i, vis, adj, dfsStore);
            }
        }
    }



}
