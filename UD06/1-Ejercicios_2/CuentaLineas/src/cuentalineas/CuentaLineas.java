/*
 * 1. (CuentaLineas) Escribe un programa que, sin utilizar la clase Scanner , muestre el
 * número de lineas que contiene un fichero de texto. El nombre del fichero se solicitará al
 * usuario al comienzo de la ejecución.
 */
//C:\Users\Soldi\Desktop\si.txt
package cuentalineas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CuentaLineas {

    public static int cuentaLineas(String ruta) throws IOException {
        int contador = 0;
        try (FileReader fr = new FileReader(ruta);
                BufferedReader br = new BufferedReader(fr)) {
            //br.lines().count()
            while (br.readLine() != null) {
                ++contador;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String entrada = "";

        do {
            System.out.print("---CUENTA LÍNEAS---\n"
                    + "Introduce la ruta del archivo: ");
            entrada = teclado.nextLine();

            if (!entrada.isBlank()) {
                try {
                    System.out.println("El archivo tiene: " + cuentaLineas(entrada) + " lineas.");
                } catch (IOException ex) {
                    System.out.println("Se ha producido un ERROR en la lectura del fichero.");
                }
            }
        } while (entrada.isBlank());
    }
}
