/*
18. (Taxi) Se desea calcular el coste del trayecto realizado en taxi en función de los kilómetros
recorridos en las carreras metropolitanas de Valencia. Según las tarifas vigentes para el
2012, el coste se calcula de la siguiente manera:
        Días laborables en horario diurno (de 6:00 a 22:00h): 0.73 €/km.
        Días laborables en horario nocturno: 0.84 €/km.
        Sábados y domingos: 0.93 €/km.
        Además, la tarifa mínima diurna es de 2.95€ y la mínima nocturna de 4€.
Escribir un programa que solicite al usuario:
        La hora (hora y minutos) en que se realizó el trayecto.
        El día de la semana (se supone que el usuario introduce un valor entre 1 para lunes y 7
        para domingo)
        Los quilómetros recorridos.
Y muestre el coste del trayecto
 */
package taxi;

import java.util.Scanner;

public class Taxi {

    public static double calculaCosteTrayecto(int horas, int minutos, int diaSemana, double kilometros) {
        final double PRECIO_DIA_LABORAL = 0.73;
        final double PRECIO_NOCHE_LABORAL = 0.84;
        final double PRECIO_FINDE = 0.93;
        final double TARIFA_DIURNA = 2.95;
        final double TARIFA_NOCTURNA = 4;
        double precioTotal = 0;

        if (diaSemana < 6) { // ENTRE SEMANA
            if ((horas >= 6) && (horas <= 21) || (horas >= 6) && (horas <= 22) && (minutos == 0)) { //ENTRE SEMANA DÍA
                precioTotal = (kilometros * PRECIO_DIA_LABORAL);
                if (precioTotal < TARIFA_DIURNA) { // COBRO MÍNIMO DÍA
                    precioTotal = TARIFA_DIURNA;
                }
            } else { // ENTRE SEMANA NOCHE
                precioTotal = (kilometros * PRECIO_NOCHE_LABORAL);
                if (precioTotal < TARIFA_NOCTURNA) { // COBRO MÍNIMO NOCHE
                    precioTotal = TARIFA_NOCTURNA;
                }
            }
        } else { // FINES DE SEMANA
            if ((horas >= 6) && (horas <= 21) || (horas >= 6) && (horas <= 22) && (minutos == 0)) { //FINES DÍA
                precioTotal = (kilometros * PRECIO_FINDE);
                if (precioTotal < TARIFA_DIURNA) { // COBRO MÍNIMO DÍA
                    precioTotal = TARIFA_DIURNA;
                }
            } else { // FINES DE SEMANA NOCHE
                precioTotal = (kilometros * PRECIO_FINDE);
                if (precioTotal < TARIFA_NOCTURNA) { // COBRO MÍNIMO NOCHE
                    precioTotal = TARIFA_NOCTURNA;
                }
            }
        }
        return precioTotal;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrHoras;
        int usrMinutos;
        int usrDiaSemana;
        double usrKilometros;

        System.out.print("Cantidad de horas que ha durado su viaje: [00 - 23] ");
        usrHoras = teclado.nextInt();

        if (usrHoras > 23) {
            usrHoras = 0;
            System.out.println("[INTRODUZCA UN NÚMERO VÁLIDO] \n [VALOR POR DEFECTO ESTABLECIDO (0)]");
        }

        System.out.print("Cantidad de minutos que ha durado su viaje: [00 - 59] ");
        usrMinutos = teclado.nextInt();

        if (usrMinutos > 59) {
            usrMinutos = 0;
            System.out.println("[INTRODUZCA UN NÚMERO VÁLIDO] \n [VALOR POR DEFECTO ESTABLECIDO (0)]");
        }

        System.out.print("Día de la semana en la que realizó su viaje: [1 Lunes... 7 Domingo] ");
        usrDiaSemana = teclado.nextInt();
        
        if (usrDiaSemana > 7 || usrDiaSemana < 1) {
            usrDiaSemana = 1;
            System.out.println("[INTRODUZCA UN NÚMERO VÁLIDO] \n [VALOR POR DEFECTO ESTABLECIDO (1)]");
        }
        
        System.out.print("Cantidad de kilometros que recorrió durante su viaje: ");
        usrKilometros = teclado.nextDouble();

        System.out.printf("COSTE TOTAL DEL TRAYECTO: %,.02f€", calculaCosteTrayecto(usrHoras, usrMinutos, usrDiaSemana, usrKilometros));

    }

}
