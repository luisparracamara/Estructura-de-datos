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
public class hashPrueba {

    /**
     * @param args the command line arguments
     */
    
    String arreglo[];
    int contador, tam;
    
    public hashPrueba(int t){
        tam = t;
        arreglo = new String[tam];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = "-1";
        }
        
    }
    
    //asignar lugar
    public void funcionHash(String[] arregloMain, String[] arreglo){
        for (int i = 0; i < arregloMain.length; i++) {
            String elemento = arregloMain[i];
            int indice = Integer.parseInt(elemento)%5;
            System.out.println("indice es: " +indice
                    +" para el elemento: " + elemento);
            
            
            //si colisiona
            while(arreglo[indice] != "-1"){
                indice++;
                System.out.println("ocurrio una colision en el indice: "+
                        (indice-1)+" cambiar el indice a: " 
                        +indice); 
                indice = indice%tam;
            }
            arreglo[indice] = elemento;
        }
    }
    
    
    //encontrar por clabe
    public String buscar(String clave){
        int indice = Integer.parseInt(clave)%5;
        while(arreglo[indice] != "-1"){
            if (arreglo[indice] == clave) {
                System.out.println(clave + " fue encontrada en el indice "
                + indice);
                return arreglo[indice];
            }
            ++indice;
            indice = indice%tam;
        }
        return null; 
    }
    
    
    //eliminar pasar a -1
    public String eliminar(String clave){
        int indice = Integer.parseInt(clave)%5;
        while(arreglo[indice] != "-1"){
            if (arreglo[indice] == clave) {
                arreglo[indice] = "-1";
                System.out.println("Elemento eliminado: "+arreglo[indice]);
                return arreglo[indice];
            }
            ++indice;
            indice = indice%tam;
        }
        return null; 
    }
    
    //metodo para mostra la tabla
    public void mostrar(){
        int incremento = 0;
        int i,j;
        for (i = 0; i < 1; i++) {
            incremento += 5;
            
            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
            
            System.out.println();
            
            for (j = incremento-5; j < incremento; j++) {
                System.out.format("| %3s " + " " , j);
            }
            
            System.out.println(" | ");
            
            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }
            
            System.out.println();
            
            for (j = incremento-5; j < incremento; j++) {
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
    
    

    
    
    
    public static void main(String[] args) {
       hashPrueba hash = new hashPrueba(5);
       String elementos[] = {"20","33","21","10","122"};
       
       hash.funcionHash(elementos, hash.arreglo);
        /*for (int i = 0; i < hash.arreglo.length; i++) {
            System.out.println(hash.arreglo[i]);
        }*/
        System.out.println(hash.buscar("10"));
        hash.eliminar("122");
        hash.mostrar();
        
        
    }
    
    
    
}
