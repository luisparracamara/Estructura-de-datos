/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasEnlazadas;

/**
 *
 * @author Luis Parra
 */
public class Punto {
    double x,y;
    
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Punto(){
         //constrtuctor por defecto
         x = y = 0.0;
    }
       
}
