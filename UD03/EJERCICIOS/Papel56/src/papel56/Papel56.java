/*
 * 56. ¿Qué valor se asignará a consumo en la sentencia if siguiente si velocidad es 120?
 */
package papel56;

public class Papel56 {

    public static void main(String[] args) {
        int velocidad = 120;
        int consumo = 0;
        
        // VELOCIDAD (120) MAYOR QUE 80
        // CONSUMO SE ESTABLECE EN 10
        if (velocidad > 80) {
            consumo = 10;
            
        } else if (velocidad > 100) {
            consumo = 12;

        } else if (velocidad > 120) {
            consumo = 15;
        }
        // CONSUMO SE QUEDA EN 10
        // PORQUE SE CUMPLE LA PRIMERA CONDICIÓN
        // Y EL RESTO NO SE COMPRUEBAN
        System.out.println(consumo);
        
    }
}
