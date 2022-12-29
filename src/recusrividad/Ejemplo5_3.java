package recusrividad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Parra
 */
public class Ejemplo5_3 {
    
        static int sumaRecursiva(int n){
        if (n<=9) {
            return n;
        }else{
            return sumaRecursiva(n/10) + n%10;
        }
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.println(sumaRecursiva(290));

    }
    
}
