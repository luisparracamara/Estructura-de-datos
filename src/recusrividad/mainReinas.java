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
public class mainReinas {
     final int N = 8;
    final int n = (N+1);
    int [] reinas = new int[1];
    static boolean solucion;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OchoReinas rein = new OchoReinas();
        rein.solveNQ(); 
        //solucion = rein.solucionReinas();
    }
    
}
