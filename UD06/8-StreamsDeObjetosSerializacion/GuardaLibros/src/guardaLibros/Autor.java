/*
 * (Autor) Crea la clase autor, con los atributos nombre, año de nacimiento y
 * nacionalidad. Incorpora un constructor que reciba todos los datos y el método
 * toString() .
 */
package guardaLibros;

import java.io.Serializable;

public class Autor implements Serializable{
    private String nombre;
    private int anoNacimiento;
    private String nacionalidad;

    public Autor(String nombre, int anoNacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.anoNacimiento = anoNacimiento;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor: " + nombre + "\nAño de nacimiento: " + anoNacimiento + "\nNacionalidad: " + nacionalidad + "\n";
    }
}
