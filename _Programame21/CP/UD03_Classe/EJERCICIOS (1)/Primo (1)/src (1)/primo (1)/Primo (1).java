/*
 * 25. (Primo) Escribir un programa en el que el usuario escriba un número entero y se le diga si se trata o no de
 * un número primo. Recuerda que un nº primo es aquel que solo es divisible por 1 y por sí mismo.
 */
package primo;

import java.util.Scanner;

public class Primo {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroEntero;
        int primo = 0;
        
        System.out.print("Dime un numero entero: ");
        numeroEntero = teclado.nextInt();
        
        for (int contador = 1; contador <= numeroEntero; contador++) {
            
            if((numeroEntero % contador) == 0) {
                primo++;
            }
        }
        
        if (primo == 2) {
            System.out.println("El numero introducido (" + numeroEntero + ") es primo.");
        } else {
            System.out.println("El numero introducido (" + numeroEntero + ") no es primo.");
        }
        
    }
    
}