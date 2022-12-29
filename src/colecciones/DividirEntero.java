/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author Luis Parra
 */
public class DividirEntero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n = 234;
     
      while(n != 0){
        int digito = n%10;
        n /= 10;
          System.out.println(digito);
      }
      
      
      
      
     //recorrer en diagonal
     int matrix[][] = {
                    {1,2,3,4},
                    {5,1,2,3},
                    {9,5,1,2}
                  };
     for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                if( matrix[i][j] != matrix[i+1][j+1] ){
                    System.out.println(false);
                } 
                
                System.out.println(matrix[i][j]);
                System.out.println(matrix[i+1][j+1]);
            }
            
        }
      
      
      
      
      
    }
    
    
    //recorrer matriz por columnas
    /*
    for (int i = 0; i <arreglo[0].length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                System.out.print(arreglo[j][i] + " ");
            }
            
        }
        System.out.println("");

    /*
     System.out.print(" | " + matriz[x][y]+ " | ");   
        System.out.println("\n----------------------------------------");
    */
    
    
    
  
}
