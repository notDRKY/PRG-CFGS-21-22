/*
 * 24. (Etapas) El ser humano pasa por una serie de etapas en su vida que, con carácter general se asocian a las
 * edades que aparecen en la tabla siguiente.
 * 
 *         |        INFANCIA        |   Hasta los 10 años          |
 *         |        PUBERTAD        |   De 11 a 14 años            |
 *         |        ADOLESCENCIA    |   De 15 a 21 años            |
 *         |        ADULTEZ         |   De 22 a 55 años            |
 *         |        VEJEZ           |   De 55 a 70 años            |
 *         |        ANCIANIDAD      |   A partir de los 71 años    |
 * 
 * Escribe un programa en el que el usuario introduzca las edades de una serie de personas y calcule y
 * muestre que porcentaje de personas que se encuentran en cada etapa. En primer lugar el programa
 * pedirá el número de personas que participan en la muestra y a continuación solicitará la edad de cada
 * una de ellas. El resultado será similar al siguiente:
 *         
 *         1 | Infancia        5.3%
 *         2 | Pubertad        10.7%
 *         3 | Adolescencia    21.2%
 *         4 | . . .
 */
package etapas;

import java.util.Scanner;

public class Etapas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad;
        int contador = 1;
        double calculo;
        double infancia = 0, pubertad = 0, adolescencia = 0, adultez = 0, vejez = 0, ancianidad = 0;

        do {
            System.out.print("Persona " + contador + ": ");
            edad = teclado.nextInt();

            if (edad < 0) {

            } else {
                if (edad <= 10) {
                    System.out.println("\t-----> [INFANCIA]");
                    infancia++;
                } else if (edad <= 14) {
                    System.out.println("\t-----> [PUBERTAD]");
                    pubertad++;
                } else if (edad <= 21) {
                    System.out.println("\t-----> [ADOLESCENCIA]");
                    adolescencia++;
                } else if (edad <= 55) {
                    System.out.println("\t-----> [ADULTEZ]");
                    adultez++;
                } else if (edad <= 70) {
                    System.out.println("\t-----> [VEJEZ]");
                    vejez++;
                } else {
                    System.out.println("\t-----> [ANCIANIDAD]");
                    ancianidad++;
                }

                contador++;
            }

        } while (edad >= 0);
        contador--; // Se resta porque cuenta el número negativo para cortar la cadena

        if (infancia > 0) {
            calculo = ((infancia / contador) * 100);
            System.out.println("| Infancia \t" + calculo + "%|");
        } else {
            
        }
        if (pubertad > 0) {
            calculo = ((pubertad / contador) * 100);
            System.out.println("| Pubertad \t" + calculo + "%|");
        } else {
            
        }
        if (adolescencia > 0) {
            calculo = ((adolescencia / contador) * 100);
            System.out.println("| Adolescencia \t" + calculo + "%|");
        } else {
            
        }
        if (adultez > 0) {
            calculo = ((adultez / contador) * 100);
            System.out.println("| Adultez \t" + calculo + "%|");
        } else {
            
        }
        if (vejez > 0) {
            calculo = ((vejez / contador) * 100);
            System.out.println("| Vejez \t" + calculo + "%|");
        } else {
            
        }
        if (ancianidad > 0) {
            calculo = ((ancianidad / contador) * 100);
            System.out.println("| Ancianidad \t" + calculo + "%|");
        } else {
            
        }
    }
}
