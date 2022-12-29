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
public class ListaCircular {
    NodoCircular ultimo;
    
    public ListaCircular(){
        ultimo = null;
    }
    
    //insertar nodos
    public ListaCircular insertar(int elemento){
        NodoCircular nuevo = new NodoCircular(elemento);
        
        if (ultimo != null) { 
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }else{ 
        //EN CASO DE QUE SEA NULL y no haya elemenots mas es que este nuevo, que se convertiria en la cabeza
            ultimo = nuevo;
        }
        //se retorna direccion ?
            return this;  
    }
    
    
    //eliminar elemento
    public void eliminarNodo(int elemento){
        NodoCircular recorrer = ultimo;
        boolean encontrado = false;
        
        while((recorrer.siguiente != ultimo) && (!encontrado)){
            
            encontrado = (recorrer.siguiente.dato == elemento);
            if (!encontrado) {
                recorrer = recorrer.siguiente;
            }
        }
        encontrado = (recorrer.siguiente.dato == elemento);
        
        if (encontrado) {
            NodoCircular adelante = recorrer.siguiente;//guarda el elemento encontrado
            if (ultimo == ultimo.siguiente) {// Lista con un solo nodo-- SI SE APUNTA A SÍ MISMO
                ultimo = null;
            }else{
                if (adelante == ultimo) {
                    ultimo = recorrer;// Se borra el elemento referenciado por ultimo, // el nuevo acceso a la lista es el DE UN LADO //aplica cuando quieres eliminar el ultimo

                }
                recorrer.siguiente = adelante.siguiente;
            }
            adelante = null;
        }
        
       
    }
    
    //mostrar lista
    public void mostrarLista(){   
        if (ultimo != null) {
            NodoCircular recorrer = ultimo.siguiente; //apunta al primero
                do {
                System.out.print("["+recorrer.dato+"]-->");
                recorrer = recorrer.siguiente;
            } while (recorrer != ultimo.siguiente);
        }else{
            System.out.println("Lista vacia");
        }
        
    }
    
}
