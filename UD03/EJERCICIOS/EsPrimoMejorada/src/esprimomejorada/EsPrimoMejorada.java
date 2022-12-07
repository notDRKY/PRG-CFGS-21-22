/*
 * 27. (esPrimoMejorada) Haz una nueva versión del programa del ejercicio anterior teniendo en
 * cuenta lo siguiente:
 *      El único número par que es primo es el 2.
 *      Un número n no puede tener divisores mayores que n/2
 */
package esprimomejorada;

import java.util.Scanner;

public class EsPrimoMejorada {

    public static boolean esPrimo(int numeroEntero) {
        boolean primo = true;
        for (int contador = 3; contador < (numeroEntero) / 2; contador++) {
            if (primo && (numeroEntero % contador == 0)) {
                primo = false;
            }
        }
        return primo;
    }

    public static String primosEntre1n(int numeroEntero) {
        String cadena = "";
        if (numeroEntero == 1) {
            cadena += "1 ";
        } else if (numeroEntero >= 2) {
            cadena += "1 2 ";
        }
        
        for (int contador = 3; contador <= numeroEntero; contador += 2) {
            if (esPrimo(contador) == true) {
                cadena += contador + " ";
            }
        }
        return cadena;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum;

        System.out.print("Introduce un número: ");
        usrNum = teclado.nextInt();

        System.out.println(esPrimo(usrNum));
        System.out.println(primosEntre1n(usrNum));
    }
}
