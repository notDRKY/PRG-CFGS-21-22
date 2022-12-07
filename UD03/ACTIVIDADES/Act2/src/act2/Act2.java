/*
 * 2. Programa que muestre por pantalla los 5 primeros números pares.
 */
package act2;

import java.util.Scanner;

public class Act2 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena = "";
        int resto;
        int pares = 5;
        
        for (int contador = 0; pares > 0; contador++) {
            resto = contador % 2;
            
            if (resto == 0) {
                cadena += contador + " ";
                pares--;
                
            } else {
                
            }
        }
        
        System.out.println(cadena);
        
    }
    
}
