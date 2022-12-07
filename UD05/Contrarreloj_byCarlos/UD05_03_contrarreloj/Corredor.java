/*
Se quiere realizar una aplicación para registrar las posiciones y tiempos de llegada en una
carrera ciclista contrarreloj.
    1. La clase Corredor representa a un participante en la carrera. Sus atributos son el dorsal
    (entero), el nombre (string) y el tiempo en segundos (double) que le ha costado
    completar el recorrido. Los métodos con los que cuenta son:
 */
package UD05_03_contrarreloj;

/**
 *
 * @author Carlos
 */
public class Corredor {

    //Atributos de la clase
    private int dorsal;
    private String nombre;
    private double tiempo;
    private static int siguienteDorsal=1;

//Métodos de la clase
    //public Corredor(int d, String n) . Constructor a partir del dorsal y el
    //nombre.
    public Corredor(int d, String n) {
        this.dorsal = d;
        this.nombre = n;
        // Por defecto el tiempo tardado es 0
        this.tiempo = 0;
    }

    //public double getTiempo() . Devuelve el tiempo tardado por el corredor
    public double getTiempo() {
        return tiempo;
    }

    //public String getDorsal() . Devuelve el dorsal del corredor
    public int getDorsal() {
        return dorsal;
    }

    //public String getNombre() . Devuelve el nombre del corredor
    public String getNombre() {
        return nombre;
    }

//public void setTiempo( double t)throws IllegalArgumentException .
//Establece el tiempo tardado por el corredor. Lanzará la excepción si el tiempo
//indicado es negativo.
    public void setTiempo(double t) throws IllegalArgumentException {
        if (t >= 0) {
            this.tiempo = t;
            //Si el tiempo tardado es negativo
        } else {
            throw new IllegalArgumentException();
        }
    }

//public void setTiempo(double t1, double t2) throws
//IllegalArgumentException . Establece el tiempo tardado por el corredor.
    //t1 indica la hora de comienzo y t2 la hora de finalización (expresadas en
    //segundos). La diferencia en segundos entre los dos datos servirá para
    //establecer el tiempo tardado por el Corredor .
    public void setTiempo(double t1, double t2) throws IllegalArgumentException {
        //Si el tiempo final es mayor o igual que el tiempo inicial, será positivo o neutral(0)
        if (t2 >= t1) {
            //Establecer que el tiempo será la diferencia entre t2 y t1
            this.tiempo = t2 - t1;
            //Lanzará la excepción si el tiempo resultante es negativo
        } else {
            throw new IllegalArgumentException();
        }
        //Mejor así:
        //this.setTiempo(t2-t1);
    }

//public String toString() . Devuelve un String con los datos del corredor, de
//la forma:
    //(234) - Juan Ramirez - 2597 segundos
    @Override
    public String toString() {
        return "Corredor: " + "(" + dorsal + ")" + " - " + nombre + " - " + tiempo + " segundos";
    }

//public boolean equals(Object o) . Devuelve true si los corredores tienen el
//mismo dorsal y false en caso contrario
    //Nos lo chivatea IDE -> Insert Code... -> Equals
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.dorsal;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        final Corredor other = (Corredor) o;
        return this.dorsal == other.dorsal;
    }

    //public int compareTo (Object o) . Un corredor es menor que otro si tiene
    //menor dorsal.
    public int compareTo(Corredor o) {
        //Devuelve la diferencia el atributo dorsal entre ambos objetos
        return (this.dorsal - o.dorsal);
    }

    //public static int generarDorsal() . Devuelve un número de dorsal
    //generado secuencialmente. Para ello la clase hará uso de un atributo static
    //int siguienteDorsal que incrementará cada vez que se genere un nuevo
    //dorsal.
    public static int generarDorsal() {
        //Devolverá siguienteDorsal y LUEGO lo incrementará en 1
        return siguienteDorsal++;
    }
}
