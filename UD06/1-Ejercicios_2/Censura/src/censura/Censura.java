/*
 * 3. ( Censura ) Escribir un programa que sustituya por otras, ciertas palabras de un fichero
 * de texto. Para ello, se desarrollará y llamará al método void aplicaCensura(String
 * entrada, String censura, String salida), que lee de un fichero de entrada y mediante
 * un fichero de censura, crea el correspondiente fichero modificado. Por ejemplo:
 *
 * Fichero de entrada:
 * En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho
 * tiempo que vivía un hidalgo de los de lanza en astillero.
 *
 * Fichero de censura:
 * lugar sitio
 * quiero debo
 * hidalgo noble
 *
 * Fichero de salida:
 * En un sitio de la Mancha, de cuyo nombre no debo acordarme, no ha mucho
 * tiempo que vivía un noble de los de lanza en astillero.
 */
package censura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Censura {

    public static void aplicarCensura(String entrada, String censura, String salida) {
        HashMap<String, String> clavesCensura = new HashMap<>();
        try (BufferedReader fe = new BufferedReader(new FileReader(censura));) {
            String linea;
            String[] palabras;
            while ((linea = fe.readLine()) != null) {
                palabras = linea.split(" ");
                clavesCensura.put(palabras[0], palabras[1]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Problema al abrir el fichero.");
        } catch (IOException ex) {
            System.out.println("Problema al leer.");
        }

        try (BufferedReader fe1 = new BufferedReader(new FileReader(entrada));
                BufferedWriter fs1 = new BufferedWriter(new FileWriter(salida))) {

            StringBuilder cadena = new StringBuilder();
            String linea2;
            String[] palabras2;
            while ((linea2 = fe1.readLine()) != null) {
                palabras2 = linea2.split(" ");
                for (int i = 0; i < palabras2.length; i++) {
                    if (clavesCensura.containsKey(palabras2[i])) {
                        cadena.append(clavesCensura.get(palabras2[i])).append(" ");
                    } else {
                        cadena.append(palabras2[i]).append(" ");
                    }
                }
            }
            fs1.write(cadena.toString());

        } catch (FileNotFoundException ex) {
            System.out.println("Problema al abrir el fichero.");
        } catch (IOException ex) {
            System.out.println("Problema al leer.");
        }
    }

    public static void main(String[] args) {
        aplicarCensura("src/entrada.txt", "src/censura.txt", "src/salida.txt");
    }
}
