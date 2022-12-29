/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwise;

import java.util.Scanner;

/**
 *
 * @author Luis Parra
 */
public class BitwiseOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  Scanner sc = new Scanner(System.in);
    
        int a = 5; //0101
        int b = 7; //0111; 
  
        // bitwise and 
        // 0101 & 0111=0101 = 5 
        System.out.println("a&b = " + (a & b)); 
  
        // bitwise or 
        // 0101 | 0111=0111 = 7 
        System.out.println("a|b = " + (a | b)); 
  
        // bitwise xor 
        // 0101 ^ 0111=0010 = 2 
        System.out.println("a^b = " + (a ^ b)); 
  
        // bitwise and 
        // ~0101=1010 
        // will give 2's complement of 1010 = -6 
        System.out.println("~a = " + ~a); 
  
        // can also be combined with 
        // assignment operator to provide shorthand 
        // assignment 
        // a=a&b 
        a &= b; 
        System.out.println("a= " + a); 

        //shift operations
        int s = 8; // 1000
        
        //left shift operator:  se le agregan 2 elementos mas al final
        System.out.println(s<<2); //100000 -->32
        
        //right shift operator:  se le quitan 2 elementos del final
        System.out.println(s>>2); //10 -->2
       
        System.out.println(10<<1|0);

        
        int num = 5;
        //devuelve el numero en binario como un string
        String binario = Integer.toBinaryString(num);
        String res = "";
        for (int i = 0; i < binario.length(); i++) {
            String bi = binario.charAt(i)+"";
            if (bi.equals("1")) {
                res += "0";
            }else{
                res += "1";
            }           
        }
        //devolver traducido a binario con el numero 2
        Integer.parseInt(res, 2);
        
        
    }
    
}
