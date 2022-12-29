/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasEnlazadas;

/**
 *
 * @author Luis Parra
 */
public class mostrarPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        practicaListas practicaLista = new practicaListas();
        
        
        /*practicaLista.agregarInicio(10);
        practicaLista.agregarInicio(20);
        practicaLista.agregarFinal(99);
        practicaLista.agregarFinal(77);
        practicaLista.agregarPorPosicion(22, 22);
        System.out.println(practicaLista.buscarLista(22));
        practicaLista.eliminarInicio();
        practicaLista.eliminarFinal();
        practicaLista.eliminarElemento(77);*/
        
        
        practicaLista.insertarListaOrdenada(90);
        practicaLista.insertarListaOrdenada(190);
        practicaLista.insertarListaOrdenada(5);
        practicaLista.insertarListaOrdenada(88);
        practicaLista.insertarListaOrdenada(555);
        practicaLista.insertarListaOrdenada(6);
        
        
       

        practicaLista.invertirLista();
        practicaLista.mostrarLista();

    }
    
}
