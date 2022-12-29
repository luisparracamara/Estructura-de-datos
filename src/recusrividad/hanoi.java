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


public class hanoi {
    
    static void hanoi(char varinicial, char varcentral, char varfinal, int n){
        if ( n == 1){
        System.out.println("Mover disco " + n + " desde varilla " +
        varinicial + " a varilla " + varfinal);
    }else{
            hanoi(varinicial, varfinal, varcentral, n-1);
            System.out.println("Mover disco " + n + " desde varilla " +
            varinicial + " a varilla " + varfinal);
            hanoi(varcentral, varinicial, varfinal, n - 1);
        }
    
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hanoi('a','b','c',2);
    }
    
}
