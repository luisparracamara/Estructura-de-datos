/*
*Definir una clase DiaAnyo que contenga los atributos mes y día, el método igual() y el
método visualizar(). El mes se registra como un valor entero (1, Enero; 2, Febrero; etc.). El
día del mes se registra en la variable entera día. Escribir un programa que compruebe si una
fecha es la de su cumpleaños.
El método main() de la clase principal, Cumple, crea un objeto DiaAnyo y llama al método
igual() para determinar si coincide la fecha del objeto con la fecha de su cumpleaños, que se ha
leído del dispositivo de entrada.
 */
package fechasClase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Luis Parra
 */
public class fechas {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        final int NUM = 10;
 BufferedReader entrada = new BufferedReader(
 new InputStreamReader(System.in));
 int nums[]= new int[NUM];
 int total = 1;
 System.out.println("Por favor, introduzca " + NUM + " datos");
 for (int i = 0; i < NUM; i++)
 {
 nums[i] = Integer.parseInt(entrada.readLine());
 }
 System.out.print("\nLista de números: ");
 for (int i = 0; i < NUM; i++)
 {
 System.out.print(" " + nums[i]);
 total *= nums[i];
 }
 System.out.println("\nEl producto de los números es " + total);
}
            
            
        }

