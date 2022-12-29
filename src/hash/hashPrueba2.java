/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

/**
 *
 * @author Luis Parra
 */
public class hashPrueba2 {
    
    int tam;
    int []arreglo;
    
    public hashPrueba2(int t){
        tam = t;
        arreglo = new int[tam];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = -1;
        }
    }
    
    public void funcionHash(int []arregloMain,int []arreglo){
        for (int i = 0; i < arregloMain.length; i++) {
            int elemento = arregloMain[i];
            int indice = elemento%7;
            System.out.println("indice es: " +indice
                    +" para el elemento: " + elemento);
            
            while(arreglo[indice] != -1){
                indice++;
                System.out.println("ocurrio una colision en el indice: "+
                        (indice-1)+" cambiar el indice a: " 
                        +indice); 
                indice = indice%tam;
            }
            arreglo[indice] = elemento;
        }
    }
    
    //metodo para mostra la tabla
    public void mostrar(){
        int incremento = 0;
        int i,j;
        for (i = 0; i < 1; i++) {
            incremento += 10;
            
            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
            
            System.out.println();
            
            for (j = incremento-10; j < incremento; j++) {
                System.out.format("| %3s " + " " , j);
            }
            
            System.out.println(" | ");
            
            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }
            
            System.out.println();
            
            for (j = incremento-10; j < incremento; j++) {
                if (arreglo[j] == -1) {
                    System.out.print("|      ");
                }else{
                    System.out.print(String.format("| %3s " + " ", arreglo[j]));

                }
            }
            
            System.out.println(" | ");
            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
            System.out.println();
            
        }
    }
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hashPrueba2 hash = new hashPrueba2(10);
        int arr[] = {34,65,21,67,32,42,12,57,78,15};
        for (int i = 0; i < hash.arreglo.length; i++) {
            System.out.println(hash.arreglo[i]);
        }
        hash.funcionHash(arr,hash.arreglo);
        hash.mostrar();
    }
    
}
