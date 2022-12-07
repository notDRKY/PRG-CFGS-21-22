/*
 * 5. Programa que muestre los números del 1 al 100 sin mostrar los múltiplos de 5.
 */
package act5;
    
public class Act5 {
    
    public static void main(String[] args) {
        for (int contador = 1; contador <= 100 ;contador++) {
            if ((contador % 5) == 0) {
                System.out.println("[BUCLE] ");
            } else {
                System.out.println("[BUCLE] " + contador);
            }
        }
    }
}
