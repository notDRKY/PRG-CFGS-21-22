/*
17. (Editorial) Una compañía editorial dispone de 2 tipos de publicaciones: libros y revistas. El precio de cada
pedido depende del número de elementos solicitados al cual se le aplica un determinado descuento, que
es diferente para libros y para revistas. La siguiente tabla muestra los descuentos a aplicar en función del
número de unidades y del tipo de producto:

        Cantidad pedida             Libros                  Revistas
        Hasta 5 unidades            0 % de descuento        0 % de descuento
        De 6 a 10 unidades          10 % de descuento       15 % de descuento
        De 11 a 20 unidades         15 % de descuento       20 % de descuento
        A partir de 20 unidades     20 % de descuento       25 % de descuento

Escribe un método calcularCoste que, recibiendo el tipo de publicación ( String ), que puede ser "libro" o
"revista", el precio individual ( double ) y el número de unidades solicitado ( int ), devuelva el coste del
pedido (aplicando el descuento correspondiente).

Escribe un programa en el que el usuario indique cantidad y precio de revistas y cantidad y precio de
libros que incluye un pedido, y muestre el coste del pedido

1000€ * (1 - dto)
 */
package editorial;

import java.util.Scanner;

public class Editorial {

    private static double calcularCoste(String librosOre, double precioIndi, int unidades) {
        double descuentoLibros = 0;
        double descuentoRevistas = 0;
        double precioTotal = 0;

        if (librosOre.equals("libros")) {
            precioTotal = (unidades * precioIndi);

            if (unidades < 6) {
                return precioTotal;

            } else if (unidades <= 10) {
                descuentoLibros = 0.10;

            } else if (unidades <= 20) {
                descuentoLibros = 0.15;

            } else {
                descuentoLibros = 0.20;
            }

            precioTotal *= (1 - descuentoLibros);

        } else {
            precioTotal = (unidades * precioIndi);
            if (unidades < 6) {
                return precioTotal;

            } else if (unidades <= 10) {
                descuentoRevistas = 0.10;

            } else if (unidades <= 20) {
                descuentoRevistas = 0.15;

            } else {
                descuentoRevistas = 0.20;
            }
            precioTotal *= (1 - descuentoRevistas);
        }
        return precioTotal;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String articulo = "";
        int cantidad = 0;
        double precioUnitario = 0;

        System.out.print("Indique el artículo que deseea [libros | revistas]: ");
        articulo = teclado.nextLine();
        System.out.print("Introduzca el precio unitario: ");
        precioUnitario = teclado.nextDouble();
        System.out.print("Indique las unidades que desea: ");
        cantidad = teclado.nextInt();

        calcularCoste(articulo, precioUnitario, cantidad);

        System.out.printf("El precio total será %,.2f€.\n", calcularCoste(articulo, precioUnitario, cantidad));
    }
}
