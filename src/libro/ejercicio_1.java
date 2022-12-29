/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/**
 *
 * @author Luis Parra
 */
public class ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo[] = {1,1,3,7,5,5};
        
        // TODO code application logic here
        System.out.println(loge());
        System.out.println(logaritmo(1.0,1.0,1.0,1));
        System.out.println(vocales("aeiouatyo",0,0));
        System.out.println(multiplicar(3,5));
        System.out.println("Cantidad de permutaciones " + permutaciones(arreglo,0,0));
        System.out.println(arrayMayor(arreglo,0));
        
    }
    
    static public double loge()
        {
         double enl, delta, fact;
         int n;
         enl = fact = delta = 1.0;
         n = 1;
         do
         {
         enl += delta;
         n++;
         fact *= n;
         delta = 1.0 / fact;
         } while (enl != enl + delta);
         return enl;
        }
    
    static double logaritmo(double enl,double delta, double fact, int n){
        
        
        if (enl == enl + delta) {
            return enl-1;
        }else{
           
          enl += delta;
          fact *= n;
          delta = 1.0 / fact;
          return logaritmo(enl,delta,fact,n+1);
          
        }
    }
    
    
    static int vocales(String palabra, int indice, int vocales){
        
        char vocal = palabra.charAt(indice);
        
        if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                vocales = vocales+1;
        }
            
       
        if (indice != palabra.length()-1) {
             return vocales(palabra, indice+1,vocales);
        }else{
            return vocales;
        }     
 }    
    
    //Proporcionar métodos recursivos que representen los siguientes conceptos:
    //a) El producto de dos números naturales.
    //b) El conjunto de permutaciones de una lista de números.
    
    static int multiplicar(int n1,int n2){
        
        if (n2 == 1) {
            return n1;
        }else{
            int mult = n1 * n2;
            System.out.print("["+multiplicar(n1, n2-1)+"]");
            return mult;
        }
    }
    
    
    static int permutaciones(int arreglo[], int indice, int repetido){
        if (indice == arreglo.length) {
            return repetido;
        }else{
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[indice] == arreglo[i]) {
                    repetido = repetido+1;
                }
            }
            permutaciones(arreglo,indice+1,repetido);
            return repetido;
        }
        
    }
    
    
    static int arrayMayor(int []arreglo, int indice){
        int maximo = Integer.MIN_VALUE;
        
        if (indice == arreglo.length) {
            return maximo;
        }else{
            if (arreglo[indice] > maximo) {
                maximo = Math.max(arreglo[indice], arrayMayor(arreglo,indice+1));
            }else{
                maximo = Math.max(arreglo[indice], arrayMayor(arreglo,indice+1));
            }
        }
        
        return maximo;
        
    }
    
    
    
    
    
    
    
}
