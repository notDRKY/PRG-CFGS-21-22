/*
1. La clase Corredor representa a un participante en la carrera. Sus atributos son el dorsal
(entero), el nombre (string) y el tiempo en segundos (double) que le ha costado
completar el recorrido. Los métodos con los que cuenta son:

public Corredor(int d, String n) . Constructor a partir del dorsal y el
nombre. Por defecto el tiempo tardado es 0.

public double getTiempo() . Devuelve el tiempo tardado por el corredor.

public int getDorsal() . Devuelve el dorsal del corredor.

public String getNombre() . Devuelve el nombre del corredor.

public void setTiempo(double t) throws IllegalArgumentException .
Establece el tiempo tardado por el corredor. Lanzará la excepción si el tiempo
indicado es negativo.

public void setTiempo(double t1, double t2) throws
IllegalArgumentException . Establece el tiempo tardado por el corredor.

t1 indica la hora de comienzo y t2 la hora de finalización (expresadas en
segundos). La diferencia en segundos entre los dos datos servirá para
establecer el tiempo tardado por el Corredor.
Lanzará la excepción si el tiempo resultante es negativo

public String toString() . Devuelve un String con los datos del corredor, de
la forma:

public boolean equals(Object o) . Devuelve true si los corredores tienen el
mismo dorsal y false en caso contrario

public int compareTo (Corredor o) . Un corredor es menor que otro si
tiene menor dorsal.

public static int generarDorsal() . Devuelve un número de dorsal
generado secuencialmente. Para ello la clase hará uso de un atributo static
int siguienteDorsal que incrementará cada vez que se genere un nuevo
dorsal.
 */
package contrarreloj;

public class Corredor {

    // ATRIBUTOS DE LA CLASE CORREDOR
    private int dorsal;
    private String nombre;
    private double tiempo;
    private static int siguienteDorsal = 1;

    // MÉTODOS CONSTRUCTORES DE LA CLASE CORREDOR
    /*
     * public Corredor(int d, String n) . Constructor a partir del dorsal y el
     * nombre. Por defecto el tiempo tardado es 0
     */
    public Corredor(int d, String n) {
        this.dorsal = d;
        this.nombre = n;
        this.tiempo = 0;
    }
    
    // GETTERS DE LA CLASE CORREDOR
    /*
     * public int getDorsal(). Devuelve el dorsal del corredor
     * public String getNombre(). Devuelve el nombre del corredor
     * public double getTiempo(). Devuelve el tiempo tardado por el corredor
     */
    public int getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTiempo() {
        return tiempo;
    }
    
    // SETTERS DE LA CLASE CORREDOR
    /*
     * public void setTiempo(double t) throws IllegalArgumentException .
     * Establece el tiempo tardado por el corredor. Lanzará la excepción si el tiempo
     * indicado es negativo.
     */
    
    public void setTiempo(double t) throws IllegalArgumentException {
        if (t >= 0) {
            this.tiempo = t;
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    /*
     * public void setTiempo(double t1, double t2) throws
     * IllegalArgumentException . Establece el tiempo tardado por el corredor.
     * 
     * t1 indica la hora de comienzo y t2 la hora de finalización (expresadas en
     * segundos). La diferencia en segundos entre los dos datos servirá para
     * establecer el tiempo tardado por el Corredor .
     * 
     * Lanzará la excepción si el tiempo resultante es negativo
     */
    public void setTiempo(double t1, double t2) throws IllegalArgumentException {
        double t;
        t = t1 - t2;
        setTiempo(t);
    }
    
    /*
     * public String toString() . Devuelve un String con los datos del corredor, de
     * la forma:
     *
     *        (234) - Juan Ramirez - 2597 segundos
     */

    @Override
    public String toString() {
        return "(" + dorsal + ")" +  " - " + nombre + " - " + tiempo + " segundos";
    }
    
    /*
     * public boolean equals(Object o) . Devuelve true si los corredores tienen el
     * mismo dorsal y false en caso contrario
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {  // Comprueba que el objeto que le pasamos por parametro
            return true;    // no es igual que con el objeto que estamos comparando (mirando la posición en memoria).
        }
        if (obj == null) {  // Comprueba que el objeto que le pasamos por parametro 
            return false;   // no sea nulo, si es nulo devolverá false.
        }
        if (getClass() != obj.getClass()) { // Comprueba que los objetos sean de la misma clase
            return false;                   // si no son de la misma clase no pueden tener lo mismos atributos, por tanto no son iguales, devolverá false.
        }
        final Corredor other = (Corredor) obj;  // Forzamos la conversión del objecto que nos pasan por parametro (Object). 
        return (this.dorsal != other.dorsal);   // y comprobamos si tienen el mismo dorsal.
    }
    
    /*
     * public int compareTo (Corredor o) . Un corredor es menor que otro si
     * tiene menor dorsal.
     */
    
    public int compareTo(Corredor o) {
        return o.getDorsal() - this.getDorsal();
    }
    
    /*
     * public static int generarDorsal() . Devuelve un número de dorsal
     * generado secuencialmente. Para ello la clase hará uso de un atributo static
     * int siguienteDorsal que incrementará cada vez que se genere un nuevo
     * dorsal.
     */
    
    public static int generarDorsal() {
        return siguienteDorsal++;
    }
}
