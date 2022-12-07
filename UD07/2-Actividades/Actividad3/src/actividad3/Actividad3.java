/*
 * Actividad 3. Un supermercado nos pide que hagamos una aplicación que almacene los
 * productos comprados. La aplicación debe almacenar Productos (clase) y cada producto al crearse
 * contiene una cantidad, un precio (generados aleatoriamente). El nombre del producto será básico
 * (producto1, producto2, producto3, etc.). Calcular el precio total de una lista de entre 1 y 10
 * productos (aleatorio). Mostrar un ticket con todo lo vendido y el precio final.
 */
package actividad3;

import java.util.ArrayList;

public class Actividad3 {

    public static void main(String[] args) {
        double precioFinal = 0; //precio final del ticket
        ArrayList<Producto> listaProductos = new ArrayList<>();

        for (int i = 0; i <= ((int) Math.round(Math.random() * 10) + 1); i++) {
            listaProductos.add(new Producto());
        }
        System.out.println("TICKET");
        System.out.println("----------------------------------------------------------------------");
        for (Producto numero : listaProductos) {
            System.out.println(numero);
            precioFinal += numero.getPrecioTotalProducto();
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("PRECIO TOTAL:\t\t " + String.format("%,.2f", precioFinal) + "€");
    }
}
