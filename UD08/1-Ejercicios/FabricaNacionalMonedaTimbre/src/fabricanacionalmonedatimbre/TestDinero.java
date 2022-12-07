/*
 * b) Diseñar la clase TestDinero para probar las clases desarrolladas: Crear objetos de las
 * clases Moneda y Billete y mostrarlos por pantalla
 */
package fabricanacionalmonedatimbre;

public class TestDinero {
    public static void main(String[] args) {
        Moneda m1 = new Moneda(1.50, 0.40, 1, 2018);
        Moneda m2 = new Moneda(2, 0.60, 0.50, 2020);
        Billete b1 = new Billete(3.70, 5.70, 10, 2022);
        Billete b2 = new Billete(3.50, 5.50, 50, 2016);
        System.out.println("TO STRING");
        System.out.println("_____________________________________________________________");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("_____________________________________________________________");
        System.out.println("COMPARE TO");
        System.out.println("m1.compareTo(m2): \t" + m1.compareTo(m2));
        System.out.println("b1.compareTo(b1): \t" + b1.compareTo(b1));
        System.out.println("_____________________________________________________________");
        System.out.println("EQUALS");
        System.out.println("m1.equals(m1): \t" + m1.equals(m1));
        System.out.println("b2.equals(m2): \t" + b2.equals(m2));
        System.out.println("_____________________________________________________________");
    }
}
