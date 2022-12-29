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
public class mostrarColaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaArray cola = new ColaArray(3);
        
        cola.insertar(10);
        cola.insertar(20);
        System.out.println("eliminado "+cola.eliminar());
        
        cola.mostrar();
    }
    
}
