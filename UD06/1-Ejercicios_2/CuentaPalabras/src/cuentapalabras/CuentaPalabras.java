/*
 * 2. ( CuentaPalabras ) Escribe un programa que, sin utilizar la clase Scanner , muestre el
 * número de palabras que contiene un fichero de texto. El nombre del fichero se solicitará
 * al usuario al comienzo de la ejecución.
 *
 * Sugerencia: Lee el fichero, línea a línea y utiliza la clase StringTokenizer o bien el
 * método split de la clase String para averiguar el nº de palabras.
 */
//C:\Users\Soldi\Desktop\si.txt
package cuentapalabras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CuentaPalabras {

    public static int cuentaPalabras(String ruta) throws IOException {
        String linea;
        int contador = 0;
        try (FileReader fr = new FileReader(ruta);
                BufferedReader br = new BufferedReader(fr)) {
            while ((linea = br.readLine())!= null) {
                StringTokenizer palabras = new StringTokenizer(linea);
                contador += palabras.countTokens();
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String entrada;
        do {
            System.out.print("---CUENTA PALABRAS---\n"
                    + "Introduce la ruta del archivo: ");
            entrada = teclado.nextLine();

            if (!entrada.isBlank()) {
                try {
                    System.out.println("El archivo tiene: " + cuentaPalabras(entrada) + " palabras.");
                } catch (IOException ex) {
                    System.out.println("Se ha producido un ERROR en la lectura del fichero.");
                }
            }
        } while (entrada.isBlank());
    }

}
