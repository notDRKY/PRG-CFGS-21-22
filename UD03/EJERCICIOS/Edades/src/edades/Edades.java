/*
 * 35. (Edades) Programa que pida al usuario la edad de cinco personas. Si la suma de las edades
 * es inferior a 200, el programa volverá a solicitar las 5 edades.
 */
package edades;

import java.util.Scanner;

public class Edades {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totalEdades;
        
        do {
            totalEdades = 0;

            for (int i = 1; i <= 5; i++) {

                System.out.print("Introduce la edad de persona " + i + ": ");
                totalEdades += teclado.nextInt();
                System.out.println("\t-----[TOTAL EDADES]----- [" + totalEdades + "]\n");

            }
            if (totalEdades < 200) {
                System.out.println("\n________________ [VUELVE A INTRODUCIR LAS EDADES] ________________\n");
            }
        } while (totalEdades < 200);
    }
}

//        Scanner teclado = new Scanner(System.in);
//        int contador = 1;
//        int totalEdades = 0;
//        
//        // BUCLE INICIAL PARA SABER SI SE DEBERÁ REPETIR POSTERIORMENTE O NO
//        do {
//            System.out.print("Introduce la edad de persona " + contador + ": ");
//            totalEdades += teclado.nextInt(); // RECOGE Y ACUMULA LA EDAD INTRODUCIDA POR EL USUARIO
//            
//            System.out.println(" [SUMA EDADES] " + totalEdades); // MUESTRA POR PANTALLA EL TOTAL DE LAS EDADES CONSTANTEMENTE
//
//            contador++;
//        } while (contador <= 5);
//
//        // CONDICIÓN PARA REPETIR O NO EL BUCLE
//        if (totalEdades > 200) {
//            System.out.println("\t[SUMA EDADES] " + totalEdades); // FINAL 1
//        } else {
//            // FUERA DEL IF SI NO BUCLE INFINITO
//            contador = 1;
//            System.out.println("\n\n----- [SUMA EDADES DEBE SER MAYOR DE 200] -----");
//            do {
//                System.out.print("Introduce la edad de persona " + contador + ": ");
//                totalEdades += teclado.nextInt();
//                
//                System.out.println(" [SUMA EDADES] " + totalEdades);
//                contador++;
//                
//            } while (contador <= 5);
//            
//            System.out.println("\t\t[SUMA EDADES] " + totalEdades); // FINAL 2
//        }
