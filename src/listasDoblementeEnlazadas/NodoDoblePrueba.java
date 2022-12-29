/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasDoblementeEnlazadas;

/**
 *
 * @author Luis Parra
 */
public class NodoDoblePrueba {
    NodoDoble inicio,fin;
    
    public NodoDoblePrueba(){
        inicio = null;
        fin = null;
    }
    
    public void agregarAlFinal(int elemento){
        if (inicio == null) {
            inicio= fin = new NodoDoble(elemento,inicio,null);
        }else{
            NodoDoble nuevo = new NodoDoble(elemento,null,fin);
            fin = nuevo;
            fin.anterior.siguiente = fin;
        }
       
    }
    
    public void agregarAlInicio(int elemento){
        if (inicio == null) {
            inicio = fin = new NodoDoble(elemento,inicio,null);
        }else{
            NodoDoble nuevo = new NodoDoble(elemento,inicio,null);
            inicio = nuevo;
            inicio.siguiente.anterior = inicio;
        }
    }
    
    public void eliminarInicio(){
        if (inicio == fin) {
            inicio = fin = null;
        }else{
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
            
    }
    
    public void eliminarFinal(){
       if (inicio == fin) {
            inicio = fin = null;
        }else{
            NodoDoble recorrer = inicio;
            while(recorrer != fin){
                recorrer = recorrer.siguiente;
            }
            fin = fin.anterior;
            fin.siguiente = null;
            
        }
    }
    
    public void eliminarNodoDoble(int elemento){
        
        if (inicio.dato == elemento && inicio.siguiente == null) {
            inicio = fin = null;
        }else if(inicio.dato == elemento){
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }else{
            NodoDoble recorrer = inicio.siguiente;
            NodoDoble anterior = inicio;
            
            while(recorrer != null && elemento != recorrer.dato){
                recorrer = recorrer.siguiente;
                anterior = anterior.siguiente;
            }
            if (recorrer == fin) {
                fin = fin.anterior;
                fin.siguiente = null;
            }else{
                anterior.siguiente = recorrer.siguiente;
                recorrer.siguiente.anterior = anterior;
            }
            
        }
       
    }
    
    
    public void mostrarLista(){
      NodoDoble recorrer = inicio;
      while(recorrer != null){
          System.out.print("["+recorrer.dato+"]<=>");
          recorrer = recorrer.siguiente;
      }
      
    }
    
    public void mostrarListaAlReves(){
       NodoDoble recorrer = fin;
       while(recorrer != null){
          System.out.print("["+recorrer.dato+"]<=>");
          recorrer = recorrer.anterior;
      }
    }
    
}
