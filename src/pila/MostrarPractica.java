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
public class MostrarPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        practicaPila pila = new practicaPila(2);
        practicaPilaDinamica dinamica = new practicaPilaDinamica();
        
        pila.push(10);
        pila.push(55);
        
        
        /*pila.mostrarPila();
        System.out.println(pila.lleno());
        System.out.println(pila.estaVacia());
        System.out.println(pila.size());
        pila.limpiar();*/
        
        dinamica.agregar(10);
        dinamica.agregar(20);
        dinamica.agregar(30);
        dinamica.agregar(40);
        dinamica.eliminar();
        System.out.println(dinamica.vacia());
        System.out.println(dinamica.tamaño());
        System.out.println(dinamica.cima());
        dinamica.limpiar();
        dinamica.mostrar();

        //dinamica.imprimirReves();
        
    }
    
}
