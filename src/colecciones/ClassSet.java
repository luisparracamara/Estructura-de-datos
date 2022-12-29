/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Luis Parra
 */
public class ClassSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //set sirve para no meter datos repetidos, desordenados, estan flotando
       //alrededor de un circulo, no tienen secuencia
       
       Set<String> set = new HashSet<>();
       
       set.add("hola");
       set.add("hola");
       set.add("shorito");
       set.add("ismarl");
       
       set.isEmpty();
       set.size();
       set.remove("shorito");
       set.contains("hola");
       
       
        System.out.println(set);
        
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String siguiente = it.next();
            System.out.println(siguiente);
        }
        
        //set.clear();
        
        Set<String> set2 = new HashSet();
        set2.add("hola");
        //retiene los elementos repetidos del set2, y solamente deja esos en el set1
        System.out.println(set.retainAll(set2));
        System.out.println(set);
        
        
        List<String> lista = new ArrayList();
        lista.addAll(set);
        
        lista.addAll(set);
        System.out.println("lista: " +set);
    }
    
}
