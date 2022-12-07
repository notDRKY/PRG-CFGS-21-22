/*
 * (Libro) Crea la clase Libro, con los atributos titulo, año de edición y autor
 * (Objeto de la clase autor). Incorpora un constructor que reciba todos los datos
 * y el método toString() .
 */
package guardaLibros;

import java.io.Serializable;

public class Libro implements Serializable{
    private String titulo;
    private int anoEdicion;
    private Autor autor;

    public Libro(String titulo, int anoEdicion, Autor autor) {
        this.titulo = titulo;
        this.anoEdicion = anoEdicion;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + "\nAño de edición" + anoEdicion + "\n Autor: " + autor + "\n";
    }
}
