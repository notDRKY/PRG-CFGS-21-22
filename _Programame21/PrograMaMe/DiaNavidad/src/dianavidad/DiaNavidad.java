package dianavidad;

import java.util.Scanner;

public class DiaNavidad {

    public static boolean esNavidad(int dia, int mes) {
        return (dia == 25) && (mes == 12);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numRepeticion = 0;
        int usrDia = 0;
        int usrMes = 0;

        numRepeticion = teclado.nextInt();

        for (int i = 0; i < numRepeticion; i++) {
            usrDia = teclado.nextInt();
            usrMes = teclado.nextInt();

            if (esNavidad(usrDia, usrMes) == true) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
