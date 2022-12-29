/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasEnlazadas;

import java.util.Random;

/**
 *
 * @author Luis Parra
 */
public class mostrar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        
        lista.agregarAlInicio(1);
        lista.agregarAlInicio(3);
        lista.agregarFinal(10);
        lista.agregarFinal(65);
        lista.agregarAlInicio(8);
        lista.agregarPorPosicion(99, 3);
        
        lista.eliminarElementoInicio();
        lista.eliminarFinal();
        
        System.out.println(lista.buscarLista(52));
        
        lista.eliminarElemento(99);
        
 
        lista.insertarListaOrdenada(24);
        lista.insertarListaOrdenada(8);
        lista.insertarListaOrdenada(23);
         lista.insertarListaOrdenada(1);
        lista.insertarListaOrdenada(9);
        
        lista.mostrarLista();
    }
  }    

