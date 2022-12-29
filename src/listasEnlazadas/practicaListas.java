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
public class practicaListas {
    
    Nodo inicio,fin;
    
    public void agregarInicio(int elemento){
        Nodo nuevo = new Nodo(elemento,inicio);
        inicio  = nuevo;
        
        if(fin == null){
            fin = inicio;
        }
        
        
    }
    
    public void agregarFinal(int elemento){
        
        if (inicio == fin) {
            inicio = fin = new Nodo(elemento);
        }else{
            Nodo nuevo = new Nodo(elemento);
            fin.siguiente = nuevo;
            fin = nuevo;
    }
  }  
    
    
    public void agregarPorPosicion(int elemento, int posicion){
        Nodo nuevo = new Nodo(elemento);
        
        if (posicion == 0 && inicio == null) {
            inicio = new Nodo(elemento,inicio);
        }else if(posicion == 0 && inicio != null){
            nuevo.siguiente = inicio;
            inicio = nuevo;
        }else{
            Nodo recorrer = inicio;
            Nodo anterior = null;
            
            for (int i = 0; i < posicion; i++) {
                anterior = recorrer;
                recorrer = recorrer.siguiente;
                
                if (recorrer == null) {
                    fin = nuevo;
                    break;
                }
                
               
            }
            
            anterior.siguiente = nuevo;
            nuevo.siguiente = recorrer;
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
    
    public void eliminarInicio(){
        if (inicio == null) {
            inicio = fin = null;
        }else{
            inicio = inicio.siguiente;
        }
    }
    
    public void eliminarFinal(){
        if (inicio == null) {
            inicio = fin = null;
        }else{
            Nodo recorrer = inicio;
            while(recorrer.siguiente != fin){
                recorrer = recorrer.siguiente;
            }
            fin = recorrer;
            recorrer.siguiente = null;
        }
    }
    
    
    public void eliminarElemento(int elemento){
        if (inicio != null) {
            if (inicio.dato == elemento && inicio.siguiente == null) {
                inicio = fin = null;
            }else if (inicio.dato == elemento && inicio.siguiente != null){
                inicio = inicio.siguiente;
            }else{
                Nodo recorrer = inicio.siguiente;
                Nodo anterior = inicio;
                
                while(recorrer != null && recorrer.dato != elemento){
                    recorrer = recorrer.siguiente;
                    anterior = anterior.siguiente;
                }
                
                anterior.siguiente = recorrer.siguiente;
                if (recorrer == fin) {
                    fin = anterior;
                }
            }
            
        }
        
          
    }
    
    public void insertarListaOrdenada(int elemento){
        Nodo nuevo = new Nodo(elemento);
        if (inicio == null) {
            inicio = new Nodo(elemento,inicio);
        }else if(elemento < inicio.dato){
            nuevo.siguiente = inicio;
            inicio = nuevo;
        }else{
            Nodo recorrer = inicio.siguiente;
            Nodo atras = inicio;
            
            while(recorrer != null){
                if (recorrer.dato <= elemento) {
                    recorrer = recorrer.siguiente;
                    atras = atras.siguiente;
                }else{
                    break;
                }
            }
            
           atras.siguiente = nuevo;
           nuevo.siguiente = recorrer;
            
            
        }
        
    
        
        
   }
        
    
    
    public void mostrarLista(){
        Nodo recorrer = inicio;
        while(recorrer != null){
            System.out.print("["+recorrer.dato+"]-->");
            recorrer = recorrer.siguiente;
        }
    }
    
    
    public void invertirLista(){
      Nodo actual = inicio;
      Nodo anterior = null;
      Nodo adelante = null;
      
      while(actual != null){
          adelante = actual.siguiente;
          actual.siguiente = anterior;
          anterior = actual;
          actual = adelante;
      }
      inicio = anterior;
    }
    
    
    
}
