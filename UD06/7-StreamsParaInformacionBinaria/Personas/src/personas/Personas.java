/*
 * 14. (Personas) Escribe un programa que, utilizando entre otras la clase DataOutputStream ,
 * almacene en un fichero llamado personas.dat la información relativa a una serie de
 * personas que va introduciendo el usuario desde teclado:
 *
 *      Nombre (String)
 *      Edad (entero)
 *      Peso (double)
 *      Estatura (double)
 *
 * La entrada del usuario terminará cuando se introduzca un nombre vacío.
 *
 * Nota: Utiliza la clase Scanner para leer desde teclado y los métodos writeDouble ,
 * writeInt y writeUTF de la clase DataInputStream para escribir en el fichero)
 *
 * Al finalizar el programa, abre el fichero resultante con un editor de texto (notepad o
 * wordpad) ¿La información que contiene es legible?.
 *               - No es legible la totalidad de la información.
 */
package personas;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Personas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // ESCRITURA
        String usrNombre;
        boolean blanco = false;
        int usrEdad;
        double usrPeso;
        double usrEstatura;

        try (DataOutputStream fs = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("src/personas.dat")));) {
            // Escribimos en el archivo.
            do {
                System.out.print("Nombre: ");
                usrNombre = teclado.nextLine();
                if (usrNombre.isBlank()) {
                    blanco = true;
                } else {
                    System.out.print("Edad: ");
                    usrEdad = teclado.nextInt();
                    System.out.print("Peso: ");
                    usrPeso = teclado.nextDouble();
                    System.out.print("Estatura: ");
                    usrEstatura = teclado.nextDouble();
                    
                    
                    fs.writeUTF(usrNombre);
                    fs.writeInt(usrEdad);
                    fs.writeDouble(usrPeso);
                    fs.writeDouble(usrEstatura);
                    
                    teclado.nextLine();
                }

            } while (!blanco);

        } catch (FileNotFoundException e) {
            System.out.println("Probrema al abrir el fichero");
        } catch (IOException e) {
            System.out.println("Problema al leer o escribir");
        }
    }

}
