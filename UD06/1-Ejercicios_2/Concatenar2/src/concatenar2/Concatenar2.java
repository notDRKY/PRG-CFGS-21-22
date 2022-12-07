/*
 * 5. ( Concatenar2 ) Escribe un programa que dados dos ficheros de texto f1 y f2 , añada al
 * final de f1 el contenido de f2 . Es decir, como el ejercicio anterior, pero sin producir un
 * nuevo fichero.
 */
package concatenar2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Concatenar2 {

    public static void crearFichero(String fichero1, String fichero2) {
        try (BufferedReader fe = new BufferedReader(new FileReader(fichero1));
                BufferedReader fe2 = new BufferedReader(new FileReader(fichero2));
                BufferedWriter fw = new BufferedWriter(new FileWriter(fichero1))) {

            String linea;
            String linea2;
            StringBuilder texto1 = new StringBuilder();
            StringBuilder texto2 = new StringBuilder();

            while ((linea = fe.readLine()) != null) {
                texto1.append(linea).append("\n");
            }
            while ((linea2 = fe2.readLine()) != null) {
                texto2.append(linea2).append("\n");
            }

            fw.write(texto1.toString());
            fw.write(texto2.toString());
        } catch (FileNotFoundException ex) {
            System.out.println("!ERROR Problema al abrir el fichero!");
        } catch (IOException ex) {
            System.out.println("!ERROR Problema al leer el fichero!");
        }
    }

    public static void main(String[] args) {
        crearFichero("src/f1.txt", "src/f2.txt");
    }

}
