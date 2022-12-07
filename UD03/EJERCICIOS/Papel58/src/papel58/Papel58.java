/*
 * 58. Cuál es la salida exacta por pantalla del siguiente fragmento de programa
 */
package papel58;
    
public class Papel58 {
    
    public static void main(String[] args) {
        /*
            La sentencia no llega a completarse, ya que no entra a ninguno de los
            if internos y sale diractamente, así que solo mostrará "Comenzamos"
            y "Terminamos" por pantalla.
        */
        
        int x = 20;
        System.out.println("Comenzamos");
        
        if (x >= 20) {
            if (x > 50) {
                System.out.println("Muy grande");
            } else {
                if (x % 2 != 0) {
                    System.out.println("Impar");
                }
            }
        } else if (x <= 20) {
            System.out.println("Pequeño");
        }
        System.out.println("Terminamos");
    }
}