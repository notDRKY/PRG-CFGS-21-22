/*
 * Entrada
 *      El programa deber´a leer, de la entrada est´andar, un primer n´umero indicando cu´antos casos de prueba
 *      vendr´an a continuaci´on.
 *      Cada caso de prueba consiste en una l´ınea compuesta de una secuencia de “O” (vocal o may´uscula)
 *      y “.” indicando, respectivamente, una nota correcta o un fallo. Todos los casos tienen al menos un
 *      car´acter y ninguno tiene m´as de 10.000.
 * Salida
 *      Por cada caso de prueba se indicar´a la puntuaci´on que se debe dar al jugador teniendo en cuenta la
 *      valoraci´on de los combos, donde la primera nota de una serie consecutiva de aciertos se valora con 10
 *      puntos y las siguientes notas de la serie proporcionan 10 puntos m´as que la anterior.
 *
 * Entrada de ejemplo
 * 4
 * O.O.
 * OO...
 * OO.OO..
 * .OOOO...
 * Salida de ejemplo
 * 20
 * 30
 * 60
 * 100
 */
package bundurriahero;

import java.util.Scanner;

public class BundurriaHero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int repeticiones = teclado.nextInt();
        teclado.nextLine();
        // LECTURA STRING
        for (int i = 0; i < repeticiones; i++) {
            int puntuacion = 0;
            int bonus = 0;
            int resultado = 0;
            cadena = teclado.nextLine();
            // LECTURA CARACTER
            for (int j = 0; j < cadena.length(); j++) {
                if (cadena.charAt(j) == 'O') {
                    puntuacion += 10;
                    if (bonus > 0) {
                        puntuacion = puntuacion + (bonus * 10);
                    }
                    ++bonus;
                } else {
                    bonus = 0;
                }
            }
            resultado = puntuacion;
            System.out.println(resultado);
        }
    }
}