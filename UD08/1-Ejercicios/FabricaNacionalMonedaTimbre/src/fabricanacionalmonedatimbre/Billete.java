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

public class Billete extends Dinero {
    protected double altura;
    protected double anchura;

    public Billete(double altura, double anchura, double valor, int anoEmision) {
        super(valor, anoEmision);
        this.altura = altura;
        this.anchura = anchura;
    }

    @Override
    public String toString() {
        return "[BILLETE]\n" + super.toString() + "\nALTURA BILLETE: \t" + altura + "\nANCHURA BILLETE: \t" + anchura;
    }
    
}
