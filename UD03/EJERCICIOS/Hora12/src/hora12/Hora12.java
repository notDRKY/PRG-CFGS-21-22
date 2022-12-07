/*
 * 8. (Hora12) Escribir un programa que lea la hora de un dia en notación de 24 horas y la exprese
 * en notación de 12 horas. Por ejemplo, si la entrada es 13 horas 45 minutos, la salida será
 * 1:45 PM. La hora y los minutos se leerán de teclado de forma separada, primero la hora y
 * luego los minutos.
 */
package hora12;

import java.util.Scanner;

public class Hora12 {

    public static String doceHoras(int hora, int minuto) {
        String cadena;

        if (hora < 24) {
            if (hora >= 12) {
                hora = hora % 12;
                
                if(hora == 0) {
                    hora = hora + 12;
                }
                cadena = hora + ":" + minuto + " PM";
            } else {
                if (hora == 0) {
                    hora = hora + 12;
                }

                cadena = hora + ":" + minuto + " AM";
            }
        } else {
            cadena = "[LA HORA DEBE SER INFERIOR A 24]";
        }

        return cadena;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrHora, usrMinuto;

        System.out.print("[1]Introduce la hora(24h): ");
        usrHora = teclado.nextInt();

        System.out.print("[2]Introduce los minutos: ");
        usrMinuto = teclado.nextInt();

        System.out.println("-----" + doceHoras(usrHora, usrMinuto) + "-----");
    }
}
