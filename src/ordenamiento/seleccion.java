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
public class seleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []a = {10,30,5,22};
        ordSeleccion(a);
    }
    
    public static void ordSeleccion(int[]a){
        for (int inicio = 0; inicio < a.length-1; inicio++) {
            int menor = inicio;
            
            for (int siguiente = inicio+1; siguiente < a.length; siguiente++) {
                System.out.println(a[siguiente] < a[menor]);
                if (a[siguiente] < a[menor]) {
                    menor = siguiente;
                }
                
            }

             int aux = a[inicio];
             a[inicio] = a[menor];
             a[menor] = aux;  
            
        }
        
        
        for (int i = 0; i < a.length; i++) {
            System.out.print("["+ a[i] + "]");
        }
    }    
}
