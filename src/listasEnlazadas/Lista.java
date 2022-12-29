/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasEnlazadas;

/**
 *
 * @author Luis Parra
 */
public class Lista {
    protected Nodo inicio,fin; //punteros para saber el inicio y fin
    
    //constructor inicializar variables
    public Lista(){
        inicio = null;
        fin = null;
    }
    
    public void agregarAlInicio(int elemento){
        //crear nodo
        Nodo nuevo;
        nuevo = new Nodo(elemento, inicio);
        
        inicio = nuevo;
        
        if (fin==null) {
            fin = inicio;
        }
        
    }
    
    //metodo para insertar al final de la lista
    public void agregarFinal(int elemento){
        Nodo nuevo;
        if (!estaVacia()) {
            nuevo = new Nodo(elemento);
            fin.siguiente = nuevo;
            fin = nuevo;
        }else{
            inicio = fin = new Nodo(elemento);
        }
    }
    
    
    //insertar por posicion
    public void agregarPorPosicion(int elemento,int posicion){
        if (inicio == null) {
            System.out.println("No hay datos en la lista");
        }
        if (inicio != null && posicion == 0) {
            Nodo nuevo = new Nodo(elemento,inicio);
            inicio = nuevo;
            
        }else{
            Nodo nuevo = new Nodo(elemento,inicio);
            
            Nodo actual = inicio;
            Nodo anterior = null;
            
            for (int i = 0; i < posicion; i++) {
                anterior = actual;
                actual = anterior.siguiente;
                if (actual == null) {
                        fin = nuevo;
                        break;              
                }   
            }
         
            nuevo.siguiente = actual; //puntero a la derecha
            anterior.siguiente = nuevo; //puntero a la izquierda     
            
            } 
    }
    
    public boolean buscarLista(int elemento){
        Nodo recorrer = inicio;
        while(recorrer != null){
            if (recorrer.dato == elemento) {
                return true;
            }else{
                recorrer = recorrer.siguiente;
            }
        }
        return false;
    }
    
    public void eliminarElementoInicio(){
            if (inicio == fin) {
                inicio = fin = null;
            }else{
                inicio = inicio.siguiente;
            }
    }
    
    public void eliminarFinal(){
        if (inicio == fin) {
            inicio = fin = null;
        }else{
            Nodo recorrer = inicio;
            while(recorrer.siguiente != fin){
                recorrer = recorrer.siguiente;    
            }
            fin = recorrer;
            fin.siguiente = null;
        }
    }
    
        public void eliminarElemento(int elemento){
            //si no esta vacio
            if (inicio != null) {
                //si es el unico elemento de la lista y aprate el que estoy buscando
                if (inicio == fin && elemento == inicio.dato) {
                inicio = fin = null;
                //si el elemento es el primero pero hay mas adelante
                }else if(elemento == inicio.dato){
                   inicio = inicio.siguiente;
                   //si el elemento esta en cualquier elemento
            }else{
                   Nodo anterior = inicio;
                   Nodo recorrer = inicio.siguiente;
                   
                   while(recorrer != null && recorrer.dato != elemento ){
                       anterior = anterior.siguiente;
                       recorrer = recorrer.siguiente;
                   }
                   
                    if (recorrer != null) {
                        anterior.siguiente = recorrer.siguiente;
                        if (recorrer == fin) {
                            fin = anterior;
                        }
                    }
                }
         }
    }
        
   public void insertarListaOrdenada(int elemento){
       Nodo nuevo = new Nodo(elemento);
       //la lista esta vacia?
       if (inicio == null) {
           inicio = nuevo;
       }else{
           Nodo recorrer = inicio;
           while(recorrer != null){
               Nodo recorrer2 = recorrer.siguiente;
               //se debe ir al inicio de la lista?
               if (nuevo.dato<=recorrer.dato) {
                   nuevo.siguiente = inicio;
                   inicio = nuevo;
                   break;
               }else{
                   //se debe ir al final de la lista?
                   if (nuevo.dato > recorrer.dato && recorrer2 == null) {
                      recorrer.siguiente = nuevo;
                      fin = nuevo;
                      break;
                   }else{
                       
                       //el numero entrante debe ir enmedio de otros dos?
                       if (recorrer.dato<nuevo.dato && recorrer2.dato>=nuevo.dato) {
                           recorrer.siguiente = nuevo;
                           nuevo.siguiente = recorrer2;
                           break;
                       }else{
                           recorrer = recorrer.siguiente;
                       }
                   }
               }
  
           }
           
       }
   }     
    
    //metodo para saber si la lista está vacia
    public boolean estaVacia(){
        if (inicio == null) {
            return true;
        }else{
            return false;
        }
    }
    
    
    
    //mostrar datos
    public void mostrarLista(){
        Nodo recorrer = inicio;
        while(recorrer != null){
            System.out.print("["+recorrer.dato+"]--->");
            recorrer = recorrer.siguiente;
        }
    }
    
    
    //invertir lista
        public void invertirLista(){
        Nodo anterior = null;
        Nodo actual = inicio; 
        Nodo siguiente = null;
        
        while(actual != null){
            siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }
        inicio = anterior;
    }
    
    
}
