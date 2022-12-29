/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recusrividad;

/**
 *
 * @author Luis Parra
 */
public class Recursividadiindirecta {
     static void metodoa(char c){
      
         if (c>'A') {
             metodob(c);
             System.out.println(c);
         }
        
    }
     
     static void metodob(char c){
        metodoa(--c);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println();
        metodoa('Z');
        System.out.println();
        
        
    }
    
}
