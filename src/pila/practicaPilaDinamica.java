/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author Luis Parra
 */
public class practicaPilaDinamica {
    int tam;
    NodoPila cima;
    public practicaPilaDinamica(){
       tam = 0;
       cima = null;
    }
    
    public void agregar(int elemento){
       NodoPila nuevo = new NodoPila(elemento);
       nuevo.siguiente = cima;
       cima = nuevo;
       tam++;
    }
    
    public int eliminar(){
        int eliminar = cima.dato;
        cima = cima.siguiente;
        tam--;
        return eliminar;
    }
    
    public boolean vacia(){
        if (cima == null) {
            return true;
        }return false;
    }
    
    public int tamaño(){
        return tam;
    }
    
    public void limpiar(){
        while(cima != null){
            cima = cima.siguiente;
        }
    }
    
    public int cima(){
        return cima.dato;
    }
    
    public void mostrar(){
       while(cima!=null){
           System.out.print("["+cima.dato+"]-->");
           cima = cima.siguiente;
       }
    }
    
    public void imprimirReves(){
        NodoPila anterior,adelante,actual;
        actual = cima;
        adelante = null;
        anterior = null;
        
        while(actual != null){
            adelante = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = adelante;
        }
        cima = anterior;       
        
        while(cima != null){
            System.out.print("["+cima.dato+"]--");
            cima = cima.siguiente;
        }
     
    }
}
