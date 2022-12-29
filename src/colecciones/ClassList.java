/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Luis Parra
 */
public class ClassList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //listas tiene la facutlad de desplazar elementos hacia la derecha
        //LISTA ENLAZADA -> ARRAYLIST -> ARRAY
        //por default es lista de objetos || se puede utilzar para cualquier tipo de listas
        List<String> lista  = new ArrayList<>();
        
        lista.add("objeto 1");
        lista.add("objeto 2");
        lista.add("objeto 3");
        
        
        lista.remove(0);
        lista.get(1);
        lista.size();
        //lista.clear();
        lista.contains("objeto 3");
        //sustituye elemento
        lista.set(1, "qe pedo");
        lista.isEmpty();
        lista.add(0, "objeto nuevo");
        Collections.sort(lista);
        
        //contar los repetidos de la lista
        int verificar = Collections.frequency(lista, "objeto 1");
        
        System.out.println(lista);
        
        //recorrer lista || por default es un iterador de objetos
        Iterator<String> iterador = lista.iterator();
        while(iterador.hasNext()){
            /*Object*/ String siguiente = iterador.next();
            System.out.println(siguiente);
        }

    }
    
}
