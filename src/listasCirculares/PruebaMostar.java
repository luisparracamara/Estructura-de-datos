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
public class PruebaMostar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PracticaListaCircular lc = new PracticaListaCircular();
        
        lc.agregar(10);
        lc.agregar(20);
        lc.agregar(90);
        lc.eliminarLista(10);
        lc.mostrarLista();
        
    }
    
}
