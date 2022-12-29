/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Luis Parra
 */
public class ClassArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //mejor que array normal || ArrayList de objetos por default
       ArrayList<String> arrayList = new ArrayList<>();
       ArrayList<Integer> numeros = new ArrayList<>();
       
       arrayList.add("shorito");
       arrayList.add("ismanuel");
       arrayList.add("renashor");
       
       arrayList.remove("shorito");
       Collections.sort(arrayList);
       numeros.size();
       System.out.println(arrayList);
       //copiar los valores de dos listas
       Collections.copy(numeros, numeros);
       //contar los repetidos de la lista
       Collections.frequency(arrayList, "objeto 1");
       
       numeros.add(10);
       numeros.add(0);
       numeros.add(-2);
       numeros.add(40);
       Collections.sort(numeros);
       System.out.println(numeros);
       System.out.println(Collections.max(numeros));
       System.out.println(Collections.min(numeros));
       //invertir lista
       Collections.reverse(numeros);
       
       
    }
    
}
