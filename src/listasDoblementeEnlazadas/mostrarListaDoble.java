/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasDoblementeEnlazadas;

/**
 *
 * @author Luis Parra
 */
public class mostrarListaDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDoble doble = new ListaDoble();
        
        doble.agregarInicio(8);
        doble.agregarInicio(28);
        doble.agregarInicio(55);
        doble.agregarInicio(2);
        doble.agregarFinal(99);
        
        //doble.eliminarInicio();
        //doble.eliminarFinal();
        doble.eliminarNodoDoble(551);
        
        doble.mostrarListaDoble();
        System.out.println("");
        //doble.mostrarListaFinInicio();
    }
    
}
