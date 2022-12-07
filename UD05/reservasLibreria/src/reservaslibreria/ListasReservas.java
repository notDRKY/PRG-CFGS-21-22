/*
 * 3. Diseñar una clase ListaReservas que implemente una lista de reservas. Como máximo
 * puede haber 100 reservas en la lista. Se utilizará un array de Reservas que ocuparemos
 * a partir de la posición 0 y un atributo que indique el número de reservas. Las reservas
 * existentes ocuparán las primeras posiciones del array (sin espacios en blanco).
 * Implementar los siguientes métodos:
 * 
 *     public void reservar(String nif, String nombre, String telefono, int
 *     libro, int ejemplares) throws ListaLlenaException,
 * 
 *     ElementoDuplicadoException : Crea una reserva y la añade a la lista. Lanza
 * 
 *     ElementoDuplicadoException si la reserva ya estaba en la lista. Lanza
 * 
 *     ListaLlenaException si la lista de reservas está llena.
 *     public void cancelar(String nif, int libro) throws
 * 
 *     ElementoNoEncontradoException . Dado un nif de cliente y un código de libro,
 *     anular la reserva correspondiente. Lanzar ElementoNoEncontradoException si la
 *     reserva no existe.
 * 
 *     public String toString() : Devuelve un String con los datos de todas las
 *     reservas de la lista.
 * 
 *     public int numEjemplaresReservadosLibro(int codigo) : Devuelve el número de
 *     ejemplares que hay reservados en total de un libro determinado.
 * 
 *     public void reservasLibro(int codigo) : Dado un código de libro, muestra el
 *     nombre y el teléfono de todos los clientes que han reservado el libro.
 */
package reservaslibreria;

class ListasReservas {
    
}
