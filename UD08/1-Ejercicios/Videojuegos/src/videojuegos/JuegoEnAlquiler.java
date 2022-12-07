/*
 * JuegoEnAlquiler
 *      tiene un atributo que indica el número de días que se
 *      alquila. (Por el precio indicado, hay juegos que se alquilan
 *      por un dia, otros por 2, etc...)
 *
 *      Constructor que recibe todos sus datos
 *      tiene un método alquilar que decrementa el número de
 *      copias disponibles.
 *
 *      tiene un método devolver que incrementa el número de
 *      copias disponibles.
 *
 *      toString() devuelve todos los datos del JuegoEnAlquiler
 */
package videojuegos;

public class JuegoEnAlquiler extends Juego {

    private int diasAlquiler;

    public JuegoEnAlquiler(int diasAlquiler, String titulo, String fabricante, int ano, int copiasDisponibles) {
        super(titulo, fabricante, ano, copiasDisponibles);
        this.diasAlquiler = diasAlquiler;
    }

    @Override
    public String toString() {
        return "[JUEGO EN ALQUILER]\n" + super.toString() + "\nDias alquiler: " + diasAlquiler;
    }

    public void alquilar() {
        this.copiasDisponibles--;
    }

    public void devolver() {
        this.copiasDisponibles++;
    }

}
