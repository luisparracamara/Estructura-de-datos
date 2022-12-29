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
public class ListaDoble {
    private NodoDoble inicio,fin;
    
    //contstructor para inicializar valores
    public ListaDoble(){
        inicio = null;
        fin = null;
    }
    
    //metodo para agregar nodos al final
    public void agregarFinal(int elemento){
        if (inicio == null) {
            inicio = fin = new NodoDoble(elemento);
        }else{
            NodoDoble nuevo = new NodoDoble(elemento,null,fin);
            fin = nuevo;
            fin.anterior.siguiente = fin;
        }
    }
    
    //metodo para agregar al inicio
     public void agregarInicio(int elemento){
         if (inicio == null) {
             inicio = fin = new NodoDoble(elemento);
         }else{
             NodoDoble nuevo = new NodoDoble(elemento,inicio,null);
             inicio = nuevo;
             inicio.siguiente.anterior = inicio;
         }   
    }
     
    //eliminar el nodo del inicio
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
            fin = fin.anterior;
            fin.siguiente = null;
        }
    }
    
    public void eliminarNodoDoble(int elemento){
        
        if(inicio == fin && inicio.dato == elemento){
            inicio = fin = null;
        }else if(inicio.dato == elemento){
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }else{
            
            NodoDoble recorrer,anterior;
            
            recorrer = inicio.siguiente;
            anterior = inicio;
           
            
            while(recorrer != null && recorrer.dato != elemento){
                recorrer = recorrer.siguiente;
                anterior = anterior.siguiente;
            }
            
            if (recorrer != null) {
                  if (recorrer == fin) {
                      fin = anterior;
                      fin.siguiente = null;
                }else{
                      anterior.siguiente = recorrer.siguiente;
                      recorrer.siguiente.anterior = anterior;    
                  }
                          
            }
            
        }
    }
    
    //mostrar lista de inicio a fin
    public void mostrarListaDoble(){
        NodoDoble recorrer = inicio;
        while(recorrer != null){
            System.out.print("["+recorrer.dato+"]<=>");
            recorrer = recorrer.siguiente;
        }
    }
    
    //mostrar lista de fin a inicio
    public void mostrarListaFinInicio(){
        NodoDoble recorrer = fin;
        while(recorrer != null){
            System.out.print("["+recorrer.dato+"]<=>");
            recorrer = recorrer.anterior;
        }
    }
    
}
