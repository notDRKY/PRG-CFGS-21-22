/*
 * 1. Implementación de la clase Vuelo, que permite representar un vuelo mediante los
 * atributos:
 *      identificador ( String )
 *      origen ( String )
 *      destino ( String )
 *      hSalida ( Time )
 *      hLlegada ( Time )
 *
 *      Además, cada vuelo dispone de 50 asientos, es decir, pueden viajar, como
 *      mucho, 50 pasajeros en cada vuelo. Para representarlos, se hará uso de
 *      asiento , un array de String (nombres de los pasajeros) junto con un atributo
 *      numP que indique el número actual de asientos reservados. Si el asiento i está
 *      reservado, asiento[i] contendrá el nombre del pasajero que lo ha reservado.
 *      Si no lo está, asiento[i] será null . En el array asiento , las posiciones
 *      impares pertenecen a asientos de ventanilla y las posiciones pares, a asientos
 *      de pasillo (la posición 0 no se utilizará).
 *
 * En esta clase, se deben implementar los siguientes métodos:
 *
 *      public Vuelo(String id, String orig, String dest, LocalTime hsal,
 *      LocalTime hlleg) . Constructor que crea un vuelo con identificador, ciudad de
 *      origen, ciudad de destino, hora de salida y hora de llegada indicados en los
 *      respectivos parámetros, y sin pasajeros.
 *
 *      public String getIdenificador() . Devuelve el identificador
 *
 *      public String getOrigen() . Devuelve origen .
 *
 *      public String getDestino() . Devuelve destino .
 *
 *      public boolean hayLibres() . Devuelve true si quedan asientos libres y false
 *      si no quedan.
 *
 *      public boolean equals(Object o) . Dos vuelos son iguales si tienen el mismo
 *      identificador.
 *
 *      public int reservarAsiento(String pas, char pref) throws
 *      VueloCompletoException . Si el vuelo ya está completo se lanza una excepción. Si
 *      no está completo, se reserva al pasajero pas el primer asiento libre en pref . El
 *      carácter pref será ' P ' o ' V ' en función de que el pasajero desee un asiento de
 *      pasillo o de ventanilla. En caso de que no quede ningún asiento libre en la
 *      preferencia indicada ( pref ), se reservará el primer asiento libre de la otra
 *      preferencia. El método devolverá el número de asiento que se le ha reservado.
 *      Este método hace uso del método privado asientoLibre , que se explica a
 *      continuación.
 *
 *      private int asientoLibre(char pref) . Dado un tipo de asiento pref (pasillo
 *      ' P ' o ventanilla ' V '), devuelve el primer asiento libre (el de menor numero) que
 *      encuentre de ese tipo. O devuelve 0 si no quedan asientos libres de tipo pref .
 *
 *      public void cancelarReserva(int numasiento) . Se cancela la reserva del
 *      asiento numasiento .
 *
 *      public String toString() . Devuelve una String con los datos del vuelo y los
 *      nombres de los pasajeros, con el siguiente formato:
 *
 *      1 | IB101 Valencia París 19:05:00 21:00:00
 *      2 | Pasajeros:
 *      3 | Asiento 1: Sonia Dominguez
 *      4 | …
 *      5 | Asiento 23: Fernando Romero
 */
package gestorvuelos;

import java.time.LocalTime;
import java.util.Objects;

class Vuelo {

    private static final int MAX_A = 50;
    private String identificador;
    private String origen;
    private String destino;
    private LocalTime hSalida;
    private LocalTime hLlegada;
    private String[] asiento;
    private int numP;

    /*
     * public Vuelo(String id, String orig, String dest, LocalTime hsal,
     * LocalTime hlleg) . Constructor que crea un vuelo con identificador,
     * ciudad de origen, ciudad de destino, hora de salida y hora de llegada
     * indicados en los respectivos parámetros, y sin pasajeros.
     */
    public Vuelo(String id, String orig, String dest, LocalTime hsal, LocalTime hlleg) {
        this.identificador = id;
        this.origen = orig;
        this.destino = dest;
        this.hSalida = hsal;
        this.hLlegada = hlleg;
        this.asiento = new String[MAX_A + 1]; // La posición 0 no se usa, entonces necesito 1 posición más.
        this.numP = 0;
    }

    /*
     * public String getIdenificador() . Devuelve el identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /*
     * public String getOrigen() . Devuelve origen.
     */
    public String getOrigen() {
        return origen;
    }

    /*
     * public String getDestino() . Devuelve destino .
     */
    public String getDestino() {
        return destino;
    }

    /*
     * Se requiere de un getter para numP.
     */
    public int getNumP() {
        return numP;
    }

