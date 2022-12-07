/*
 * 1. (Estaturas) Escribir un programa que lea de teclado la estatura de 10 personas y las
 * almacene en un array. Al finalizar la introducción de datos, se mostrarán al usuario los datos
 * introducidos con el siguiente formato:
 * 1 | Persona 1: 1.85 m.
 * 2 | Persona 2: 1.53 m.
 * 3 | ...
 * 4 | Persona 10: 1.23 m.
 */
package estaturas;

import java.util.Scanner;

public class Estaturas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] almacenEst = new double[10];

        for (int i = 0; i <= 9; i++) {
            System.out.print("Estatura de la persona " + (i + 1) + ": ");
            almacenEst[i] = teclado.nextDouble();
        }

        for (int i = 0; i <= 9; i++) {
            System.out.printf("\nPersona " + (i + 1) + ": %.02f m", almacenEst[i]);
        }
    }
}