/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Luis Parra
 */
public class ClassListaEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //UTILIZAR LOS METODOS NATURALES DE LISTA
        //mejor que los arreglos
        
       LinkedList<String> linkedlist = new LinkedList<>();
       
       linkedlist.add("luis");
       linkedlist.add("dunbo");
       linkedlist.add("kofi");
       linkedlist.add("tumtum");
       
       linkedlist.getFirst();
       linkedlist.getLast();
       linkedlist.removeFirst();
       linkedlist.removeLast();
       linkedlist.set(0, "g");
       linkedlist.remove(1);
       
        System.out.println(linkedlist.get(1));
        
        Iterator it = linkedlist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
       
        System.out.println(linkedlist);
    }
    
}
