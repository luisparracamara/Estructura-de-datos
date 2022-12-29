/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesBinarios;

/**
 *
 * @author Luis Parra
 */
public class practicaArbol {
    NodoArbol raiz;
    
    public practicaArbol(){
        raiz = null;
    }
    
    public void agregar(int elemento){
      NodoArbol nuevo = new NodoArbol(elemento);
      
        if (raiz == null) {
           raiz = nuevo; 
        }else{
            NodoArbol recorrer = raiz;
            NodoArbol padre;
            
            while(true){
                padre = recorrer;
                
                if (elemento < recorrer.dato) {
                    recorrer = recorrer.hijoIzquierdo;
                    if (recorrer == null) {
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                }else{
                    recorrer = recorrer.hijoDerecho;
                    if (recorrer == null) {
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
                
            }
        }
    }
    
    
    public void inOrden(NodoArbol root){
        if (root != null) {
            inOrden(root.hijoIzquierdo);
            System.out.print(root.dato+"-");
            inOrden(root.hijoDerecho);
        }
    }
    
    public void preOrder(NodoArbol root){
        if (root != null) {
            System.out.print(root.dato+"-");
            preOrder(root.hijoIzquierdo);
            preOrder(root.hijoDerecho);
        }
    }
    
    public void postOrden(NodoArbol root){
        if (root != null) {
            postOrden(root.hijoIzquierdo);
            postOrden(root.hijoDerecho);
            System.out.print(root.dato+"-");
        }
    }
    
    public boolean buscarNodo(int elemento){
        
        NodoArbol recorrer = raiz;
        
        while(recorrer.dato != elemento){
            if (elemento<recorrer.dato) {
                recorrer = recorrer.hijoIzquierdo;
            }else{
                recorrer = recorrer.hijoDerecho;
            }
            
            if (recorrer == null) {
                return false;
            }
        }
        
        
        return true;      
    }
    
    public boolean eliminar(int elemento){
        
        NodoArbol recorrer = raiz;
        NodoArbol padre = raiz;
        boolean esHijoIzquierdo = true;
        
        while(recorrer.dato != elemento){
            padre = recorrer;
            
            if (elemento<recorrer.dato) {
                recorrer = recorrer.hijoIzquierdo;
                esHijoIzquierdo = true;
            }else{
                recorrer = recorrer.hijoDerecho;
                esHijoIzquierdo = false;
            }
            
            if (recorrer == null) {
                return false;
            }
        }
        
        //caso 1: nodo hoja
        if (recorrer.hijoIzquierdo == null && recorrer.hijoDerecho == null) {
            if (raiz == recorrer) {
                raiz = null;
            }else if(esHijoIzquierdo){
                padre.hijoIzquierdo = null;
            }else{
                padre.hijoDerecho = null;
            }
            
            //caso 2: tiene un solo hijo (solo hay izquierdo)
        }else if(recorrer.hijoDerecho == null){
            if (recorrer == raiz) {
                raiz = recorrer.hijoIzquierdo;
            }else if(esHijoIzquierdo){
                padre.hijoIzquierdo = recorrer.hijoIzquierdo;
            }else{
                padre.hijoDerecho = recorrer.hijoIzquierdo;
            }
        }else if(recorrer.hijoIzquierdo == null){
            if (recorrer == raiz) {
                raiz = recorrer.hijoDerecho;
            }else if(esHijoIzquierdo){
                padre.hijoIzquierdo = recorrer.hijoDerecho;
            }else{
                padre.hijoDerecho = recorrer.hijoDerecho;
            }
        }else{
            NodoArbol reemplazo = elegir(recorrer);
            
            if (reemplazo == raiz) {
                raiz = reemplazo;
            }else if(esHijoIzquierdo){
                padre.hijoIzquierdo = reemplazo;
            }else{
                padre.hijoDerecho = reemplazo;
            }
        }
        
        return true;
        
    }
    
    
    
public NodoArbol elegir(NodoArbol root){
        NodoArbol padreReemplazo = root;
        NodoArbol reemplazo = root;
        NodoArbol recorrer = root.hijoDerecho;
        
        while(recorrer != null){
            padreReemplazo = reemplazo;
            reemplazo = recorrer;
            recorrer = recorrer.hijoIzquierdo;
        }
        
        if (reemplazo != root.hijoDerecho) {
            padreReemplazo.hijoDerecho = reemplazo.hijoDerecho;
            reemplazo.hijoDerecho = root.hijoDerecho;
            
        }
        
    
        System.out.println("Nodo remplazo: "+reemplazo);
        return reemplazo;
     

}

public int altura(NodoArbol root){
    int izq;
    int der;
        if (root != null) {
             izq = altura(root.hijoIzquierdo)+1;
             der = altura(root.hijoDerecho)+1;
             
                 if (izq>der) {
        return izq;
    }else{
        return der;
    }
    }
    return -1;
}


public NodoArbol lca(NodoArbol root,int n1, int n2){
    if (root == null) {
        return null;
    }
    if (root.dato == n1 || root.dato == n2) {
        return root;
    }
    
    NodoArbol left = lca(root.hijoIzquierdo, n1,n2);
    NodoArbol right = lca(root.hijoDerecho, n1,n2);
    
    if (left != null && right != null) {
        return root;
    }
    if (left == null && right == null) {
        return null;
    }
    
    if (left != null) {
        return left; 
    }else{
        return right;
    }   
}

 public NodoArbol lcaFacil(NodoArbol root, int n1, int n2){ 
        if (root == null) 
            return null; 
   
        // If both n1 and n2 are smaller than root, then LCA lies in left 
        if (root.dato > n1 && root.dato > n2) 
            return lca(root.hijoIzquierdo, n1, n2); 
   
        // If both n1 and n2 are greater than root, then LCA lies in right 
        if (root.dato < n1 && root.dato < n2)   
            return lca(root.hijoDerecho, n1, n2); 
   
        return root; 
    } 


    
}


