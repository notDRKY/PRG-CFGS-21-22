/*
 * 30. Escribir un programa en el que el usuario introduzca un número entero cualquiera (positivo, negativo o
 * cero) y se le diga cuantas cifras tiene. Pistas: ¿Cuantas cifras tiene el nº 25688? ¿Cuántas veces podemos
 * dividir el nº 25688 por 10 hasta que se hace cero? Cuidado, el nº 0 tiene una cifra.
 */
package cifras;
import java.util.Scanner;

public class Cifras {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum;
        int contador;

        System.out.print("Introduce un numero entero cualquiera: ");
        usrNum = teclado.nextInt();
        int aux = usrNum;
        
        if (usrNum == 0) {
            System.out.println("El numero " + usrNum + " tiene 1 cifra.");
        } else {
            for (contador = 0; usrNum != 0 ;contador++){
                usrNum = usrNum / 10;
            }
            System.out.println("El numero " + aux + " tiene " + contador + " cifra(s).");
        }

    }

}
