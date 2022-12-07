/*
 * El pan
 * Uno de los principales ingredientes del Bocata es el pan.
 * Debido a una serie de acontecimientos recientes los cereales
 * (principal componente del pan) ha visto incrementado de una manera desmesurada.
 * Disponemos de un archivo (en el enlace) en el que se han ido registrando
 * diariamente el precio en euros de una tonelada de harina, por ejemplo:
 *
 * 100
 * 104
 * 102
 * 150
 * 160
 * 145
 *
 * SOLUCIÓN: 3
 */
package elpan;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ElPan {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner teclado = new Scanner(new File("src/harina.txt"));
        int contador = 0;
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        
        if (num1 < num2) {
            contador++;
        }
        
        while (teclado.hasNext()) {
            num1 = num2;
            num2 = teclado.nextInt();

            if (num1 < num2) {
                ++contador;
            }
        }
        
        System.out.println(contador);

    }
}
