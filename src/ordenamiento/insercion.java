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
public class insercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {5,3,4,1,2,};
        insercion(a);
    }
    
    public static void insercion(int a[]){
        for (int i = 0; i < a.length; i++) {
            int pos = i;
            int aux = a[i];
            
            while( (pos>0) && (aux<a[pos-1])  ){
                a[pos] = a[pos-1];
                pos--;
                System.out.println(a[pos]);
            }
            
            a[pos] = aux;
            
        }
        
        
        
        
        for (int i = 0; i < a.length; i++) {
            System.out.print("["+ a[i] + "]");
        }
        
    }
    
    
}
