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
public class Nodo {
    int dato;
    Nodo siguiente;
    
    //constructor agrgar al final
    public Nodo(int elemento){
        dato = elemento;
        siguiente = null;
    }
    
    //constructor agregar al inicio
    public Nodo(int elemento, Nodo puntero){
        dato = elemento;
        siguiente = puntero;
    }
    
    
}
