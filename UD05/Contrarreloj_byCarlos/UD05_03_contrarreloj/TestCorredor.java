/*
2. Diseñar una clase Java TestCorredor que permita probar la clase Corredor y sus
métodos. Para ello se desarrollará el método main en el que:
 */
package UD05_03_contrarreloj;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class TestCorredor {

    public static void main(String[] args) {

//Se crearán dos corredores: El nombre lo indicará el usuario mientras que el
//dorsal se generará utilizando el método generarDorsal() de la clase.
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduzca su nombre del  1º corredor: ");
        String nombre1 = tec.nextLine();
        int dorsal1 = Corredor.generarDorsal();
        Corredor corredor1 = new Corredor(dorsal1, nombre1);

        System.out.println("Introduzca su nombre del  2º corredor: ");
        String nombre2 = tec.nextLine();
        int dorsal2 = Corredor.generarDorsal();
        Corredor corredor2 = new Corredor(dorsal2, nombre2);

        System.out.println("\nLos corredores recién creados son: ");

        System.out.println(corredor1);
        System.out.println(corredor2);

//Se establecerá el tiempo de llegada del primer corredor a 300 segundos y el del
//segundo a 400.
        //Primer corredor
        corredor1.setTiempo(300);
        //Segundo corredor
        corredor2.setTiempo(400);

//Se mostrarán los datos de ambos corredores ( toString )
        System.out.println("\nLos datos de ambos corredores son: ");
        System.out.println(corredor1);
        System.out.println(corredor2);

    }
}
