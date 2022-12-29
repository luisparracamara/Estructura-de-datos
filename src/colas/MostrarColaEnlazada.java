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
public class MostrarColaEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cola = new Cola();
        
        cola.insertar(10);
        cola.insertar(20);
        cola.insertar(30);
        
        System.out.println(cola.quitar());
        System.out.println(cola.vacia());
        System.out.println(cola.inicioCola());
        System.out.println(cola.tamaño());
        
        cola.borrarCola();
        cola.mostrar();
    }
    
}
