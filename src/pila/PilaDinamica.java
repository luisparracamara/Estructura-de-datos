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
public class PilaDinamica {
    NodoPila cima;
    int tama;
    
    public PilaDinamica(){
        cima = null;
        tama = 0;
    }
    
    //metodo para saber cuando la pila está vacia
    public boolean estaVacia(){
        if (cima == null) {
            return true;
        }
        return false;
    }
    
    //metodo para insertar en la pila
    public void push(int elemento){
        NodoPila nuevo = new NodoPila(elemento); 
        nuevo.siguiente = cima;
        cima = nuevo;
        tama++;
    }
    
    //metodo para eliminar la cima
    public int pop(){
        int eliminar = cima.dato;
        cima = cima.siguiente;
        tama--;
        return eliminar;
    }
    
    //metodo para saber quien está en la cima
    public int cima(){
        return cima.dato;
    }
    
    //metodo para saber el tamaño de la pila
    public int tamanio(){
        return tama;
    }
    
    //para limpiar la pila
    public void limpiarPila(){
        /*while(!estaVacia()){
            pop();
        }*/
        
        while(cima != null){
            cima = cima.siguiente;
            tama--;
        }
    }
    
    //mostrar pila
    public void mostrar(){
        NodoPila recorrer = cima;
        while(recorrer != null){
            System.out.println("["+recorrer.dato+"]");
            recorrer = recorrer.siguiente;
        }
    }
}
