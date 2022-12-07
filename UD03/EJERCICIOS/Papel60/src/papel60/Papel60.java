/*
 * 60. ¿Qué salida producirá el siguiente fragmento de programa si la variable entera platos vale 1? ¿Y si
 * vale 3? ¿Y si vale 0? * and open the template in the editor.
 */
package papel60;

public class Papel60 {

    public static void main(String[] args) {
        int platos = 1;
        
        switch (platos) {
            case 1:
                System.out.println("\nPrimer plato");
            case 2:
                System.out.println("\nSegundo plato");
            case 3:
                System.out.println("\nBebida");
                System.out.println("\nPostre");
                break;
            default:
                System.out.println("\nCafé");
                
                // Si platos es igual a 1, se imprimirán todos los sout
                // hasta el break del case 3.
                
                // Si platos es igual a 3 se  imprimirá por pantalla los dos sout
                // de case 3.
                
                // Si platos es igual a 0 se imprimirá el sout "Café" de default.
        }
    }
}
