/*
 * 10. (EscribirFichero2) Repetir el ejercicio anterior utilizando las clases FileReader y
 * FileWriter .
 */
package escribirfichero2;

import java.io.*;

public class EscribirFichero2 {

    public static void main(String[] args) {
        FileWriter fichero = null;
        // Creación y escritura del archivo secuencial de texto
        try {
            // Creamos el archivo.
            fichero = new FileWriter("src/fichero_escribirFichero_2.txt");
            // Ecribimos en el archivo.
            fichero.write("Francesc Tàpia Martorell");

        } catch (IOException e) {
            System.out.println("Problema al abrir o escribir");
        } finally { // Para cerrar el archivo.
            if (fichero != null) {
                try {
                    fichero.close();
                } catch (IOException e) {
                    System.out.println("Problema al cerrar el fichero");
                }
            }
        }
        FileReader lecturaFichero;
        try {
            lecturaFichero = new FileReader("src/fichero_escribirFichero_2.txt");
            int caracter;
            while ((caracter = lecturaFichero.read()) != -1) {
                char letra = (char) caracter;
                System.out.print(letra);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Probrema al abrir el fichero");
        } catch (IOException e) {
            System.out.println("Problema al leer");
        }

    }

}
