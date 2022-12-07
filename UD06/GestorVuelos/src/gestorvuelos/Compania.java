/*
 * 3. Implementación de la clase Compania para representar todos los vuelos de una
 * compañía aérea. Una Compañía tiene un nombre nombre y puede ofrecer, como
 * mucho, 10 vuelos distintos. Para representarlos se utilizará listaVuelos , un array de
 * objetos Vuelo junto con un atributo numVuelos que indique el número de vuelos que la
 * compañía ofrece en un momento dado. Las operaciones de esta clase son:
 *
 *      public Compania(String n) throws FileNotFoundException . Constructor de una
 *      compañía de nombre n . Cuando se crea una compañía, se invoca al método
 *      privado leeVuelos() para cargar la información de vuelos desde un fichero. Si
 *      el fichero no existe, se propaga la excepción FileNotFoundException
 *
 *      private void leeVuelos() throws FileNotFoundException . Lee desde un fichero
 *      toda la información de los vuelos que ofrece la compañía y los va almacenando
 *      en el array de vuelos listaVuelos . El nombre del fichero coincide con el
 *      nombre de la compañía y tiene extensión .txt . La información de cada vuelo
 *      se estructura en el fichero como sigue:
 *
 *      1 | <Identificador>
 *      2 | <Origen>
 *      3 | <Destino>
 *      4 | <Hora de salida>
 *      5 | <Minuto de salida>
 *      6 | <Hora de llegada>
 *      7 | <Minuto de llegada>
 *      8 | ...
 *      9 | ...
 *
 *      Si el fichero no existe, se propaga la excepción FileNotFoundException .
 *
 *      public Vuelo buscarVuelo(String id) throws ElementoNoEncontradoException .
 *      Dado un identificador de vuelo id , busca dicho vuelo en el array de vuelos
 *      listaVuelos . Si lo encuentra, lo devuelve. Si no, lanza
 *      ElementoNoEncontradoException .
 *
 *      public void mostrarVuelosIncompletos(String o, String d) . Muestra por
 *      pantalla los vuelos con origen o y destino d , y que tengan asientos libres. Por
 *      ejemplo, vuelos con asientos libres de la compañía Iberia con origen Milán y
 *      destino Valencia:
 *
 *      1 | Iberia IB201 Milán Valencia 14:25:00 16:20:00
 *      2 | Iberia IB202 Mílán Valencia 21:40:00 23:35:00
 */
package gestorvuelos;

import java.io.FileNotFoundException;

class Compania {

    /*
     * 3. Implementación de la clase Compania para representar todos los
     * vuelos de una compañía aérea. Una Compañía tiene un nombre nombre y puede
     * ofrecer, como mucho, 10 vuelos distintos. Para representarlos se
     * utilizará listaVuelos , un array de objetos Vuelo junto con un atributo
     * numVuelos que indique el número de vuelos que la compañía ofrece en un
     * momento dado. Las operaciones de esta clase son:
     */
    private final int MAX_V = 10;
    private String nombre;
    private Vuelo[] listaVuelos;
    private int numVuelos;
    
    /*
     * public Compania(String n) throws FileNotFoundException . Constructor de
     * una compañía de nombre n . Cuando se crea una compañía, se invoca al
     * método privado leeVuelos() para cargar la información de vuelos desde un
     * fichero. Si el fichero no existe, se propaga la excepción
     * FileNotFoundException
     */
    public Compania(String n) throws FileNotFoundException {

    }

    /*
     * private void leeVuelos() throws FileNotFoundException . Lee desde un
     * fichero toda la información de los vuelos que ofrece la compañía y los va
     * almacenando en el array de vuelos listaVuelos . El nombre del fichero
     * coincide con el nombre de la compañía y tiene extensión .txt . La
     * información de cada vuelo se estructura en el fichero como sigue:
     *
     * 1 | <Identificador> 2 | <Origen> 3 | <Destino> 4 | <Hora de salida> 5 |
     * <Minuto de salida> 6 | <Hora de llegada> 7 | <Minuto de llegada> 8 | ...
     * 9 | ...
     *
     * Si el fichero no existe, se propaga la excepción FileNotFoundException .
     */
    private void leeVuelos() throws FileNotFoundException {
        // lee desde un fichero toda la información de los vuelos
        // los va almacenando en el array listaVuelos
        // el nombre del fichero coincide con el nombre de la compañia y ext .txt

    }

}
