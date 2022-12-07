/*
 * Actividad 3. Un supermercado nos pide que hagamos una aplicación que almacene los
 * productos comprados. La aplicación debe almacenar Productos (clase) y cada producto al crearse
 * contiene una cantidad, un precio (generados aleatoriamente). El nombre del producto será básico
 * (producto1, producto2, producto3, etc.). Calcular el precio total de una lista de entre 1 y 10
 * productos (aleatorio). Mostrar un ticket con todo lo vendido y el precio final.
 */
package actividad3;

public class Producto {
    
    private static int numProductos = 1;
    private int cantidad;
    private double precio;
    //private double precioTotalProducto; // david diu que se te que evitar
    private String nombre;

    public Producto() {
        this.cantidad = ((int) Math.round(Math.random() * 100));
        this.precio = ((Math.random() * 100) + 1);
        this.nombre = "producto " + numProductos++;
        //this. precioTotalProducto = (this.cantidad * this.precio);
    }

    @Override
    public String toString() {
        return nombre + "\t" + "CNT PD: " + cantidad + "\t"
                + "P.U: " + String.format("%,.2f", precio) + "€ \t"
                + "P.T: " + String.format("%,.2f", getPrecioTotalProducto()) + "€";
    }
    
    public double getPrecioTotalProducto() {
        return (this.cantidad * this.precio);
    }
    
}
