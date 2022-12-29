/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;
import java.util.Arrays;
/**
 *
 * @author Luis Parra
 */
public class ClassArrays {
    
    
void imprimir(int arreglo[]){
         for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+"-");
        }
        System.out.println("");
    }
    void imprimirString(String arreglo[]){
         for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+"-");
        }
        System.out.println("");
    }
    
    static class Punto{
        int p1,p2;
        public Punto(int a, int b){
            this.p1 = a;
            this.p2 = b;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int arreglo[] = {10,50,43,23,1,56};
        int arreglo2[] = {10,50,43,23,1,56};
        char arregloLetras[] = {'f','e','a','c','u','b'};
        int[] letras = {'a','b','w','A','D','Z'};
        int rangos[] = {5,4,3,2,1,0,-1};
        String palabras[] = {"xfr","rsq","aub"};
        
        int numeros1[] = {5,4,3,2,1,0,-1};
        int numeros2[] = {5,4,3,2,1,0,-1};
        String palabras2[] = {"aub","rsq","xfr"};
        
        ClassArrays c = new ClassArrays();
        Punto[] punto1 = {new Punto(1,2)};
        Punto[] punto2 = {new Punto(1,2)};
        
        Punto p1 = new Punto(1,2);
        Punto p2 = new Punto(1,2);
        
        
        int[] llenar = new int[5];
        String[] strings = new String[5];
        Punto pts[] = new Punto[5];
       
        
        //ordenar con quicksort
        Arrays.sort(arreglo);
        Arrays.sort(arregloLetras);
        Arrays.sort(letras);
        Arrays.sort(rangos,3,7);
        Arrays.sort(palabras);
        
        //busquedas, busqueda binaria
        System.out.println("Busquedas");
        System.out.println(Arrays.binarySearch(arreglo, 56));
        System.out.println(Arrays.binarySearch(arregloLetras, 'c'));
        System.out.println("-------------------------------------");
        
        //comparaciones
        System.out.println("Comparaciones");
        System.out.println(Arrays.equals(numeros1, numeros2));
        System.out.println(Arrays.equals(palabras, palabras2));
        System.out.println(Arrays.equals(punto1, punto2));
        System.out.println(p1.equals(p2));
        System.out.println("-------------------------------------");
        
        //llenar arreglos
        Arrays.fill(llenar, 1);
        Arrays.fill(llenar, 0, 2, 5);
        Arrays.fill(strings, "hola");
        Arrays.fill(pts,0,2, new Punto(3,4) );
        
        c.imprimir(arreglo);
        c.imprimir(letras);
        c.imprimir(rangos);
        c.imprimirString(palabras);
        c.imprimir(llenar);
        c.imprimirString(strings);
        
       
        System.out.println("");
        for (int i = 0; i < arregloLetras.length; i++) {
            System.out.print(arregloLetras[i]+"-");
        }
        
        System.out.println("");
        System.out.println("Objetos");
        for (int i = 0; i < pts.length; i++) {
            System.out.println(pts[i]+"-");
        }
        
        //imprimir arreglos
        System.out.println(Arrays.toString(arreglo));
       
        

    }
    
}
