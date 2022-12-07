/*
 * Los "amigos"
 * L'esmorzaret es el evento social por excelencia en Balensia, basta levantarse
 * para ir al baño para ir encontrando por el camino a amigos, compañeros o
 * simplemente conocidos. A algunos solo les levantas las cejas y con otros
 * intercambias unas palabras. Adjunto en un fichero se digitaliza el mapa del
 * bar con la siguiente leyenda: X-> tu lugar de partida, # -> un amigo, 0 -> zona
 * libre del bar.
 * Tus movimientos comienzan en la posición donde está la X, y siempre te mueves
 * del mismo modo (3 posiciones a la derecha, y una abajo). La magia de l'Esmorzaret
 * hace que si llegas a la pared lateral del Bar, la atraviesas apareciendo al
 * lado contrario (a la misma altura) para continuar con tu movimiento.
 * El baño se encuentra en la parte inferior del mapa (cuando ya no quedan lineas).
 * ¿Con cuantos amigos te paras a charlar para ir al baño?
 *
 * EJEMPLO:
 * X#000000
 * 0#0#000#
 * 00#00000
 * 0##0000#
 * 00#0#00#
 *
 * SOLUCIÓN:
 * 3
 */
package losamigos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LosAmigos {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner teclado = new Scanner(new File("src/ingredientes.txt"));
        int posInicial = 0;
        String linea;
        int amigos = 0;
        while (teclado.hasNext()) {
            linea = teclado.nextLine();

        }

    }
}