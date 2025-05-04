 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import problemas.TreeNode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Luis Parra
 */
public class DFS {

    //crear lista adyacente
    
    int vector;
    LinkedList<Integer> lista[];
    
    DFS(int total){
        vector = total;
        lista = new LinkedList[vector];
        for (int i = 0; i < vector; i++) {
            lista[i] = new LinkedList();
        } 
    }
    
    void addEdge(int ver,int conectar){
        lista[ver].add(conectar);
    }
    
    void imprimir(){
        for (int i = 0; i < vector; i++) {
            System.out.print("Vector: "+i+" ");
            System.out.println(lista[i]);
        }
    }
    
    public void DFS(int inicio){
      boolean visitado[] = new boolean[vector]; 
        for (int i = 0; i < vector; i++) {
            visitado[i] = false;
        }
        
        Stack<Integer> pila = new Stack<>();
        pila.push(inicio);

        while(!pila.isEmpty()){
            inicio = pila.peek();
            pila.pop();
       
           if (visitado[inicio] == false) {
            System.out.print(inicio + " ");
            visitado[inicio] = true;
            } 
        
           Iterator<Integer> i = lista[inicio].listIterator();

                while (i.hasNext())
                {
                    int siguiente = i.next();
                    if(visitado[siguiente] == false)
                        pila.push(siguiente);
                }

            }
    }
    
    public static void main(String[] args) {
        DFS dfs = new DFS(6);
        dfs.addEdge(0, 1); 
        dfs.addEdge(0, 2);
        
        dfs.addEdge(1, 2);
        dfs.addEdge(1, 3);
        
        dfs.addEdge(2, 3);
        
        dfs.addEdge(3, 4);
        
        
        dfs.addEdge(4, 1);
        dfs.addEdge(4, 0);
        dfs.addEdge(4, 5);
        
        dfs.addEdge(2, 1); 
        dfs.addEdge(0, 3); 
        dfs.addEdge(1, 4); 
        dfs.imprimir();
        
        System.out.println("Following is the Depth First Traversal"); 
        dfs.DFS(0);
    }
    
    
    
 static void dfs(TreeNode arbol){
     Stack<TreeNode> stack = new Stack();
     stack.push(arbol);

     while(!stack.isEmpty()){
         arbol = stack.peek();
         stack.pop();

         if (arbol.right != null) {
             stack.push(arbol.right);
         }

         if (arbol.left != null) {
             stack.push(arbol.left);
         }

         System.out.print(arbol.val+"-");

     }
 }

// 
// static void dsfRecursivo(TreeNode arbol){
//    if (arbol != null) {
//        System.out.print(arbol.val+"-");
//        dsfRecursivo(arbol.left);
//        dsfRecursivo(arbol.right);
//    }
// }
    
}
