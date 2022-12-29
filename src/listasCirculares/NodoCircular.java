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
public class NodoCircular {
    int dato;
    NodoCircular siguiente;
    
    public NodoCircular(int elemento){
        dato = elemento;
        siguiente = this; // se apunta a si mismo
    }
}
