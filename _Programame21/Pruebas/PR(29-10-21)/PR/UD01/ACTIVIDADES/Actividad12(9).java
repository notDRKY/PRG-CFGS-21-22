/* 12. Indicar que valor devolverá la ejecución del siguiente programa: */

public class Actividad12 {
    public static void main(String[] args) {
        int num = 5;
        num += num - (1 * 4) + 1; 
        System.out.println(num);

            // El operador "+=" da como resultado la suma entre num(5) y num(5) = (10).
            // Multiplicar 4 x 1 (4).
            // Resolver la suma y resta de izquierda a derecha (10 - 4 + 1 = 7).
    }
}