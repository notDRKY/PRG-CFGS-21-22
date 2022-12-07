/*
CC CULEBRAS MAGICAS

ENTRADA
El programa deberá leer múltiples casos de prueba, cada uno compuesto por una línea de 
no más de 100 caracteres.
Las líneas contendrán únicamente letras del alfabeto inglés en mayúsculas, 
por lo que no contendrá ni la letra Ñ ni vocales con tilde. También podrán aparecer espacios (aunque no al principio ni al final), y no habrá ningún otro símbolo de puntuación.
La entrada terminará con una línea con, exactamente, el texto "FIN", que no deberá procesarse.

SALIDA
Por cada caso de prueba el programa deberá escribir la línea correspondiente encriptada.
 */
package espionajedenavidad;

import java.util.Scanner;

public class EspionajeDeNavidad {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String acumulador = "";
        String usrEntrada = "";

        do {
            usrEntrada = teclado.nextLine();

                for (int i = 0; i <= (usrEntrada.length() - 1); i++) {
                    char caracter = usrEntrada.charAt(i);

                    if (caracter >= 65 && caracter < 90) {
                        ++caracter;
                        acumulador += caracter;
                    } else if (caracter == 90) { // Z
                        caracter = 65; // A
                        acumulador += caracter;
                    }
                    System.out.println("");
                }
                System.out.println(acumulador);

        } while (!usrEntrada.equals("FIN"));

    }

}
