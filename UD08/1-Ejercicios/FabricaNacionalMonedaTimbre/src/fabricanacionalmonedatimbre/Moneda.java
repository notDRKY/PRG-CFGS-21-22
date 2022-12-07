/*
 *  a) Diseñar la clase abstracta Dinero y sus subclases Moneda y Billete , desarrollando:
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
 */
package fabricanacionalmonedatimbre;

public class Moneda extends Dinero{
    protected double diametro;
    protected double peso;

    public Moneda(double diametro, double peso, double valor, int anoEmision) {
        super(valor, anoEmision);
        this.diametro = diametro;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "[MONEDA]\n" + super.toString() +  "\nDIAMETRO MONEDA: \t" + diametro + "\nPESO MONEDA: \t" + peso;
    }
    
}
