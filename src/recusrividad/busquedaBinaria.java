/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recusrividad;

/**
 *
 * @author Luis Parra
 */
public class busquedaBinaria {
    
    static int busquedaBR(int a[], int clave,int inferior, int superior){
      
     int central;
     
        if (superior<inferior) {
            return -1;
        }
        
        central = (superior+inferior)/2;
        
        if (a[central]==clave) {
            System.out.println("clave encontrada: " + a[central]);
            return central;
        }else if(clave<a[central]){
            System.out.println(central);
            return busquedaBR(a,clave,0,central-1);
            
        }else{
            System.out.println(central);
            return busquedaBR(a,clave,central+1,superior);
        }
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int[]vector ={1,4,7,8,9,14,23,47,56,60,61,63,65,66,68,69,70,73,76,77,79,80,82};
          int valorBuscado = 667;
          int inferior = 0;
          int superior = 22;
          
         System.out.println("posicion: " + busquedaBR(vector,valorBuscado,inferior,superior));
         //busquedaBR(vector,valorBuscado,inferior,superior);
          
    }
    
}
