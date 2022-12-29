/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author Luis Parra
 */
public class ClassCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList();
        ArrayList<Integer> n = new ArrayList();
        a.add("luis");
        a.add("tomtom");
        a.add("shorito");
        a.add("alkapone");
        
        n.add(22);
        Collections.fill(n, 10);
        n.add(777);
        
        Collections.binarySearch(a, "alkapone");
        Collections.max(n);
        Collections.min(n);
        //reversa a la lista
        Collections.reverse(n);
      
        //ordenacion random
        Collections.shuffle(n);
        Collections.sort(n);
        
        Collections.frequency(n, 777);
        
        System.out.println(n);
        
    }
    
}
