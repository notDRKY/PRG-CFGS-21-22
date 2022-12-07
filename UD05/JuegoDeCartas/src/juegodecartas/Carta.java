/*
 * Se está desarrollando una aplicación que usa una baraja de cartas. Para ello, se
 * implementarán en Java las clases necesarias.
 * 
 * 1. Una de ellas es la clase Carta que permite representar una carta de la baraja española.
 * La información requerida para identificar una Carta es:
 * 
 *     su palo (oros, copas, espadas o bastos) y
 *     su valor (un entero entre 1 y 12).
 * 
 * Para dicha clase, se pide:
 *     Definir 4 constantes, atributos de clase (estáticos) públicos enteros, para
 *     representar cada uno de los palos de la baraja ( OROS será el valor 0, COPAS el 1,
 *     ESPADAS el 2 y BASTOS el 3).
 * 
 *     Definir los atributos (privados): palo y valor .
 * 
 *     Escribir dos constructores: uno para construir una carta de forma aleatoria (sin
 *     parámetros) y otro para construir una carta de acuerdo a dos datos: su palo y
 *     su valor (si los datos son incorrectos se lanzará IllegalArgumentException )
 * 
 *     Escribir los métodos consultores y modificadores de los valores de los
 *     atributos.
 * 
 *     Escribir un método compareTo para comprobar si la carta actual es menor que
 *     otra carta dada. El criterio de ordenación es por palos (el menor es oros,
 *     después copas, a continuación espadas y, finalmente, bastos) y dentro de cada
 *     palo por valor (1, 2, ..., 12).
 * 
 *     Escribir un método equals para comprobar la igualdad de dos cartas. Dos
 *     cartas son iguales si tienen el mismo palo y valor.
 * 
 *     Escribir un método sigPalo para devolver una nueva carta con el mismo valor
 *     que el de la carta actual pero del palo siguiente, según la ordenación anterior y
 *     sabiendo que el siguiente al palo bastos es oros.
 * 
 *     Escribir un método toString para transformar en String la carta actual, con el
 *     siguiente formato: "valor de palo"; por ejemplo, "4 de oros" o "1 de bastos"
 *     (sobrescritura del método toString de Object ).
 */
package juegodecartas;

class Carta {

    public static final int OROS = 0;
    public static final int COPAS = 1;
    public static final int ESPADAS = 2;
    public static final int BASTOS = 3;

    private int palo;
    private int valor;

    Carta() { // Constructor aleatorio
        this.palo = (int) (Math.random() * 4);  // Del 0 al 3
        this.valor = (int) ((Math.random() * 12) + 1); // Del 1 al 12
    }

    Carta(int palo, int valor) throws IllegalArgumentException { // Constructor normal
        if ((palo < 0) || (palo >= 4) || (valor <= 0) || (valor > 12)) {
            throw new IllegalArgumentException();
        } else {
            this.palo = palo;
            this.valor = valor;
        }
    }
    
    /*
     * Escribir un método compareTo para comprobar si la carta actual es menor que
     * otra carta dada. El criterio de ordenación es por palos (el menor es oros,
     * después copas, a continuación espadas y, finalmente, bastos) y dentro de cada
     * palo por valor (1, 2, ..., 12).
     * OROS     = 0;
     * COPAS    = 1;
     * ESPADAS  = 2;
     * BASTOS   = 3;
     * 
     * Para que se cumpla la condición del compareTo, debemos comparar primero nuestro
     * objeto (this) con el objeto que nos pasan por parámetro.
     */
    
    public int compareTo(Object otraCarta) {
        final Carta c = (Carta) otraCarta; // Convertimos el objeto genérico otraCarta en un objeto de tipo Carta
        if (this.getPalo() == c.getPalo()) { // Si los palos son iguales, se compararán los valores.
            return (this.getValor() - c.getValor()); 
        } else {
            return (this.getPalo() - c.getPalo());
        }
    }
    
    /*
     * Escribir un método equals para comprobar la igualdad de dos cartas. Dos
     * cartas son iguales si tienen el mismo palo y valor.
     */
    
    @Override // Equals de Netbeans (mejorable)
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
        final Carta other = (Carta) obj;
        if (this.palo != other.palo) {
            return false;
        }
        if (this.valor != other.valor) {
            return false;
        }
        return true;
    }
    
    /*
     * Escribir un método sigPalo para devolver una nueva carta con el mismo valor
     * que el de la carta actual pero del palo siguiente, según la ordenación anterior y
     * sabiendo que el siguiente al palo bastos es oros.
     * OROS     = 0;
     * COPAS    = 1;
     * ESPADAS  = 2;
     * BASTOS   = 3;
     */
    
    public Carta sigPalo(Carta c) {
        int palo = c.getPalo();
        if (palo == 3) {
            palo = 0;
        } else {
            palo++;
        }
        return new Carta(palo, this.getValor());
        // return new Carta(this.palo + 1) % 4, this.valor)
    }
    
    /*
     * Escribir un método toString para transformar en String la carta actual, con el
     * siguiente formato: "valor de palo"; por ejemplo, "4 de oros" o "1 de bastos"
     * (sobrescritura del método toString de Object ).
     * OROS     = 0;
     * COPAS    = 1;
     * ESPADAS  = 2;
     * BASTOS   = 3;
     */

    @Override
    public String toString() {
        String cadena = "";
        switch (this.getPalo()) {
            case 0:
                cadena = this.getValor() + " de oros";
                break;
            case 1: 
                cadena = this.getValor() + " de copas";
                break;
            case 2:
                cadena = this.getValor() + " de espadas";
                break;
            case 3:
                cadena = this.getValor() + " de bastos";
                break;
            default:
                cadena = "HA HABIDO UN ERROR";
                break;
        }
        return cadena;
    }
    
    // GETTERS
    public int getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }
    
    // SETTERS
    public void setPalo(int palo) {
        this.palo = palo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
