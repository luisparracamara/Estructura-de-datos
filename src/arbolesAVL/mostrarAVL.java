/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesAVL;

/**
 *
 * @author Luis Parra
 */
public class mostrarAVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolAVL avl = new ArbolAVL();
        
        //insertar nodo
        avl.insertar(10);
        avl.insertar(5);
        avl.insertar(13);
        avl.insertar(1);
        avl.insertar(6);
        avl.insertar(17);
        avl.insertar(16);
        avl.preorden(avl.obtenerRaiz());
    }
    
}
