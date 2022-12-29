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
public class recursivo {
    
    long fibonacci (long n)
    {
    if (n == 0 || n == 1)
     return n;
    else
     return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
}
