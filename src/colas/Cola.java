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
public class Cola {
    NodoCola inicio,fin;
    int tam;
    
    public Cola(){
        inicio = null;
        fin = null;
        tam = 0;
    }
    
    //saber si está vacia la cola
    public boolean vacia(){
        if (inicio == null) {
            return true;
        }
        return false;
    }
    
    //insertat
    public void insertar(int elemento){
        NodoCola nuevo = new NodoCola(elemento);
        if (inicio == null) {
            inicio = nuevo;
        }else{
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tam++;
    }
    
    public int quitar(){
        int eliminar = inicio.dato;
        inicio = inicio.siguiente;
        tam--;
        return eliminar;
    }
    
    public int inicioCola(){
        return inicio.dato;
    }
    
    public int tamaño(){
        return tam;
    }
    
    public void borrarCola(){
        while(inicio != null){
            inicio = inicio.siguiente;
            tam--;
        }
    }

    
    public void mostrar(){
        NodoCola recorrer = inicio;
        while(recorrer != null){
            System.out.print("["+recorrer.dato+"]-->");
            recorrer = recorrer.siguiente;
        }
    }
    
}
