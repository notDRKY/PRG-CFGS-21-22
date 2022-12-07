/*
 * 21. Mostrar información de ficheros
 * Implementa un programa que pida al usuario introducir por teclado una ruta del sistema
 * de archivos (por ejemplo, C:/Windows o Documentos ) y muestre información sobre dicha ruta (ver
 * función más abajo). El proceso se repetirá una y otra vez hasta que el usuario introduzca una ruta
 * vacía (tecla intro). Deberá manejar las posibles excepciones.
 *
 * Necesitarás crear la función void muestraInfoRuta(File ruta) que dada una ruta de tipo
 * File haga lo siguiente:
 *
 *      Si es un archivo, mostrará por pantalla el nombre del archivo.
 *
 *      Si es un directorio, mostrará por pantalla la lista de directorios y archivos que contiene
 *      (sus nombres). Deberá mostrar primero los directorios y luego los archivos.
 *
 *      En cualquier caso, añade delante del nombre la etiqueta [*] o [A] para indicar si es un
 *      directorio o un archivo respectivamente.
 *
 *      Si el path no existe lanzará un FileNotFoundException .
 */
package mostrarinfoficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MostrarInfoFicheros {

    public static void muestraInfoRuta(File ruta) throws FileNotFoundException {
        // Comprobamos que existe
        if (ruta.exists()) {
            // Es una carpeta?
            if (ruta.isDirectory()) {
                StringBuilder directoriosL = new StringBuilder();
                StringBuilder ficherosL = new StringBuilder();
                System.out.println("---- Contenido de la carpeta ----");

                // Guardamos el contenido de la carpeta
                File[] contenido = ruta.listFiles();
                for (File archivo : contenido) {
                    if (archivo.isDirectory()) {
                        directoriosL.append("[*]").append(archivo.getName()).append("\n");
                    } else {
                        ficherosL.append("[A]").append(archivo.getName()).append("\n");
                    }
                }
                System.out.println("---- DIRECTORIOS ----");
                System.out.println(directoriosL);
                System.out.println("---- FICHEROS ----");
                System.out.println(ficherosL);
            } else {
                // Es un archivo
                System.out.println("[A]" + ruta.getName());
            }
        } else {
            throw new FileNotFoundException();
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        File ruta;
        String rutaTexto;

        do {
            System.out.print("Introduce por teclado una ruta del sistema de archivos: ");
            rutaTexto = teclado.nextLine();
        } while (rutaTexto.isBlank());

        ruta = new File(rutaTexto);
        
        try {
            muestraInfoRuta(ruta);
        } catch (FileNotFoundException ex) {
            System.out.println("Directorio no encontrado.");
        }
    }
}
