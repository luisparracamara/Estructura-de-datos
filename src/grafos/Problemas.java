package grafos;

import java.util.*;
import java.util.stream.Collectors;

public class Problemas {

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {

        boolean []visitado = new boolean[rooms.size()];
        for (int i = 0; i < rooms.size(); i++) {
            visitado[i] = false;
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < rooms.size(); i++) {
            if (!visitado[i]) {
                dfs(rooms, i, visitado, set);
            }
        }

        System.out.println(set);


        return true;
    }


    private static void dfs(List<List<Integer>> rooms, int i, boolean[] visitado, Set<Integer> set) {
        visitado[i] = true;
//        System.out.print(i + " ");
//        System.out.print(rooms.get(i));

        for (int neighbor : rooms.get(i)) {
            if (!visitado[neighbor]) {
                dfs(rooms, neighbor, visitado, set);
            }
        }

    }


    public static void DFS(List<List<Integer>> rooms, int inicio){
        int size = rooms.size();
        boolean []visitado = new boolean[size];

        Stack<Integer> pila = new Stack<>();
        pila.push(inicio);

        while(!pila.isEmpty()){
            inicio = pila.pop();

            if (!visitado[inicio]) {
                System.out.print(inicio + " ");
                visitado[inicio] = true;
            }

            for (int siguiente : rooms.get(inicio)) {
                if (!visitado[siguiente])
                    pila.push(siguiente);
            }

        }
        System.out.println(Arrays.toString(visitado));
    }

    // prints BFS traversal from a given source s
    static void BFS(List<List<Integer>> rooms, int inicio) {
        int size = rooms.size();
        boolean visited[] = new boolean[size];

        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[inicio]=true;
        queue.add(inicio);

        while (!queue.isEmpty()) {
            // Dequeue a vertex from queue and print it
            inicio = queue.poll();
            System.out.print(inicio+" ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            for (int n : rooms.get(inicio)) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }


    public static void main(String[] args) {

        List<List<Integer>> rooms = new ArrayList<>();

//        rooms.add(Arrays.asList(1,3));
//        rooms.add(Arrays.asList(3,0,1));
//        rooms.add(Arrays.asList(2));
//        rooms.add(Arrays.asList(0));

//        rooms.add(Arrays.asList(1));
//        rooms.add(Arrays.asList(2));
//        rooms.add(Arrays.asList(3));
//        rooms.add(Arrays.asList());

        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList());
        rooms.add(Arrays.asList(1));


        //[[6,7,8],[5,4,9],[],[8],[4],[],[1,9,2,3],[7],[6,5],[2,3,1]]

        //System.out.println(canVisitAllRooms(rooms));

        //DFS(rooms, 0);
        //BFS(rooms, 0);
        //System.out.println(recorrido(rooms));
        System.out.println(recorrido2(rooms));

    }

    private static boolean recorrido(List<List<Integer>> rooms) {
        int size = rooms.size();
        boolean visited[] = new boolean[size];

        Stack<Integer> pila = new Stack<>();
        pila.push(1);

        Set<Integer> valores = new HashSet<>();

        valores.addAll(rooms.get(0));
        visited[0] = true;

        while (!pila.isEmpty()) {
            int inicio = pila.pop();

            if (!visited[inicio]) {
                visited[inicio] = true;

                List<Integer> subList = rooms.get(inicio);
                if (!subList.isEmpty()) {

                    //List<Integer> list =  subList.stream().filter(valores::contains).collect(Collectors.toList());

                    List<Integer> list = valores.stream().filter(integer -> integer.equals(inicio)).collect(Collectors.toList());
                    List<Integer> listKeys = subList.stream().filter(valores::contains).collect(Collectors.toList());


                    System.out.println("---------");
                    System.out.println("valores: "+valores);
                    System.out.println("sublist: "+subList);
                    System.out.println(list);

                    if (list.isEmpty() && listKeys.isEmpty()) return false;

                    valores.addAll(subList);
                }

            }

            if (inicio < size-1) {
                pila.push(inicio+1);
            }

        }

        return true;

    }


    private static boolean recorrido2(List<List<Integer>> rooms) {
        int size = rooms.size();
        boolean visited[] = new boolean[size];

        Stack<Integer> pila = new Stack<>();
        pila.push(1);

        Set<Integer> valores = new HashSet<>();

        valores.addAll(rooms.get(0));
        visited[0] = true;

        while (!pila.isEmpty()) {
            int inicio = pila.pop();

            if (!visited[inicio]) {
                visited[inicio] = true;

                List<Integer> subList = rooms.get(inicio);
                if (!subList.isEmpty()) {
                    valores.addAll(subList);
                }

            }

            System.out.println(valores);

            if (inicio < size-1) {
                pila.push(inicio+1);
            }

        }

        return true;

    }


}
