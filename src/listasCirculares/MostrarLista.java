/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasCirculares;

/**
 *
 * @author Luis Parra
 */
public class MostrarLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircular lc = new ListaCircular();
        
        lc.insertar(50);
        lc.insertar(80);
        lc.insertar(10);
        lc.insertar(90);
        lc.eliminarNodo(10);
        
        lc.mostrarLista();
    }
    
}
