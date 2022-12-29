/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.TreeSet;

/**
 *
 * @author Luis Parra
 */
public class ClassTreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<String>(); 
  
        // Elements are added using add() method 
        ts1.add("z"); 
        ts1.add("r"); 
        ts1.add("b"); 
  
        // Duplicates will not get insert 
        ts1.add("b"); 
  
        // Elements get stored in default natural 
        // Sorting Order(Ascending) 
        System.out.println(ts1); 
    }
    
}
