/*
 * 1. Introducir por teclado un valor de tipo double y convertirlo en Wrapper
 */
package pkg2_1_wrappers;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double usrDouble = 0;
        Double usrWrapper;
        
        System.out.print("Introduce un double: ");
        usrDouble = teclado.nextDouble();
        
        usrWrapper = usrDouble;
        
        System.out.println("El Wrapper es: " + usrWrapper);
    }
    
}
