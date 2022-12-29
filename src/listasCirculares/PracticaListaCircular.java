/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasCirculares;

/**
 *
 * @author Luis Parra
 */
public class PracticaListaCircular {
    NodoCircular ultimo;
    
    public PracticaListaCircular(){
        ultimo = null;
    }
    
    public PracticaListaCircular agregar(int elemento){
        NodoCircular nuevo = new NodoCircular(elemento);
        if (ultimo != null) {
            nuevo.siguiente = ultimo.siguiente; 
            ultimo.siguiente = nuevo;
        }else{
            ultimo = nuevo;
        }
        return this;
    }
    
    public void mostrarLista(){
        if (ultimo != null) {
            NodoCircular recorrer = ultimo.siguiente;
            
            do{
                System.out.print("["+recorrer.dato+"]-->");
                recorrer = recorrer.siguiente;
            }while(recorrer != ultimo.siguiente);
        }else{
            System.out.println("lista vacia");
        }
    }
    
    public void eliminarLista(int elemento){
        boolean encontrado = false;
        NodoCircular recorrer = ultimo;
        
        while(( recorrer.siguiente != ultimo ) && (!encontrado)){
            encontrado = (recorrer.siguiente.dato == elemento);
            if (!encontrado) {
                recorrer = recorrer.siguiente;
            }
        }
        
        encontrado = (recorrer.siguiente.dato == elemento);
        
        if (encontrado) {
            NodoCircular adelante = recorrer.siguiente;
            
            if (ultimo == ultimo.siguiente) {
                ultimo = null;
            }else{
                if (adelante == ultimo) {
                    ultimo = recorrer;
                }
                recorrer.siguiente = adelante.siguiente;
            }
            adelante = null;
        }
        
        
    }
    
}
