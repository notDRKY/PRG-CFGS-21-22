/*
 * 31. (Transportes) Una empresa de transportes cobra 30€ por cada bulto que transporta. Además, si el peso
 * total de todos los bultos supera los 300 kilos, cobra 0.9€ por cada kg extra. Por último si el trasporte debe
 * realizarse en sábado, cobra un plus de 60€. La empresa no realiza el pedido si hay que transportar más
 * de 30 bultos, si el peso total supera los 1000 kg o si se solicita hacerlo en domingo. Realizar un programa
 * que solicite el número de bultos, el día de la semana (valor entre 1 y 7) y el peso de cada uno de los bultos
 * y muestre el coste del transporte en caso de que pueda realizarse o un mensaje adecuado en caso
 * contrario
 */
package transportes;

import java.util.Scanner;

public class Transportes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int bultos;
        int diaSemana;
        int contador = 1;
        float pesoIntroducido;
        float pesoTotal = 0;
        float precio;

        System.out.println("¿Cuntos bultos desea enviar?: ");
        bultos = teclado.nextInt();
        System.out.println("¿Que día de la semana desea realizar el envio?: ");
        diaSemana = teclado.nextInt();

        if ((diaSemana >= 7) || (bultos > 30)) {
            System.out.println("No se puede realizar el envio por superar los 30 bultos o ser domingo (7).");
        } else {
            while (contador <= bultos) {
                System.out.println("Introduzca el peso de bulto " + contador + ": ");
                pesoIntroducido = teclado.nextFloat();
                pesoTotal += pesoIntroducido;
                contador++;
            }

            if (pesoTotal > 1000) {
                System.out.println("No se puede realizar el envio por superar los 1000 kg: ");
            } else {
                precio = 30 * bultos;

                if (diaSemana == 6) {
                    precio += 60;
                }

                if (pesoTotal > 300) {
                    precio = (float) (precio + ((pesoTotal - 300) * 0.9));
                }

                System.out.println("El precio del pedido será: " + precio + "€ .");

            }
        }
    }
}