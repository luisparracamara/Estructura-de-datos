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
public class busquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60,70,80,90,100,110,120,130};
        
        System.out.println(busquedaBinaria(a,110));
    }
    
    public static int busquedaBinaria(int a[],int clave){
        int alto,bajo,central;
        
        alto = a.length-1;
        bajo = 0;
        
        while(bajo<=alto){
            central = (alto+bajo)/2;
            
            if (a[central] == clave) {
                return central;
            }
            
            if (clave<a[central]) {
                alto = central-1;
            }else{
                bajo = central+1;
            }
        }
        return -1;
     }
    
}
