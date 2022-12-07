/*
 * 3. Introducir por teclado un valor numérico entero en un String y convertirlo en un
 * Wrapper .
 */
package pkg2_3_wrappers;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usrNum = "";
        Integer resultado;
        
        System.out.print("Introduce un valor númerico entero: ");
        usrNum = teclado.nextLine();
        
        resultado = Integer.parseInt(usrNum);
        System.out.println("El valor númerico entero introducido es: " + resultado);
    }
    
}
