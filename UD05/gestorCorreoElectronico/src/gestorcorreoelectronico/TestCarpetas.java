/*
 * 4. Con la clase TestCarpetas probaremos las clases y métodos desarrollados:
 *     Crea dos carpetas de correo de nombre Mensajes recibidos y Mensajes
 *     eliminados respectivamente.
 * 
 *     Crea varios mensajes y añádelos a Mensajes recibidos .
 *     Mueve el mensaje de código 1 desde la Mensajes recibidos a Mensajes
 *     elimiminados.
 * 
 *     Muestra el contenido de las carpetas antes y después de cada operación
 *     (añadir, mover,...)
 */
package gestorcorreoelectronico;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCarpetas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Carpeta carpetaRecibidos = new Carpeta("Mensajes recibidos");
        Carpeta carpetaEliminados = new Carpeta("Mensajes eliminados");

        Mensaje mensaje1 = new Mensaje("francesctapia@iesmre.com", "eljefe777@.com", "PRUEBA 1", "Esto es el texto de la prueba 1.");
        Mensaje mensaje2 = new Mensaje("eljefe777@.com", "francesctapia@iesmre.com", "PRUEBA 2", "Esto es el texto de la prueba 2.");
        Mensaje mensaje3 = new Mensaje("eljefe777@.com", "pacosanz.@gmail.com", "PRUEBA 3", "Esto es el texto de la prueba 3.");
        Mensaje mensaje4 = new Mensaje("pacosanz.@gmail.com", "eljefe777@.com", "PRUEBA 4", "Esto es el texto de la prueba 4.");

        System.out.println("_____ EMPIEZA LA PRUEBA _____");
        System.out.println(carpetaRecibidos.toString());
        System.out.println(carpetaEliminados.toString());
        System.out.println("___________________________");
        carpetaRecibidos.añadir(mensaje1);
        carpetaRecibidos.añadir(mensaje2);
        carpetaRecibidos.añadir(mensaje3);
        carpetaRecibidos.añadir(mensaje4);
        System.out.println("___________________________");
        System.out.println(carpetaRecibidos.toString());
        System.out.println(carpetaEliminados.toString());
        System.out.println("___________________________");
        try {
            Carpeta.moverMensaje(carpetaRecibidos, carpetaEliminados, 1);
        } catch (Carpeta.ElementoNoEncontradoException e) {
            System.out.println("¡ERROR, NO SE HA ENCONTRADO EL MENSAJE EN LA CARPETA ORIGEN!");
        }
        System.out.println("___________________________");
        System.out.println(carpetaRecibidos.toString());
        System.out.println(carpetaEliminados.toString());
        System.out.println("___________________________");
    }
}
