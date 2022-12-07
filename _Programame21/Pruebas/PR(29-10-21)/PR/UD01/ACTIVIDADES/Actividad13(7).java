/* 13. Indicar que valor devolverá la ejecución del siguiente programa: */

public class Actividad13 {
    public static void main(String[] args) {
        int num = 4;
        num %= (((7 * num) % 3) * 3);
        System.out.println(num);

            // Primero se multiplica (7 * num(4)) = 28
            // Luego se calcula el resto de (28 % 3) = 1
            // Ahora se multiplica (1 * 3) = 3
            // Y por ultimo se aplica el operador de asignación (num(4) %= 3) = 1
    }
}
