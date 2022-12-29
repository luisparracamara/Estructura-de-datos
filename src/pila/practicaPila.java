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
public class practicaPila {
    int cima;
    int []arreglo;
    
    public practicaPila(int elemento){
        cima = -1;
        arreglo = new int[elemento];
    }
    
    public void push(int elemento){
        cima++;
        arreglo[cima] = elemento;
    }
    
    public int pop(){
       int eliminar = arreglo[cima];
       cima--;
       return eliminar;
    }
    
    public boolean lleno(){
        if (cima == arreglo.length) {
            return true;
        }return false;
    }
    
    public boolean estaVacia(){
        if (cima == -1) {
            return true;
        }return false;
    }
    
    public int size(){
        return arreglo.length;
    }
    
    public void limpiar(){
      cima = -1;
    }
    
    public void mostrarPila(){
          for (int i = 0; i < arreglo.length; i++) {
              System.out.println("["+arreglo[i]+"]");
        }
    }
   
    
    
}
