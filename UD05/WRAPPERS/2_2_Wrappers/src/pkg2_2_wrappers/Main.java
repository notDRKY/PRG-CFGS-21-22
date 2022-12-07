/*
 * 2. Introducir por teclado un valor numérico en un String y convertirlo en entero.
 */

package pkg2_2_wrappers;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usrNum = "";
        int resultado = 0;
        
        System.out.print("Introduce un valor númerico en un String: ");
        usrNum = teclado.nextLine();
        
        resultado = Integer.parseInt(usrNum);
        
        System.out.println("El resultado es: " + resultado);
        
    }
    
}
