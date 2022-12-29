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
public class ListaDoblePrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NodoDoblePrueba nd = new NodoDoblePrueba();
        
        nd.agregarAlFinal(10);
        nd.agregarAlFinal(6);
        nd.agregarAlInicio(90);
        nd.agregarAlInicio(190);
        nd.agregarAlInicio(955);
        nd.agregarAlFinal(190);
        nd.eliminarInicio();
        nd.eliminarFinal();
        nd.eliminarNodoDoble(90);
        
        nd.mostrarLista();
        System.out.println("------------------------------------");
        nd.mostrarListaAlReves();
    }
    
}
