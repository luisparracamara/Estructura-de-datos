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
public class burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []a = {10,30,40,50,20,5,998};
        ordIntercambio(a);
    }

    
    
    public static void ordIntercambio (int a[]){
        int inicio,siguiente;
        
        for (inicio = 0; inicio < a.length; inicio++) {
            
            for (siguiente = inicio+1; siguiente < a.length; siguiente++) {
                if (a[inicio]>a[siguiente]) {
                    int aux = a[inicio];
                    a[inicio] = a[siguiente];
                    a[siguiente] = aux;
                }
                
            }
            
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.print("["+ a[i] + "]");
        }
        
             System.out.println(a.length-1);
             
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print("["+ a[i] + "]");
        }
        
    }
}
