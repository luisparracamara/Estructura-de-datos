/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.Scanner;

/**
 *
 * @author Luis Parra
 */
public class matrizAdyacente {


    public static void main(String[] args) {
       
       Adyacencia matriz = new Adyacencia(5);
        
        matriz.agregar(0, 1);
        matriz.agregar(0, 3);
        matriz.agregar(0, 4);
        
        matriz.agregar(1, 0);
        matriz.agregar(1, 2);
        
        matriz.agregar(2, 1);
        matriz.agregar(2, 3);
        matriz.agregar(2, 4);
        
        matriz.agregar(3, 0);
        matriz.agregar(3, 2);
        
        matriz.agregar(4, 0);
        matriz.agregar(4, 2);
        
        matriz.remover(4, 0);
        
        matriz.imprimir();
    
    }
}