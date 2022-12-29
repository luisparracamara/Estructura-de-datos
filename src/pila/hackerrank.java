/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import java.util.Stack;

/**
 *
 * @author Luis Parra
 */
public class hackerrank {
static String isBalanced(String s) {
        int cantidad = s.length();
        Stack pila = new Stack();
        for (int i = 0; i < cantidad; i++) {
            char signo = s.charAt(i);

            if(signo == '[' || signo == '(' || signo == '{'){
                pila.push(signo);
            }else{
                if(pila.isEmpty()){
                return "NO";
                }
            }
            if((char)pila.peek() == '[' && signo == ']'){pila.pop();}
            if((char)pila.peek() == '(' && signo == ')'){pila.pop();}
            if((char)pila.peek() == '{' && signo == '}'){pila.pop();}
        }

        if(pila.isEmpty()){
            return "YES";
        }
        return "NO";

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(isBalanced("{[(])}"));
           
    }
    
}
