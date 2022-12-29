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
public class mostrarColaPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaPractica cola = new ColaPractica();
        
        cola.agregar(10);
        cola.agregar(20);
        cola.eliminar();
        System.out.println(cola.inicio());
        System.out.println(cola.tam());
        cola.borrar();
        
        cola.mostrar();
    }
    
}
