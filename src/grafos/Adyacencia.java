/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Luis Parra
 */
public class Adyacencia {
    
    private int cantidad;
    private int[][] matriz;
    
    
    public Adyacencia(int n){
        cantidad = n;
        matriz = new int[cantidad][cantidad];
        //se inicializa matriz en 0
        for(int i=0; i< cantidad; i++){
            for(int j=0; j< cantidad; j++){
                matriz[i][j] = 0;
            }            
        }
    }
    
    public void agregar(int vector, int arco){
        matriz[vector][arco] += 1;
    } 
    
     public void remover(int vector, int arco){
        if(matriz[vector][arco]>0)
            matriz[vector][arco] -= 1;
    }
     
      public void imprimir(){
        for(int i=0; i< cantidad; i++){
            for(int j=0; j< cantidad; j++){
                System.out.print( matriz[i][j] + "  " );        
            }
            System.out.println();
        }  
    }
      
   
    
}
