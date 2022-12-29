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
public class practicaOrden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {30,40,10,5,50,20};
        int arregloOrdenado[] = {10,20,30,40,50};
        //bubbleSort(a);
        System.out.println("");
        //busquedaSeleccion(a);
        System.out.println("");
        //busquedaInsercion(a);
        System.out.println("");
        //busquedaShell(a);
        System.out.println("");
        //quicksort(a,0,a.length-1);
        System.out.println("");
        System.out.println(busquedaBinaria(arregloOrdenado,20));
           
        for (int b = 0; b < a.length; b++) {
            System.out.print("["+ a[b] + "]");
        }  
        
        
    }
    
    public static void bubbleSort(int []a){
        
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]) {
                    int aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.print("["+ a[i] + "]");
        }
    }
    
    
    public static void busquedaSeleccion(int []a){
        for (int i = 0; i < a.length-1; i++) {
            int menor = i;
            
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<a[menor]) {
                    menor = j;
                }
                
                int aux = a[i];
                a[i] = a[menor];
                a[menor] = aux;
            }
        }
       
        
        for (int i = 0; i < a.length; i++) {
            System.out.print("["+ a[i] + "]");
        }
    }
    
    public static void busquedaInsercion(int []a){
       
        int pos,val;
        for (int i = 0; i < a.length; i++) {
            pos = i;
            val = a[i];
            
            while((pos>0) && (a[pos-1]>val)){
                a[pos] = a[pos-1];
                pos--;
            }
            
            a[pos] = val;
        }
      
      
        for (int i = 0; i < a.length; i++) {
            System.out.print("["+ a[i] + "]");
        }
   } 
    
    
    public static void busquedaShell(int []a){
        int j,k,salto;
        
        salto = a.length/2;
        
        while(salto>0){
            for (int i = salto; i < a.length; i++) {
                j = i-salto;
                
                while(j>=0){
                    k = j+salto;
                    
                    if (a[j]>a[k]) {
                        int aux = a[j];
                        a[j] = a[k];
                        a[k] = aux;
                        j=j-salto;
                    }else{
                        j = -1;
                    }
                }
            }
            salto = salto/2;
        }
       
        
      
        for (int b = 0; b < a.length; b++) {
            System.out.print("["+ a[b] + "]");
        }  
        
    }
    
    public static void quicksort(int []a, int primero, int ultimo){
        int pivote,i,j;
        i = primero;
        j= ultimo;
        pivote = a[(primero+ultimo)/2];
        
        do {
            while(a[i]<pivote){
                i++;
            }
            
            while(a[j]>pivote){
                j--;
            }
            
            if (i<=j) {
                int aux = a[i];
                a[i] = a[j];
                a[j] = aux;
                i++;
                j--;
            }
        } while (i<=j);
        
        if (primero<j) {
            quicksort(a,primero,j);
        }
        
        if (ultimo>i) {
            quicksort(a,i,ultimo);
        }
    }
    
    
    public static int busquedaBinaria(int a[], int clave){
      int central, bajo,alto;
      bajo = 0;
      alto = a.length-1;
      
      while(bajo<=alto){
          central = (alto+bajo)/2;
          
          if (a[central]==clave) {
              return central;
          }
          
          if (clave<a[central]) {
              alto = central-1;
          }else{
              bajo = central+1;
          }
      }
      return -1;
      }

    
}
