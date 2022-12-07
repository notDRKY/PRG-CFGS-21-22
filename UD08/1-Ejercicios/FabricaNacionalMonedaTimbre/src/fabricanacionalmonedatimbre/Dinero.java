/*
3. La Fabrica Nacional de Moneda y Timbre quiere almacenar cierta información técnica
 * del dinero (billetes y monedas) que emite. En concreto, le interesa:
 * 
 *      Valor : Valor de la moneda o billete, en euros. ( double )
 * 
 *      Año de emisión : Año en que fué emitida la moneda o billete. ( int )
 * 
 *      De las monedas,
 *          Diámetro : Diámetro de la moneda, en milímetros. ( double )
 *          
 *          Peso : Peso de la moneda, en gramos ( double )
 * 
 *      De los billetes.
 *          Altura del billete , en mm ( double )
 *          
 *          Anchura del billete , en mm ( double ).
 * 
 * a) Diseñar la clase abstracta Dinero y sus subclases Moneda y Billete , desarrollando:
 * 
 *      Constructores que reciban los datos necesarios para inicializar los atributos de
 *      la clase correspondiente
 * 
 *      equals : Dos monedas o billetes son iguales si tienen el mismo año de emisión
 *      y valor.
 * 
 *      compareTo : Es menor (mayor) el de menor (mayor) año, a igual año es menor
 *      (mayor) el de menor (mayor) valor.
 * 
 *      toString : Que muestre todos los datos del billete o moneda. Los billetes irán
 *      precedidos por el texto "BILLETE" y las monedas por el texto "MONEDA"
 * 
 * b) Diseñar la clase TestDinero para probar las clases desarrolladas: Crear objetos de las
 * clases Moneda y Billete y mostrarlos por pantalla
 */
package fabricanacionalmonedatimbre;

public abstract class Dinero {
    protected double valor;
    protected int anoEmision;

    public Dinero(double valor, int anoEmision) {
        this.valor = valor;
        this.anoEmision = anoEmision;
    }
    
    @Override
    public String toString() {
        return "VALOR: \t\t" + valor + "\nAÑO EMISIÓN: \t" + anoEmision;
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
        final Dinero other = (Dinero) obj;
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        return (this.anoEmision != other.anoEmision);
    }
    
    public int compareTo(Object o) {
        final Dinero other = (Dinero) o;
        // Si los Años de emision del Dinero son iguales...
        if ((this.getAnoEmision() == other.getAnoEmision())) {
            /*
             * Comparamos su valor, al ser double, no podremos devolver la diferencia,
             * pero comparandalos uno con otro podremos saber si son iguales, o cúal es
             * mayor o menor entre los valores.
             */
            if (this.getValor() == other.getValor()) {
                return 0;
            } else if (this.getValor() > other.getValor()) {
                return 1;
            } else {
                return - 1;
            }
        } else {
            // Si no son iguales, devolveremos la diferencia entre ambos:
            return (this.getAnoEmision() - other.getAnoEmision());
        }
    }

    public double getValor() {
        return valor;
    }

    public int getAnoEmision() {
        return anoEmision;
    }
    
}
