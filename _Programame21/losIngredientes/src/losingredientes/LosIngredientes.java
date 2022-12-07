/*
 * Los ingredientes
 * En nuestro bar preferido disponen de 12 ingredientes diferentes que podemos 
 * combinar como queramos. Nosotros queremos probar la mejor combinación posible. 
 * En el fichero adjunto se registran 1000 combinaciones posibles de los ingredientes 
 * (una linea para cada bocadillo), de manera que se muestra un 1 si el ingrediente 
 * está incluido en el bocadillo y un 0 en caso contrario.
 * 
 * EJEMPLO:
 * 001000010101
 * 010010111110
 * 001010110111
 * 001001011101
 *
 * SOLUCIÓN:
 * 001010111111
 */
package losingredientes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LosIngredientes {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner teclado = new Scanner(new File("src/ingredientes.txt"));
        String bocadillo;
        String bocadilloResultado = "";
        int[] pos0s = new int[12];
        int[] pos1s = new int[12];
        
        while(teclado.hasNext()) {
            bocadillo = teclado.nextLine();
            for (int i = 0; i < 12; i++) {
                if (bocadillo.charAt(i) == '0') {
                    pos0s[i]++;
                } else {
                    pos1s[i]++;
                }
            }
        }
        for (int i = 0; i < 12; i++) {
            if (pos0s[i] > pos1s[i]) {
                bocadilloResultado += "0";
            } else {
                bocadilloResultado += "1";
            }
        }
        System.out.println(bocadilloResultado);
    }
}
