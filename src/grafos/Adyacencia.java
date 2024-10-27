/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Luis Parra
 */
public class Adyacencia {
    
    private int cantidad;
    private int[][] matriz;
    
    
    public Adyacencia(int n){
        cantidad = n;
        matriz = new int[cantidad][cantidad];
        //se inicializa matriz en 0
        for(int i=0; i< cantidad; i++){
            for(int j=0; j< cantidad; j++){
                matriz[i][j] = 0;
            }            
        }
    }
    
    public void agregar(int vector, int arco){
        matriz[vector][arco] += 1;
    } 
    
     public void remover(int vector, int arco){
        if(matriz[vector][arco]>0)
            matriz[vector][arco] -= 1;
    }
     
      public void imprimir(){
        for(int i=0; i< cantidad; i++){
            for(int j=0; j< cantidad; j++){
                System.out.print( matriz[i][j] + "  " );        
            }
            System.out.println();
        }  
    }


    // DFS (Depth-First Search) Recursivo
    private void DFSUtil(int valor, boolean[] visitado) {
        visitado[valor] = true;
        System.out.print(valor + " ");

        for (int i = 0; i < cantidad; i++) {
            if (matriz[valor][i] == 1 && !visitado[i]) {
                DFSUtil(i, visitado);
            }
        }
    }

    public void DFS(int inicio) {
        boolean[] visitado = new boolean[cantidad];
        DFSUtil(inicio, visitado);
    }


    // BFS (Breadth-First Search)
    public void BFS(int inicio) {
        boolean[] visitado = new boolean[cantidad];
        Queue<Integer> fila = new LinkedList<>();
        visitado[inicio] = true;
        fila.add(inicio);

        while (!fila.isEmpty()) {
            int v = fila.poll();
            System.out.print(v + " ");

            for (int i = 0; i < cantidad; i++) {
                if (matriz[v][i] == 1 && !visitado[i]) {
                    visitado[i] = true;
                    fila.add(i);
                }
            }
        }
    }

    
}
