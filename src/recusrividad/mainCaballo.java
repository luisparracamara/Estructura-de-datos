/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recusrividad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Luis Parra
 */
public class mainCaballo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y;
        boolean solucion;
        
        BufferedReader entrada = new BufferedReader(
        new InputStreamReader(System.in));
        
        
        try {
        System.out.println("Posicion inicial del caballo. ");
        System.out.print(" x = ");

        x = Integer.parseInt(entrada.readLine());
        System.out.print(" y = ");
        y = Integer.parseInt(entrada.readLine());
        
        CaballoSaltador miCaballo = new CaballoSaltador(x,y);
        solucion = miCaballo.resolverProblema();
        if (solucion)
        miCaballo.escribirTablero();
        }
        catch (Exception m)
        {
        System.out.println("No se pudo probar el algoritmo, " + m);
        }
       }
}
        
    
    

