/*
 * JuegoEnVenta
 *      Constructor que recibe todos sus datos
 * 
 *      tiene un método vender , que decrementa el número de
 *      copias disponibles.
 * 
 *      toString() devuelve todos los datos del JuegoEnVenta
 */
package videojuegos;

public class JuegoEnVenta extends Juego {

    public JuegoEnVenta(String titulo, String fabricante, int ano, int copiasDisponibles) {
        super(titulo, fabricante, ano, copiasDisponibles);
    }

    @Override
    public String toString() {
        return "[JUEGO EN ALQUILER]\n" + super.toString();
    }
    
    public void vender() {
        this.copiasDisponibles--;
    }
}
