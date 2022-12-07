/*
 * 1. Transforma el siguiente bucle for en un bucle while:
 * for (i=5; i<15; i++) {
 * System.out.println(i);
 * }
 */
package act1;

public class Act1 {
    
    public static void main(String[] args) {
        int i = 5;
        
        while (i < 15) {
            System.out.println("[BUCLE]: i es igual a: " + i);
            i++;
        }
    }
}
