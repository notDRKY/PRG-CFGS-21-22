/*
 * 2. (package Biblioteca) Se quiere hacer una aplicación en la que los usuarios van a hacer
 * búsquedas de libros para saber si se encuentran en los fondos de la biblioteca. El
 * funcionamiento básico sería algo así: Al iniciarse la aplicación todo el catálogo de libros
 * se cargaría en memoria y a partir de ese momento los usuarios pueden realizar
 * búsquedas por título, que interesa que sean lo más rápidas posibles. Nunca se insertan
 * nuevos libros durante la ejecución de la aplicación.
 * 
 *      Diseña la clase Libro con los métodos que consideres oportunos y los
 *      siguientes atributos:
 * 
 *          Titulo (String): Es el dato que identifica al libro.
 * 
 *          Autor (String)
 * 
 *          Estantería (String): Estantería de la biblioteca en la que se encuentra
 *          el libro
 * 
 *      Diseña la clase CatalogoLibros como una colección de libros. Utiliza el tipo de
 *      colección que crees que más se ajusta a los requisitos de la aplicación
 *      justificando la elección. Implementa los siguients métodos:
 * 
 *          public CatalogoLibros(Libro v[]) : Constructor. Para simplificar,
 *          inicializa el catálogo y lo rellena con los libros del array v, en lugar de
 *          obtenerlos de un fichero.
 * 
 *          public String buscar(Libro l) : Dado un libro, lo busca en el
 *          Catálogo y devuelve la estantería en la que se encuentra el libro o null
 *          si el libro no está en el Catálogo.
 *
 */
package biblioteca;

public class Biblioteca {
    
    public static void main(String[] args) {
        
    }
}
