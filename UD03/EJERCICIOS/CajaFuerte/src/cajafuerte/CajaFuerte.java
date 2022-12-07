/*
 * 41. Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa
 * nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje " Lo siento, esa no es
 * la combinación" y si acertamos se nos dirá "La caja fuerte se ha abierto satisfactoriamente" . Tendremos
 * cuatro oportunidades para abrir la caja fuerte.
 */
package cajafuerte;

import java.util.Scanner;

public class CajaFuerte {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int COMBINACION_CAJA = 1234;
        int usrCombinacion = 0;
        int i = 0;
        
        do {
            i ++;
            System.out.print("Introduce la cmbonación de la caja fuerte: ");
            usrCombinacion = teclado.nextInt();
            System.out.println("Número de intento: " + i);
            
            if (usrCombinacion == COMBINACION_CAJA ) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            } else {
                System.out.println("Lo siento, esa no es la combinación");
            }
            
        } while (usrCombinacion != COMBINACION_CAJA && i < 4);
    }
}
