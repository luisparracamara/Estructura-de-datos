/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;





/**
 *
 * @author Luis Parra
 */
public class colecciones {

    
    public static void main(String[] args) {
        
       //int A[] = {1,1,0};
       int A[] = {9};
       
       
       boolean incremento = false;
       boolean res = true;
       
        for (int i = 1; i < A.length; i++) {
            if (A[i-1] > A[i] ) {
                incremento = false;
                break;
            }
            
            if (A[i-1] < A[i] ) {
                incremento = true;
                break;
            }
            
        }
        
        for (int i = 1; i < A.length; i++) {
            if (incremento == false) {
                
                if (A[i-1] >= A[i]) {
                    res = true;
                }else{
                    res = false;
                    break;
                }
                
            }else{
                if (A[i-1] <= A[i]) {
                    res = true;
                }else{
                    res = false;
                    break;
                }
            }
            
            
        }
        
        System.out.println(res);
      
    }   
    
}


