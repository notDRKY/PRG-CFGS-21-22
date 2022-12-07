/*
 * 45. Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos
 * por teclado y validados como distintos, el programa debe empezar por el menor de los enteros
 * introducidos e ir incrementando de 7 en 7.
 */
package incremento7_45;

import java.util.Scanner;

public class Incremento7_45 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena = "";
        int usrPrimerEntero = 0;
        int usrSegundoEntero = 0;

        System.out.println("___INCREMENTO 7___");
        System.out.print("Introduce el primer número entero: ");
        usrPrimerEntero = teclado.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        usrSegundoEntero = teclado.nextInt();

        if (usrPrimerEntero != usrSegundoEntero) {
//            if (usrPrimerEntero < usrSegundoEntero) {
//                for (int i = usrPrimerEntero; i <= usrSegundoEntero; i += 7) {
//                    cadena += i + " ";
//                }
//            } else {
//                for (int i = usrSegundoEntero; i <= usrPrimerEntero; i += 7) {
//                    cadena += i + " ";
//                }
//            }
                for (int i = Math.min(usrPrimerEntero, usrSegundoEntero); i<= Math.max(usrPrimerEntero, usrSegundoEntero);i+=7){ // Opción óptima
                    cadena += i + " ";
                }
            System.out.println(cadena);
        } else {
            System.out.println("Los dos números enteros deben ser iguales.");
        }
    }
}
