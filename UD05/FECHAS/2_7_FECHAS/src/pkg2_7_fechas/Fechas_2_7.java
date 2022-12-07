/*
 * 7. Introducir un día, un mes y un año y verificar si es una fecha correcta.
 * 
 *     1| Introduce un dia para la fecha: 29
 *     2| Introduce un mes para la fecha: 2
 *     3| Introduce un año para la fecha: 2022
 *     4| LA FECHA ES INCORRECTA
 *     5| 
 *     6| Introduce un dia para la fecha: 29
 *     7| Introduce un mes para la fecha: 2
 *     8| Introduce un año para la fecha: 2020
 *     9| LA FECHA ES CORRECTA
 */
package pkg2_7_fechas;

import java.time.LocalDate;
import java.util.Scanner;

public class Fechas_2_7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrDia;
        int usrMes;
        int usrAno;

        System.out.print("Introduce un dia para la fecha: ");
        usrDia = teclado.nextInt();

        System.out.print("Introduce un mes para la fecha: ");
        usrMes = teclado.nextInt();

        System.out.print("Introduce un año para la fecha: ");
        usrAno = teclado.nextInt();

        try {
            LocalDate usrFecha = LocalDate.of(usrAno, usrMes, usrDia);
            System.out.println("LA FECHA ES CORRECTA");
        } catch (Exception e) { // Tiene que saltar con cualquier excepción para cubrir todos los posibles fallos.
            System.out.println("LA FECHA ES INCORRECTA");
        }
    }
}
