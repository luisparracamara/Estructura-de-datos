/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Luis Parra
 */
public class ClassMap {

    static class Customer{
        String nombre,id;
        
        Customer(String id, String nombre){
            this.id = id;
            this.nombre = nombre;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map <String,String> map = new HashMap<>();
        
        map.put("nombre1", "luis");
        map.put("nombre2", "shorito");
        map.put("nombre3", "zomzom");
        map.put("nombre4", "kofito");
        
        map.size();
        map.isEmpty();
        map.containsKey("nombre5");
        map.containsValue("kofito");
        //te da todos los keys
        map.keySet();
        //te da todos los values
        map.values();
        
        map.replace("nombre2", "shorito", "alkapone");
        map.remove("nombre1");
        //map.clear();
        
        System.out.println(map.get("nombre4"));
        System.out.println(map);
        
        
        //map de objetos
        Map <String,Customer> mapCustomer = new HashMap<>();
        mapCustomer.put("1", new Customer("1","kofi") );
        
        //map de enteros como key
        Map mapEnteros = new HashMap();
        mapEnteros.put(1, "hola");
        
        //map para rellenar
        Map <String,String> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println(map2);
        
        
        //iterar un map
        Iterator<String> keyIterator = map.keySet().iterator();
        while(keyIterator.hasNext()){
            String siguiente = keyIterator.next();
            System.out.println(siguiente);
            System.out.println(map.get(siguiente));
        }
    }
    
}
