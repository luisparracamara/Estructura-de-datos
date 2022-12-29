/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.util.Arrays;

/**
 *
 * @author Luis Parra
 */
public class HashTable {
    
    String []arreglo;
    int tam,contador;
    //constructor
    public HashTable(int t){
        tam = t;
        arreglo = new String[tam];
        Arrays.fill(arreglo,"-1");
    }
    
    public void funcionHash(String[] cadenaArreglo, String[] arreglo){
        for (int i = 0; i < cadenaArreglo.length; i++) {
            String elemento = cadenaArreglo[i];
            int indiceArreglo = Integer.parseInt(elemento)%7;
            System.out.println("indice es: " +indiceArreglo
                    +" para el elemento: " + elemento);
            
            
            //tratando las colisiones
            while(arreglo[indiceArreglo] != "-1"){
                indiceArreglo++;
                System.out.println("ocurrio una colision en el indice: "+
                        (indiceArreglo-1)+" cambiar el indice a: " 
                        +indiceArreglo); 
                indiceArreglo = indiceArreglo%tam;
                
            }
            arreglo[indiceArreglo] = elemento;
        }
        
    }
    
    
    //metodo para mostra la tabla
    public void mostrar(){
        int incremento = 0;
        int i,j;
        for (i = 0; i < 1; i++) {
            incremento += 8;
            
            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
            
            System.out.println();
            
            for (j = incremento-8; j < incremento; j++) {
                System.out.format("| %3s " + " " , j);
            }
            
            System.out.println(" | ");
            
            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }
            
            System.out.println();
            
            for (j = incremento-8; j < incremento; j++) {
                if (arreglo[j].equals("-1")) {
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
    
    //buscar clave
    public String buscar(String elemento){
        int indiceArreglo = Integer.parseInt(elemento)%7;
        int contador=0;
        
        while(arreglo[indiceArreglo] != "-1"){
            if (arreglo[indiceArreglo] == elemento) {
                System.out.println("Elemento: " + elemento + 
                        " Fue encontrado en el indice: " + indiceArreglo);
                return arreglo[indiceArreglo];
            }
            
            indiceArreglo++;
            indiceArreglo%=tam;
            contador++;
            if (contador > 7) {
                break;
            }
            
        }
        
        return null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashTable hash = new HashTable(8);
        String[] elementos = {"20","33","21","10","12","14","56","100"};
        hash.funcionHash(elementos, hash.arreglo);
        hash.mostrar();
        hash.buscar("100");
    }
    
}
