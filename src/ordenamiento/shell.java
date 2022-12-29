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
public class shell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {50,26,7,9,15,27};
        shell(a);
    }
    
    
    public static void shell(int []a){
        int salto, i,j,k;
        
        salto = a.length/2;
        
        while(salto>0){
            for (i = salto; i < a.length; i++) {
                 j = i-salto; //posicion inicial
                 System.out.print(i + "-");
                 System.out.print(salto + "= ");
                 System.out.print("[" + j +"]");
                 
                 
                  while(j>=0){
                    k = j + salto; //posicion final
                    
                    if (a[j] <= a[k]) {
                        j = -1; //para terminar el ciclo solamente while de arriba
                    }else{
                        int aux = a[j];
                        a[j] = a[k];
                        a[k] = aux;
                        j = j-salto;
                        
                    }     
                }
                
               
                 
            }
            
            salto = salto/2;
            System.out.println("Siguiente salto: " + "["+ salto + "]");
        }
        
        for (int f = 0;f < a.length; f++) {
            System.out.print("["+ a[f] + "]");
        }
    }
    
    
    
}
