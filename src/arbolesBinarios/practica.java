/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesBinarios;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Luis Parra
 */
public class practica {
    NodoArbol raiz;
    
    public practica(){
        raiz = null;
    }
    
    public void LevelOrderTraversal(NodoArbol root){
        
        Queue<NodoArbol> cola = new LinkedList(); 
        
        cola.add(root);
        while(!cola.isEmpty()){
    
            NodoArbol raiz = cola.peek();
            
            System.out.print(raiz.dato+"-");
            
            cola.remove();
            
            
            if(raiz.hijoIzquierdo != null){
                cola.add(raiz.hijoIzquierdo);
            }
            if(raiz.hijoDerecho != null){    
                cola.add(raiz.hijoDerecho);
            }
            
        } 
    }
    
    
    public int rangeSumBST(NodoArbol root, int L, int R) {
        int sum = 0;
        Queue<NodoArbol> cola = new LinkedList();
        
        cola.add(root);
        
        while(!cola.isEmpty()){
            root = cola.peek();
            
            if(root.dato >= L && root.dato<=R){
                sum+=root.dato;
            }
            
            
            cola.remove();
            
            if(root.hijoIzquierdo != null){
                cola.add(root.hijoIzquierdo);
            }
            if(root.hijoDerecho != null){
                cola.add(root.hijoDerecho);
            }
            
            
        }
        return sum;
    }
    
    //insertar nodo en el arbol
    public void agregarNodo(int elemento){
        NodoArbol nuevo = new NodoArbol(elemento);
        if (raiz == null) {
            raiz = nuevo;
        }else{
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            
            while(true){
                //posicion atrasada
                padre = auxiliar;

                if (elemento<auxiliar.dato) {
                    auxiliar = auxiliar.hijoIzquierdo;
                    if (auxiliar == null) {
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                }else{
                    auxiliar = auxiliar.hijoDerecho;
                    if (auxiliar == null) {
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
                
                
            }
            
        }
    }
    
     public boolean leafSimilar(NodoArbol root1) {
        String cadena = "";
        NodoArbol recorrer = root1;
        NodoArbol padre = null;
        
        while(recorrer != null){
            
            if(recorrer.hijoIzquierdo != null){
                padre = recorrer;
                recorrer = recorrer.hijoIzquierdo;
            }
            recorrer = padre;
            if(recorrer.hijoDerecho != null){
                recorrer = recorrer.hijoDerecho;   
            }
            
        }
        
        
        System.out.println(recorrer.dato);
        return true;
    }
     
     public void dfs(NodoArbol r){
         
        Stack<NodoArbol> pila = new Stack();
        
        NodoArbol nuevo = r;
        pila.push(nuevo);
        
        if(!pila.isEmpty()){
            pila.pop();
            System.out.println(nuevo.dato);
            
            if (nuevo.hijoIzquierdo != null) {
                pila.push(nuevo.hijoIzquierdo);
                dfs(r.hijoIzquierdo);
            }
            
            if (nuevo.hijoDerecho != null) {
                pila.push(nuevo.hijoDerecho);
                dfs(r.hijoDerecho);
            }
            
        }
        
        
     }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        practica arbol = new practica();
        
        arbol.agregarNodo(1);
        arbol.agregarNodo(2);
        
        
        arbol.dfs(arbol.raiz);
        

        //System.out.println(arbol.leafSimilar(arbol.raiz));
        
        //arbol.LevelOrderTraversal(arbol.raiz);
        //System.out.println(arbol.rangeSumBST(arbol.raiz, 2, 5));
        
    }
    
}
