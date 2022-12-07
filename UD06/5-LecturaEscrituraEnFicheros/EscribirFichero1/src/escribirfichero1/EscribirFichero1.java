/*
 * 9. (EscribirFichero1) Escribe un programa que, usando las clases FileOutputStream y
 * FileInputStream ,
 *          escriba los caracteres de tu nombre en un fichero ( nombre.txt ).
 *          lea el fichero creado y lo muestre por pantalla.
 *          Si abrimos el fichero creado con un editor de textos, ¿su contenido es legible?
 */
package escribirfichero1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirFichero1 {

    public static void main(String[] args) throws IOException {
        // ESCRITURA
        try (DataOutputStream fs = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("src/fichero_escribirFichero.txt")));) {
            // Escribimos en el archivo.
            fs.writeUTF("Francesc Tàpia Martorell");
        } catch (FileNotFoundException e) {
            System.out.println("Probrema al abrir el fichero");
        } catch (IOException e) {
            System.out.println("Problema al leer o escribir");
        }
        
        // LECTURA
        try (DataInputStream fe = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("src/fichero_escribirFichero.txt")));) {
            // Leemos el archivo:
            while (true) {
                System.out.println(fe.readUTF());
            }
        } catch (EOFException e) {
            // Se lanzará cuando se llegue al final del fichero
        } catch (FileNotFoundException e) {
            System.out.println("Probrema al abrir el fichero");
        } catch (IOException e) {
            System.out.println("Problema al leer o escribir");
        }
    }
}
