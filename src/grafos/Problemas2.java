package grafos;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Problemas2 {

    public static void main(String[] args) {

        int[][] array = {
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };

        int [][] array2 = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };


        System.out.println(findCircleNum(array));

    }

    public static int findCircleNum(int[][] isConnected) {
        boolean[] visitado = new boolean[isConnected.length];
        int contador = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (!visitado[i]) {
                contador++;
                DFSUtil(i, visitado, isConnected);
            }
        }

        return contador;
    }

    // DFS (Depth-First Search) Recursivo
    private static void DFSUtil(int valor, boolean[] visitado, int[][] isConnected) {
        visitado[valor] = true;
        System.out.print(valor + " ");

        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[valor][i] == 1 && !visitado[i]) {
                DFSUtil(i, visitado, isConnected);
            }
        }
    }


}
