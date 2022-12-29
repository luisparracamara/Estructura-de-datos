/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author Luis Parra
 */
public class NodoCola {
    int dato;
    NodoCola siguiente;
    
    public NodoCola(int d){
        dato = d;
        siguiente = null;
    }
}
