/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesAVL;

/**
 *
 * @author Luis Parra
 */
public class NodoArbolAVL {
    int dato,fe;
    NodoArbolAVL left,right;
    
    NodoArbolAVL(int e){
        dato = e;
        fe = 0;
        left = null;
        right = null;
    }
}
