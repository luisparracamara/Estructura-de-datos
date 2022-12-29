/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Luis Parra
 */
public class ClassHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //no se peuden repetir keys
        //aplican  los mismos metodos que MAP
        //ordenados por keys
        HashMap<Integer,String> hash = new HashMap();
        hash.put(1, "gf");
        hash.put(2, "dubo");
        hash.put(3, "dubito");
        hash.put(4, "dubolio");
        hash.put(5, "dubolio");
        
        hash.get(1);
        hash.remove(1);
        hash.containsKey(2);
        hash.containsValue("dubito");
        hash.size();
        hash.replace(2, "shorito");
        
        
        //la suma de todos los values
        hash.hashCode();
        
        System.out.println(hash);
        
        Iterator<Integer> it = hash.keySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
