public class Ejercicio2 {
    static int c;
    public static void main (String [] args) {
        /* 1. ¿Es posible escribir dos instrucciones en la misma línea de un programa? */
                // Si
        int a=10, b=12; System.out.println("La suma entre a + b es igual a: " + (a + b));
        /* 2. ¿Se puede "romper" una instrucción entre varias líneas? */
                // No
        int
        d
        =99
        ;
        System.out.println("Variable partida en lineas es igual a: " + d);

        /* Algunos lenguajes de programación dan un valor por defecto a las variables cuando las declaramos
        sin inicializarlas. Otros no permiten usar el contenido de una variable que no haya sido previamente
        inicializada. ¿Cuál es comportamiento de Java? */
                /* Java SI que le asigna un valor por defecto a una variable no inicializada, si la declaras fuera del metodo, si no,
                deberas inicializarla manualmente*/
        System.out.println("La variable no declarada tiene un valor por defecto de: " + c);
    }
}