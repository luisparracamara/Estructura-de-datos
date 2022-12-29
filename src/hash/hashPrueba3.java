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
public class hashPrueba3 {

    String arreglo[];
    int tam;
    
    hashPrueba3(int size){
        tam = size;
        arreglo = new String[tam];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = "-1";
        }
    }
    
    public void funcionHash(String arregloMain[], String arreglo[]){
        for (int i = 0; i < arregloMain.length; i++) {
            String elemento = arregloMain[i];
            int indice = Integer.parseInt(elemento)%29;
            System.out.println("El elemento: "+elemento+" Se posicione en la casilla numero: " +indice);
            
            while(arreglo[indice] != "-1"){
                indice++;
                System.out.println("Ocurrio una colision en el indice: " +(indice-1)+" ahora se traslada al indice: "+indice);
                indice = indice%tam;
            }
            arreglo[indice] = elemento;
        }
    }
    
    public String buscar(String elemento){
        int indice = Integer.parseInt(elemento)%29;
        int contador = 0;
        
        while(arreglo[indice] != "-1"){
            if (arreglo[indice] == elemento) {
                System.out.println("Elemento: " + elemento + 
                        " Fue encontrado en el indice: " + indice);
                return arreglo[indice];     
            }
            indice++;
            indice = indice%tam;
            
            contador++;
            if (contador > 29) {
                break;
            }
        }
        return null;
    }
    
    //metodo para mostra la tabla
    public void mostrar(){
        int incremento = 0;
        int i,j;
        for (i = 0; i < 1; i++) {
            incremento += 29;
            
            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
            
            System.out.println();
            
            for (j = incremento-29; j < incremento; j++) {
                System.out.format("| %3s " + " " , j);
            }
            
            System.out.println(" | ");
            
            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }
            
            System.out.println();
            
            for (j = incremento-29; j < incremento; j++) {
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
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hashPrueba3 hash = new hashPrueba3(29);
        String arregloMain[] = {"10","50","95","54","56","98","56","15","62","17","61","93"};
        
        hash.funcionHash(arregloMain, hash.arreglo);
        hash.mostrar();
        hash.buscar("50");
    }
    
}
