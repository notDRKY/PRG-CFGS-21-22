/*
 * 17. Pedir un número y calcular su factorial (el factorial se representa con el simbolo ! ).
 * Aquí tienes el factorial de los 5 primeros números enteros:
 *     1! = 1
 *     2! = 2 * 1 = 2
 *     3! = 3 * 2 * 1 = 6
 *     4! = 4 * 3 * 2 * 1 = 24
 *     5! = 5 * 4 * 3 * 2 * 1 = 120
 */
package pkg17factorial;

import java.util.Scanner;

public class Main {

    public static int calculaFactorial(int usrNum) {
        int resultado = 1;
        
        for(int i = 1; i <= usrNum; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum = 0;

        System.out.print("DIME UN NÚMERO: ");
        usrNum = teclado.nextInt();

        System.out.println("EL FACTORIAL DE " + usrNum + "! ES: " + calculaFactorial(usrNum));
    }
}
