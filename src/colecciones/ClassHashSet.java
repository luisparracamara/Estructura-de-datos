/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.HashSet;

/**
 *
 * @author Luis Parra
 */
public class ClassHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hash con keys pero sin repetirse en el set
        //todos los metodos del map
        //es mas lento que el hashmap
        HashSet<Integer> hs = new HashSet();
        
        hs.add(10);
        hs.add(25);
        hs.add(3);
        hs.add(12);
        
        hs.remove(10);
        //la suma de todos
        hs.hashCode();
        
        System.out.println(hs.hashCode());
        
    }
    
}
