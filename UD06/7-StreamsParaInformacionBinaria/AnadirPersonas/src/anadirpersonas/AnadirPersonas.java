/*
 * 15. (AñadirPersonas) Modifica el programa anterior para que el usuario, al comienzo del
 * programa, pueda elegir si quiere añadir datos al fichero o sobre escribir la información
 * que contiene.
 */
package anadirpersonas;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AnadirPersonas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // ESCRITURA
        String usrNombre;
        String respuesta;
        boolean blanco = false;
        boolean opcion;
        int usrEdad;
        double usrPeso;
        double usrEstatura;
        
        System.out.print("Quieres sobrescribir los datos del fichero? (S/N): ");
        respuesta = teclado.nextLine();
        if (respuesta.charAt(0) == 'S') {
            opcion = false;
        } else {
            opcion = true;
        }
        
        try (DataOutputStream fs = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("src/personas.dat", opcion)));) {
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