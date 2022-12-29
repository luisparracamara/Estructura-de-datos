/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author Luis Parra
 */
public class ClaseHash {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Hashtable<Integer, String> 
            hm = new Hashtable<Integer, String>();
         
         hm.put(1, "luis");
         hm.put(2, "parra");
         hm.put(3, "camara");
         
         System.out.println(hm);
          
    }
    
}
