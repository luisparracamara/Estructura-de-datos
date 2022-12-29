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
public class ColaArray {
    int inicio,fin;
    int []arreglo;
    
    public ColaArray(int elemento){
        inicio = 0;
        fin = -1;
        arreglo = new int[elemento];
    }
    
    public void insertar(int elemento){
        arreglo[fin+1] = elemento;
        fin++;
    }
    
    public int eliminar(){
        return arreglo[inicio++];
    }
    
    public void borrarCola(){
        inicio = 0;
        fin = -1;
    }
    
    public int inicioCola(){
        return arreglo[inicio];
    }
    
    public boolean vacia(){
        if (fin<inicio) {
            return true;
        }
        return false;
    }
    
    public boolean lleno(){
        if (arreglo.length == fin) {
            return true;
        }
        return false;
    }
    
    public void mostrar(){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]-->");
        }
    }
    
}
