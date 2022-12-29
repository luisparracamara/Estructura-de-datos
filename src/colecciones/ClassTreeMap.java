/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Iterator;
import java.util.TreeMap;

/**
 *
 * @author Luis Parra
 */
public class ClassTreeMap {
 static class Persona{
        int n1,n2;
        Persona(int n1, int n2){
            this.n1 = n1;
            this.n2 = n2;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //utilizar metodos map -- treemap te asegura el orden
        //es mas rapido que el hashmap
        
        TreeMap<Integer, String> mapaArbol = new TreeMap();
        
        mapaArbol.put(2, "luis");
        mapaArbol.put(3, "isra");
        mapaArbol.put(1, "dunbo");
        mapaArbol.put(4, "shore");
        
        System.out.println(mapaArbol);
        
        TreeMap<Integer,Persona> tm = new TreeMap();
        for (int i = 0; i < 100; i++) {
            tm.put(i, new Persona(i, i));
        }
        
        Iterator it = tm.keySet().iterator();
        while(it.hasNext()){
            System.out.println("Key: "+tm.keySet() + " n: "+it.next());
        }
    }
    
}
