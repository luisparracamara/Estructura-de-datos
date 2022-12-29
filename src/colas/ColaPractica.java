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
public class ColaPractica {
    NodoCola inicio,fin;
    int tam;
    
    public ColaPractica(){
        tam = 0;
        inicio = null;
        fin = null;
    }
    
    public void agregar(int elemento){
        NodoCola nuevo = new NodoCola(elemento);
        if (inicio == null) {
            inicio = fin = nuevo;
        }else{
            fin.siguiente = nuevo;
            fin = nuevo;
        }
        tam++;
    }
    
    public int eliminar(){
        int eliminar = inicio.dato;
        inicio = inicio.siguiente;
        tam--;
        return eliminar;
    }
    
    public int inicio(){
        return inicio.dato;
    }
    
    public int tam(){
        return tam;
    }
    
    public void borrar(){
        while(inicio != null){
            inicio = inicio.siguiente;
            tam--;
        }
    }
    
    
    public void mostrar(){
        while(inicio != null){
            System.out.print("["+inicio.dato+"]--");
            inicio = inicio.siguiente;
        }
    }
    
}
