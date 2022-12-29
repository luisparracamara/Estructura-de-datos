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
public class pruebaArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        practicaArbol arbol = new practicaArbol();
        
        arbol.raiz = new NodoArbol(20); 
        arbol.raiz.hijoIzquierdo = new NodoArbol(8); 
        arbol.raiz.hijoDerecho = new NodoArbol(22); 
        arbol.raiz.hijoIzquierdo.hijoIzquierdo = new NodoArbol(4); 
        arbol.raiz.hijoIzquierdo.hijoDerecho = new NodoArbol(12); 
        arbol.raiz.hijoIzquierdo.hijoDerecho.hijoIzquierdo = new NodoArbol(10); 
        arbol.raiz.hijoIzquierdo.hijoDerecho.hijoDerecho = new NodoArbol(14); 
   

        
        arbol.inOrden(arbol.raiz);
        System.out.println("");
        arbol.preOrder(arbol.raiz);
        System.out.println("");
        arbol.postOrden(arbol.raiz);
        System.out.println("");
        System.out.println(arbol.buscarNodo(130));
        System.out.println("");
        System.out.println("altura "+arbol.altura(arbol.raiz));
        System.out.println("");
        System.out.println(arbol.eliminar(5));
        arbol.inOrden(arbol.raiz);
        
        System.out.println("");
        //System.out.println("LCA: "+arbol.lca(arbol.raiz, 10,14).dato);
        System.out.println("LCA: "+arbol.lcaFacil(arbol.raiz, 14,4).dato);
        
    }
    
}
