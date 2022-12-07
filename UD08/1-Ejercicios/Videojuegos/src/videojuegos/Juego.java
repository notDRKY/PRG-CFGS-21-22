/*
 *      1. Diseñar la clase Juego siguiendo las siguientes especificaciones:
 *
 *          Atributos protected: titulo (String), fabricante (String), año (int).
 *
 *          Constructor public Juego(String t, String f, int a)
 *
 *          Consultores de todos los atributos
 *
 *          public String toString() , que devuelve un String con los datos del
 *          Juego
 *
 *          public boolean equals(Object o) : Dos juegos son iguales si tienen el
 *          mismo título, fabricante y año.
 *
 *          public int compareTo(Object o) : Un juego es menor que otro si su
 *          título es menor. A igual título, si su fabricante es menor. A igual título
 *          y fabricante, si su año es menor.
 */
package videojuegos;

import java.util.Objects;

public abstract class Juego {

    protected String titulo;
    protected String fabricante;
    protected int ano;
    protected int copiasDisponibles;

    public Juego(String titulo, String fabricante, int ano, int copiasDisponibles) {
        this.titulo = titulo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.copiasDisponibles = copiasDisponibles;
    }

    /*
     * public int compareTo(Object o) : Un juego es menor que otro si su
     * título es menor. A igual título, si su fabricante es menor. A igual
     * título y fabricante, si su año es menor.
     */
 public int compareTo(Object o) {
        final Juego other = (Juego) o;
        //Si los títulos son iguales
        if (this.getTitulo().equals(other.getTitulo())) {
            //Y si los fabricantes son iguales
            if (this.getFabricante().equals(other.getFabricante())) {
                //A igual título y fabricante, el menor será el de menor año 
                return (this.getAno() - other.getAno());
            }
            //si los fabricantes no son iguales, devolvemos directamente la diferencia
            return this.getFabricante().compareTo(other.getFabricante());
            //Sino son iguales (los titulos), devolvemos la diferencia
        } else {
            return this.getTitulo().compareTo(other.getTitulo());
        }
    }
    
    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nFabricante: " + fabricante + "\nAño: " + ano + "\nCopias disponibles: " + copiasDisponibles;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Juego other = (Juego) obj;
        if (this.ano != other.ano) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return (!Objects.equals(this.fabricante, other.fabricante));
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAno() {
        return ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
