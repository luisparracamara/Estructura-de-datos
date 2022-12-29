/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesNAry;

/**
 *
 * @author Luis Parra
 */
public class NARY {
    
       static class Node { 
        int data; 
        // List of children 
        Node children[]; 
  
        Node(int n, int data){ 
            children = new Node[n]; 
            this.data = data; 
        } 
    } 
       
        static void inorder(Node node){ 
        if (node == null) 
            return; 
  
        // Total children count 
        int total = node.children.length; 
        // All the children except the last 
        for (int i = 0; i < total - 1; i++) 
            inorder(node.children[i]); 
  
        // Print the current node's data 
        System.out.print("" + node.data + " "); 
  
        // Last child 
        inorder(node.children[total - 1]); 
    } 
       
       
   
    public static void main(String[] args) {
        // es un arbol que puede tener los hijos que quiera
        //  nodos 7, edges 6(nodos-1)
        /* Create the following tree  
                   1 
                /  |  \ 
               2   3   4 
             / | \ 
            5  6  7 
        */
         
          int n = 3; 
          Node root = new Node(n, 1); 
          root.children[0] = new Node(n, 2); 
          root.children[1] = new Node(n, 3); 
          root.children[2] = new Node(n, 4); 
          root.children[0].children[0] = new Node(n, 5); 
          root.children[0].children[1] = new Node(n, 6); 
          root.children[0].children[2] = new Node(n, 7); 
  
          inorder(root); 
         
         
    }
    
}
