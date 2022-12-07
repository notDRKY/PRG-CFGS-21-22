/*
 * 4. Programa que muestre en pantalla la tabla de multiplicar del 1 al 10 con el formato:
 *           ...
 *           Tabla del 2
 *           ***********
 *           2 x 1 = 2
 *           2 x 2 = 4
 *           ...
 *           2 x 10 = 20
 *           ...
 *           Tabla del 3
 *           ***********
 *           ...
 */
package act4;
    
public class Act4 {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nTabla del " + i + " \n***********");
            
            for (int a = 1;a <= 10;a++) {
                System.out.println(i + " x " + a + " = " + (i * a));
            }
        }
    }
}
