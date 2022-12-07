/*
Indica cual será la salida producida por los siguientes programas, teniendo en cuenta los datos de entrada:
 */
package trazas1;

import java.util.Scanner;

public class Trazas1 {
    // DATOS DE ENTRADA : 2, 5

    /* ---- 1 ----
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int x, y, a;
        x = tec.nextInt();                      // -> x = 2
        y = tec.nextInt();                      // -> x = 5
        a = x + y;                              // -> x = 7
        System.out.println(a);
    }
    SALIDA: 7
     */
    
    /* ---- 2 ----
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int x, a;
        x = tec.nextInt();
        x = tec.nextInt();
        a = x + x;                              // SUMA LOS DOS NÚMEROS (IGUALES) INTRODUZIDOS POR EL USUARIO
        System.out.println(a);
    }
    SALIDA: 10
     */
    
    /* ---- 3 ----
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int x, y, a;
        x = tec.nextInt();
        y = tec.nextInt();
        a = x + y;                              // A VALE LA SUMA DE X + Y
        a = x * y;                              // A SE IMPONE LA MULTIPLICACIÓN A LA SUMA
        System.out.println(a);
    }
    SALIDA: 10
     */
    
    /* ---- 4 ----
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int x, y, a;
        x = tec.nextInt();
        y = tec.nextInt();
        a = x + y;                              // A VALE LA SUMA DE X + Y
        System.out.println(a);                  // SE IMPRIME A
        a = x * y;                              // A VALE LA MULTIPLICACIÓN DE X + Y
        System.out.println(a);                  // SE IMPRIME A
    }
    SALIDA: 7, 10
     */
    
    /* ---- 5 ----
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int x, y, a;
        x = tec.nextInt();
        y = tec.nextInt();
        a = x + y;                              // A TIENE EL VALOR DE: X(2) + Y(5)
        a = a + x + y;                          // A TIENE EL VALOR DE: A(7) + X(2) + Y(5)
        a = a + a;                              // A TIENE EL VALOR DE A(14) + A(14)
        System.out.println(a);
    }
    SALIDA: 28
     */
    
    /* ---- 6 ----
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int x, y, a;
        x = tec.nextInt();
        y = tec.nextInt();
        a = x;                                  // A ES IGUAL A X(2)
        a = doble(x);                           // A ES IGUAL AL DOBLE DE 2
        System.out.format("%d%n%d%n%d", x, y, a);   // SE IMPRIMEN LOS NÚMEROS ENTEROS CON SALTOS DE LÍNEA
    }

    public static int doble(int num) {
        return 2 * num;                         // CALCULA EL DOBLE DE UN MÉTODO
    }
    SALIDA: 
     */
    
    /* ---- 7 ----
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int x, y, a;
        x = tec.nextInt();
        y = tec.nextInt();
        a = x;
        doble(a);
        System.out.format("%d%n%d%n%d%n", x, y, a);
    }

    public static void doble(int x) {
        x = 2 * x;
    }
    SALIDA:
    */
    
    /* ---- 8 ----
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int x, y, a;
        x = tec.nextInt();
        y = tec.nextInt();
        a = calcular(y, x);
        System.out.format("%d%n%d%n%d%n", x, y, a);
    }

    public static int calcular(int x, int y) {
        return x - y;
    }
    SALIDA:
    */
    
    /* ---- 9 ----
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int x, y, a;
        x = tec.nextInt();
        y = tec.nextInt();
        y = calcular(x);
        a = calcular(y);
        System.out.format("%d%n%d%n%d%n", x, y, a);
    }

    public static int calcular(int x) {
        return x * x;
    }
    SALIDA:
    */
    
}
