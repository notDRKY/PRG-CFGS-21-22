/*
    ENTRADA
    La entrada comienza con un número indicando cuántos casos de prueba deberán ser procesados.

    Cada caso de prueba está compuesto por tres números, 0 ≤ a,b ≤ n ≤ 1000 indicando 
    cuántas cucharadas dice Mafalda que se ha tomado como mínimo, cuántas cucharadas 
    dice el padre que se ha tomado como máximo, y cuántas cucharadas había puesto 
    realmente en el plato la madre. Se garantiza que en el plato siempre hay al 
    menos una cucharada.

    SALIDA
    Para cada caso de prueba, se escribirá el número de respuestas correctas 
    que tiene la pregunta "¿Cuántas cucharadas ha comido Mafalda?" que cumplan las 
    afirmaciones de la niña y de su padre.
 */
package cucharadasdesopa;

import java.util.Scanner;

public class CucharadasDeSopa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int repeticiones = 0;
        int cucharadasMinimas = 0;
        int cucharadasMaximas = 0;
        int totalCucharadas = 0;

        repeticiones = teclado.nextInt();

        for (int i = 1; i <= repeticiones; i++) {
            cucharadasMinimas = teclado.nextInt();
            cucharadasMaximas = teclado.nextInt();
            totalCucharadas = teclado.nextInt();

            int contador = 0;

            for (int j = cucharadasMaximas; j >= 0; j--) {
                if ((cucharadasMinimas + cucharadasMaximas) == totalCucharadas) {
                    ++contador;
                }
                ++cucharadasMinimas;
                --cucharadasMaximas;
            }
            System.out.println(contador);
        }
    }
}
