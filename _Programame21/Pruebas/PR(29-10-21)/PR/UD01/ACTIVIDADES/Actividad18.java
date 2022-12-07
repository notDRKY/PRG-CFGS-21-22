/* 18. Realizar un programa que realice el cálculo del precio de un producto teniendo en cuenta que el producto
vale 120 €, tiene un descuento del 15% y el IVA que se le aplica es del 21%. */

public class Actividad18 {
    public static void main (String [] args) {
        
        final float DESCUENTO =0.15f;
        final float IVA= 0.21f;
        final float PRECIO= 120f;
        float precioDescuento, precioFinal;
        
        precioDescuento= (PRECIO - (PRECIO * DESCUENTO));
        precioFinal= (precioDescuento + (precioDescuento * IVA));

        // (PRECIO - (PRECIO * DESCUENTO)) + (PRECIO * IVA))

        System.out.print(precioFinal);
    }
}