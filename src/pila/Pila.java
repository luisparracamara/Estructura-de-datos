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
public class Pila {
    int vectorPila[];
    int cima;
    
    public Pila(int tamanio){
        vectorPila = new int[tamanio];
        cima = -1;
    }
    
    //metodo push
    public void empujar(int dato){
        cima++;
        vectorPila[cima] = dato;
    }
    
    //metodo pop
    public int sacar(){
        int fuera = vectorPila[cima];
        cima--;
        return fuera;
    }
    
    //metodo para saber si la pila está vacía
    public boolean estaVacia(){
        if (cima == -1) {
           return true;
        }
        return false;
    }
    
    //metodo para saber si la pila está llena
    public boolean estaLlena(){
        if (vectorPila.length-1 == cima) {
            return true;
        }
        return false;
    }
    
    //método para saber que elemento está en la cima
    public int cimaPila(){
        return vectorPila[cima];
    }
    
    //metodo conocer el tamaño
    public int tamanioPila(){
        return vectorPila.length;
    }
    
    //limpiar la pila
 	 public void limpiarPila()
	 {
	   cima = -1;
	 }   
}
