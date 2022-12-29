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
public class NodoPila {
    int dato;
    NodoPila siguiente;
    
    public NodoPila(int elemento){
        dato = elemento;
        siguiente = null;
    }
}