    /*
     * public boolean hayLibres() . Devuelve true si quedan asientos libres y
     * false si no quedan.
     */
    public boolean hayLibres() {
        if (getNumP() < asiento.length) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * public boolean equals(Object o) . Dos vuelos son iguales si tienen el
     * mismo identificador.
     */
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
        final Vuelo other = (Vuelo) obj;

        return (!Objects.equals(this.identificador, other.identificador));
    }

    /*
     * public int reservarAsiento(String pas, char pref) throws
     * VueloCompletoException . Si el vuelo ya está completo se lanza una
     * excepción. Si no está completo, se reserva al pasajero pas el primer
     * asiento libre en pref . El carácter pref será ' P ' o ' V ' en función de
     * que el pasajero desee un asiento de pasillo o de ventanilla. En caso de
     * que no quede ningún asiento libre en la preferencia indicada ( pref ), se
     * reservará el primer asiento libre de la otra preferencia. El método
     * devolverá el número de asiento que se le ha reservado. Este método hace
     * uso del método privado asientoLibre , que se explica a continuación.
     */
    public int reservarAsiento(String pas, char pref) throws VueloCompletoException {
        if (hayLibres()) {
            int posLibre ;
            if ((posLibre = asientoLibre(pref)) == 0) {
                if (pref == 'P') {
                    pref = 'V';
                } else {
                    pref = 'P';
                }
                asiento[posLibre = asientoLibre(pref)] = pas;
            } else {
                asiento[posLibre] = pas;
            }
            numP++;
            return posLibre;
        } else {
            throw new VueloCompletoException();
        }
    }

    /*
     * private int asientoLibre(char pref) . Dado un tipo de asiento pref
     * (pasillo ' P ' o ventanilla ' V '), devuelve el primer asiento libre (el
     * de menor numero) que encuentre de ese tipo. O devuelve 0 si no quedan
     * asientos libres de tipo pref .
     *
     * En el array asiento , las posiciones impares pertenecen a asientos de
     * ventanilla y las posiciones pares, a asientos de pasillo (la posición 0
     * no se utilizará).
     *
     * SOLO CAMBIA POS, HAY QUE: DEPENDIENDO LA LETRA POS SERÁ 1 O SERÁ 2 EL
     * BUCLE ES EL MISMO
     */
    private int asientoLibre(char pref) {
        /*
         * asientoLibre() que en primera instancia inicializa la var pos a 0,
         * esto se hace porque puede haber un caso donde no hayan asientos.
         * Siguiendo con el método que contiene un if donde comprueba si el char
         * introducido es una 'P', si no se dará por hecho que será una V, y
         * según el caso, la variable pos tendrá un valor u otro, valor 2 para
         * recorrer los asientos pares, valor 1 para los impares. Entonces se
         * hace un for para recorrer el array asientos buscando nulos, en el
         * caso de que no se encuentren nulos, pos volverá a ser 0.
         */
        if (hayLibres()) {
            int pos;
            if (pref == 'P') {
                // P (pares)
                pos = 2;
            } else {
                // V (impares)
                pos = 1;
            }
            for (int i = pos; i < asiento.length; i += 2) {
                if (asiento[i] == null) {
                    return i;
                }
            }
        }
        return 0;
    }

    /*
     * public void cancelarReserva(int numasiento) . Se cancela la reserva del
     * asiento numasiento .
     */
    public void cancelarReserva(int numAsiento) throws NoExisteReservaException {
        if (asiento[numAsiento] != null) {
            asiento[numAsiento] = null;
        } else {
            throw new NoExisteReservaException();
        }
    }

    /*
     * public String toString() . Devuelve una String con los datos del vuelo
     * y los nombres de los pasajeros, con el siguiente formato:
     *
     * 1 | IB101 Valencia París 19:05:00 21:00:00
     * 2 | Pasajeros:
     * 3 | Asiento 1: Sonia Dominguez
     * 4 | …
     * 5 | Asiento 23: Fernando Romero
     */
    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();
        cadena.append(infoVuelo());
        //String cadena = identificador + origen + destino + hSalida + hLlegada;
        for (int pos = 1; pos < (MAX_A + 1); pos++) {
            if (asiento[pos] != null) {
                cadena.append("\n").append("Pasajero ").append(pos).append(": ").append(asiento[pos]);
            }
        }
        return cadena.toString();
    }
    
    public String infoVuelo() {
        return identificador + " " + origen + " " + destino + " " + hSalida + " " + hLlegada;
    }

    static class VueloCompletoException extends Exception {

        public VueloCompletoException() {
        }
    }

    static class NoExisteReservaException extends Exception {

        public NoExisteReservaException() {
        }
    }
}
