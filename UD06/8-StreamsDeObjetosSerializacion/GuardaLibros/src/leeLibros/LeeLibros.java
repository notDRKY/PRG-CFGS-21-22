/*
 * 19. (LeeLibros) Escribe una programa que lea los objetos del fichero biblioteca.obj y los
 * muestre por pantalla.
 */
package leeLibros;

import java.io.IOException;
import java.io.ObjectInputStream;
import guardaLibros.Libro;
import java.io.FileInputStream;

public class LeeLibros {

    public static void main(String[] args) throws ClassNotFoundException {
        Libro l1, l2, l3;

        try (ObjectInputStream entrada = new ObjectInputStream(
                new FileInputStream("src/biblioteca.obj"));) {
            l1 = (Libro) entrada.readObject();
            System.out.println(l1.toString());
            
            l2 = (Libro) entrada.readObject();
            System.out.println(l2.toString());
            
            l3 = (Libro) entrada.readObject();
            System.out.println(l3.toString());
        } catch (IOException e) {
            System.out.println("Algún problema guardando en el disco.");
        } catch (ClassNotFoundException e) {
            System.out.println("Algun problema con las clases definidas.");
        }
    }
}