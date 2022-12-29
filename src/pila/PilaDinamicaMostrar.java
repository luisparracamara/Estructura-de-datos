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
public class PilaDinamicaMostrar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaDinamica pila = new PilaDinamica();
        
        pila.push(10);
        pila.push(20);
        pila.push(30);
        
        System.out.println(pila.cima());
        System.out.println(pila.tamanio());
        System.out.println(pila.estaVacia());
        System.out.println(pila.pop());
        
        pila.limpiarPila();
        pila.mostrar();
    }
    
}
