/*
 * 26. (Primos) Escribir un programa en el que el usuario escriba un número entero y se le diga
 * todos los números primos entre 1 y el número introducido.
 */
package primos;

import java.util.Scanner;

public class Primos {

    public static boolean esPrimo(int numeroEntero) {
        int salto = 0;
        boolean primo = false;

        if ((numeroEntero) != 1) {
            for (int contador = 1; contador <= numeroEntero; contador++) {

                if ((numeroEntero % contador) == 0) {
                    salto++;
                }
            }

            if (salto == 2) {
                primo = true;
            }
        } else {
            primo = true;
        }

        return primo;
    }

    public static String primosEntre1n(int numeroEntero) {
        String cadena = "";
        for (int contador = 1; contador <= numeroEntero; contador++) {
            if (esPrimo(contador) == true) {
                cadena += contador + " ";
            } else {
                cadena += "";
            }
        }
        return cadena;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum;

        System.out.print("Introduce un número: ");
        usrNum = teclado.nextInt();

        System.out.println(primosEntre1n(usrNum));
    }

}
