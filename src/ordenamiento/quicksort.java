/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author Luis Parra
 */
public class quicksort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {7,10,6};
        quicksort(a,0,a.length-1);
        //quick2(a,0,a.length-1);
        
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print("-"+a[i]+"-");
        }
        System.out.println("");
         for (int i = 0; i < a.length; i++) {
            System.out.print("-"+a[i]+"-");
        }
      
        
    }
    
    public static void quicksort(int a[], int primero, int ultimo){
        int i,j,pivote,central,auxiliar;
        
        i= primero;
        j= ultimo;
        central = (primero+ultimo)/2;
        pivote = a[central];
        
         do{
             
            while(a[i]<pivote){ 
                i++;  
            }
            
             while(a[j]>pivote){  
                j--;  
            }
             
            //intercambio
            if (i<=j) {
                auxiliar = a[i];
                a[i] = a[j];
                a[j] = auxiliar;
                i++;
                j--;
                //System.out.print(" I: " + i + " J: " +j);
            }  
             
        }while(i<=j);
        
      if (primero<j) {
          quicksort(a,primero,j);
        }
        
        if (i<ultimo) {
            quicksort(a,i,ultimo);
        }
     
        
    }
    
    
    public static void quick2 (int a[], int primero, int ultimo){
        int pivote = a[primero];
        int i = primero;
        int j = ultimo;
        int aux;
        
        while(i<j){
            
            while(a[i]<= pivote && i<j){
                i++;
            }
            
            while(a[j] > pivote){
                j--;
            }
            
            if (i<j) {
                aux = a[i];
                a[i] = a[j];
                a[j] = aux;
            }
            
          
            
        }
          a[primero] = a[j];
          a[j] = pivote;
          
          if (primero< j-1) {
            quick2(a,primero,j-1);
        }
          
          if (j+1 < ultimo) {
            quick2(a,j+1,ultimo);
        }
    }
    
    
}
