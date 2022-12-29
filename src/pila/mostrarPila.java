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
public class mostrarPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pila pila = new Pila(10);
       
       pila.empujar(1);
       pila.empujar(2);
       pila.empujar(3);
       pila.empujar(4);
       pila.empujar(5);
       
        pila.sacar();
        
        System.out.println(pila.cimaPila());
        System.out.println(pila.estaLlena());
        System.out.println(pila.estaVacia());
        System.out.println(pila.tamanioPila());
        
       pila.limpiarPila();
       
       
    }
    
}
