/*
 * El lugar
 * No todos los lugares son iguales para l'Esmorzaret y según la ocasión deberás 
 * acudir a uno u otro. En algunos el medio bocadillo es corto, en otros no se 
 * puede cerrar, o tal vez las camareras/os son más simpáticos/as. Un amigo nos 
 * pasa un fichero (en el enlace inferior) con una serie de indicaciones para 
 * llegar a su Bar preferido. Debes tener en cuenta que partes de la posición 
 * vertical y horizontal cero, y que cada vez que aparece "arriba" se incrementa 
 * la posición vertical, cada vez que aparece izquierda se incrementa la posición 
 * horizontal, y si aparece derecha se decrementa la posición horizontal, siempre 
 * en el número de pasos que se indica al lado de la dirección.
 *
 * arriba 1
 * izquierda 6
 * arriba 8
 * derecha 3
 * izquierda 1
 *
 * SOLUCIÓN:
 * - Vertical 9
 * - Horizontal 4
 * - Respuesta: 36
 */
package ellugar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ElLugar {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner teclado = new Scanner(new File("src/direcciones.txt"));
        String dir;
        int num;
        int vertical = 0;
        int horizontal = 0;
        int resultado = 0;
        
        while(teclado.hasNext()) {
            dir = teclado.next();
            num = teclado.nextInt();
            //System.out.println(dir);
            
            if (dir.contains("arriba")) {
                // incrementa vertical
                vertical += num;
                
            } else if (dir.contains("izquierda")) {
                // incrementa horizontal
                horizontal += num;
            } else {
                // contiene derecha
                // decrementa horizontal
                horizontal -= num;
            }
        }
        System.out.println(vertical);
        System.out.println(horizontal);
        resultado = vertical * horizontal;
        System.out.println(resultado);
    }
}
