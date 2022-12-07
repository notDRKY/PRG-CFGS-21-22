/*
 * 18. (GuardaLibros)
 *          (Autor) Crea la clase autor, con los atributos nombre, año de nacimiento y
 *          nacionalidad. Incorpora un constructor que reciba todos los datos y el método
 *          toString().
 *
 *          (Libro) Crea la clase Libro, con los atributos titulo, año de edición y autor
 *          (Objeto de la clase autor). Incorpora un constructor que reciba todos los datos
 *          y el método toString().
 *
 *          Escribe un programa (GuardaLibros) que cree tres libros y los almacene en el
 *          fichero biblioteca.obj.
 *
 *          Las clases deberán implementar el interfaz Serializable.
 */
package guardaLibros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GuardaLibros {

    public static void main(String[] args) {
        Libro libro1 = new Libro("El castillo de Barbaazul", 2022, new Autor("Javier Cercas", 1962, "Española"));
        Libro libro2 = new Libro("Operación Kazán", 2022, new Autor("Vicente Vallés", 1963, "Española"));
        Libro libro3 = new Libro("Por si las voces vuelven", 2022, new Autor("Ángel Martín", 1977, "Española"));

        try (ObjectOutputStream salida = new ObjectOutputStream(
                        new FileOutputStream("src/biblioteca.obj"));) {
            salida.writeObject(libro1);
            salida.writeObject(libro2);
            salida.writeObject(libro3);
        } catch (IOException e){
            System.out.println("Algún problema guardando en el disco.");
        }
    }
}
