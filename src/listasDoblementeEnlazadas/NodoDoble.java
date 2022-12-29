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
public class NodoDoble {
    public int dato;
    NodoDoble anterior,siguiente;
    
    //constructor para cuando hay nodos
    public NodoDoble(int elemento,NodoDoble s, NodoDoble a){
        dato = elemento;
        siguiente = s;
        anterior = a;
    }
    
    //constructor para cuando no hay nodos
    public NodoDoble(int elemento){
        dato = elemento;
        siguiente = null;
        anterior = null;
    }
    
}
