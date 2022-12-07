/*
    43. (LetraALetra) Escribe un programa en el que se solicite al usuario un texto de forma repetida hasta que el
    usuario introduzca la cadena vacía. Con cada texto que introduzca el usuario se le mostrará carácter a
    carácter, cada carácter en una línea.
    
        Introduce texto: Hola
        H
        o
        l
        a
        Introduce texto: Casa
        C
        a
        s
        a
        Introduce texto:
        Fin del programa
 */
package letraaletra;

import java.util.Scanner;

public class LetraALetra {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena = "";

        do {
            System.out.print("Introduce texto: ");
            cadena = teclado.nextLine();

            for (int j = 0; j <= cadena.length() - 1; j++) {
                System.out.println(cadena.charAt(j));
            }

        } while (!cadena.equals(""));
        System.out.println("Fin del programa");
    }
}
