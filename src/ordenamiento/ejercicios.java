/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.util.Arrays;

/**
 *
 * @author Luis Parra
 */
public class ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {4,7,11,4,9,5,11,7,3,5};
        int arreglo[] = {10,5,40,1,30,20,50,2,3};
        int arregloDescendente[] = {60,50,40,30,20,10};
        
        int maestro[] = {3,2,4,5,1};
        int esclavo[] = {10,20,30,40,50};
        
         
         
         int[] var = new int[2000];
         int[] claves = new int[999];
         for (int i = 0; i < var.length; i++) {
            int aleatorio = (int) (Math.random()*2000)+1;
            var[i] = aleatorio;
            
        }
         
         for (int i = 0; i < claves.length; i++) {
            int aleatorio = (int) (Math.random()*2000)+1;
            claves[i] = aleatorio;
        }
 
        
        //eliminarDuplicados(a);
        System.out.println("");
        //System.out.println(busquedaBinariaDescendente(arregloDescendente,60));
        System.out.println("");
        //porblemaOrdenacionN(arreglo);
        System.out.println("");
        //System.out.println(devolverMediana(arreglo,0,arreglo.length-1));
        System.out.println("");
        //busquedasComparacion(var,claves);
        System.out.println("");
        //maestroEsclavo(maestro,esclavo,0,maestro.length-1);
        
        
         /*for (int k = 0; k < maestro.length && k<esclavo.length; k++) {
            System.out.print("Maestro: ["+maestro[k]+"]" );
            System.out.print("Esclavo: ["+esclavo[k]+"]" );
            System.out.println("");
        }*/
         
         
         System.out.println("");
         problema6_8(claves);
    }

    private static void eliminarDuplicados(int[] a) {
       
        for (int i = 0; i < a.length-1; i++) {
            int repetido = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[repetido] == a[j]) {
                   a[j] = 0;
                   
                }
            }
        }
        for (int b = 0; b < a.length; b++) {
            if (a[b]!=0) {
                System.out.print("["+ a[b] + "]");
            }
            
        }  
    }
    
    
    public static int busquedaBinariaDescendente(int a[], int clave){
        int alto,bajo,central;
        
        bajo = a.length-1;
        alto = 0;
        
        while(alto<=bajo){
             central = (bajo+alto)/2;
        
            if (a[central]==clave) {
                return central;
            }

            if (clave<a[central]) {
                alto = central+1;
            }else{
                bajo = central-1;
            }
        }
       return -1;
    }
    
    
    
    public static void porblemaOrdenacionN(int a[]){
       
        int i;
        for ( i = 0 ; i < a.length; i++) {
            int menor = i;

            for (int j = i+1; j < a.length; j++) {
                if (a[j]<a[menor]) {
                    menor = j;
                }
                
            }
            
            if (i == 0) {
                 int menor2 = a[menor];
                 a[menor] = a[0];
                 a[0] = menor2;    
            }

            if (i == 1) {
                int menor2 = a[menor];
                a[menor] = a[1];
                a[1] = menor2;    
            }

            if (i == 2) {
                int menor2 = a[menor];
                a[menor] = a[a.length-1];
                a[a.length-1] = menor2;
            }
         
        }


        for (int b = 0; b < a.length; b++) {
            System.out.print("["+ a[b] + "]");
        }  
    }
    
    
    public static int devolverMediana(int a[],int primero,int ultimo){
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
            }  
             
        }while(i<=j);
        
        if (primero<j) {
          devolverMediana(a,primero,j);
        }
        
        if (i<ultimo) {
            devolverMediana(a,i,ultimo);
        }

         int mediana = (a.length-1)/2;
        return a[mediana];
       
    }
    
    public static void busquedasComparacion(int a[],int claves[]){
    
        for (int i = 0; i < claves.length; i++) {
           int clave = a[i];
           
            for (int j = 0; j < a.length; j++) {
                if (clave == a[j]) {
                    System.out.println("la posicion es: " + j + " la clave es: " + clave);
                }
            }
        
        }
    }
    
    
    public static void maestroEsclavo(int maestro[],int esclavo[], int primero, int ultimo){
        int pivote,i,j,aux;
        
        pivote = maestro[(primero+ultimo)/2];
        
        i = primero;
        j = ultimo;
        
        do {
            while(maestro[i]<pivote){
                i++;
            }
            
            while(maestro[j]>pivote){
                j--;
            }
            
            if (i<=j) {
                aux = maestro[i];
                maestro[i] = maestro[j];
                maestro[j] = aux;
                
                int aux2 = esclavo[i];
                esclavo[i] = esclavo[j];
                esclavo[j] = aux2;
                
                i++;
                j--;
            }
        } while (i<=j);
        
        if (primero<j) {
            maestroEsclavo(maestro,esclavo,primero,j);
        }
        
        if (i<ultimo) {
            maestroEsclavo(maestro,esclavo,i,ultimo);
        }
        
    }
    
    
   public static void problema6_8(int a[]){
       /*for (int i = 0; i < a.length-1; i++) {
           for (int j = i+1; j < a.length; j++) {
               if (a[i]>a[j]) {
                   int aux = a[i];
                   a[i] = a[j];
                   a[j] = aux;
               }
           }
       }*/
       
       //ordenacion shell
       int j,k,salto,aux;
       salto = (a.length-1)/2;
   
       while(salto>0){
           for (int i = salto; i < a.length; i++) {
           j = i-salto;
           
           while(j>=0){
               k = j+salto;
               
               if (a[j]>a[k]) {
                   aux = a[j];
                   a[j] = a[k];
                   a[k] = aux;
                   j = j-salto;
               }else{
                   j = -1;
               }
           }
       }
               salto = salto/2;
       }
       
       
       
       for (int i = 0; i < a.length; i++) {
           System.out.println(a[i]);
       }
   }
   
   
   
   
    
    
}
