/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesBinarios;

/**
 *
 * @author Luis Parra
 */
public class mostarArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        
  
        
        arbol.agregarNodo(10);
        arbol.agregarNodo(5);
        arbol.agregarNodo(15);
        arbol.agregarNodo(3);
        arbol.agregarNodo(8);
        arbol.agregarNodo(6);
        arbol.agregarNodo(9);
        arbol.agregarNodo(7);
        
        System.out.println(arbol.eliminar(5));
        

        //arbol.preOrden(arbol.raiz);
        //arbol.inOrden(arbol.raiz);
        //arbol.postOrden(arbol.raiz);
        
      
        //System.out.println(arbol.buscarNodo(8));
        arbol.inOrden(arbol.raiz);
        
        System.out.println("Niveles: "+arbol.altura(arbol.raiz));
    }
    
}
