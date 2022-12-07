/*
4. (Clase ContrarReloj ) Realizar un programa que simule una contrarreloj. Para llevar el
control de una carrera contrarreloj se mantienen dos listas de corredores (dos objetos
de tipo ListaCorredores ):
        - ( hanSalido ) Una con los que han salido, que tiene a los corredores por orden
        de salida. El atributo tiempo de estos corredores será 0. Para que los
        corredores se mantengan por orden de salida, se añadiran a la lista utilizando
        el método añadir.
        - ( hanLlegado ) Otra con los corredores que hay llegado a la meta. A medida que
        los corredores llegan a la meta se les extrae de la primera lista, se les asigna un
        tiempo y se les inserta ordenadamente en esta segunda lista.

En el método main realizar un programa que muestre un menú con las siguientes
opciones:
        1. Salida : Para registrar que una corredor ha comenzado la contrarreloj y sale de
        la línea de salida. Solicita al usuario el nombre de un corredor y su dorsal, y lo
        añade a la lista de corredores que han salido.
        2. Llegada : Para registrar que un corredor ha llegado a la meta. Solicita al usuario
        el dorsal de un corredor y el tiempo de llegada. Quita al corredor de la lista de
        corredores que hanSalido , le asigna el tiempo que ha tardado y lo inserta
        (ordenadamente) en la lista de corredores que hanLlegado
        3. Clasificación : Muestra la lista de corredores que hanLlegado . Dado que esta
        lista está ordenada por tiempo, mostrarla por pantalla nos da la clasificación.
        4. Salir : Sale del programa

 */
package UD05_03_contrarreloj;

import java.util.Scanner;

/**
 *
 * @author carboc
 */
public class ContraReloj {

    static ListaCorredores hanSalido = new ListaCorredores();
    static ListaCorredores hanLlegado = new ListaCorredores();

    public static String generarMenu() {
        String resultado = "";
        resultado += "**********************************\n";
        resultado += "*     C O N T R A R R E L O J    *\n";
        resultado += "**********************************\n";
        resultado += "* 1=> Salida                     *\n";
        resultado += "* 2=> Llegada                    *\n";
        resultado += "* 3=> Clasificación              *\n";
        resultado += "* 4=> Salir                      *\n";
        resultado += "**********************************\n";
        resultado += "Elige una opción (1-4): ";
        return resultado;
    }

    public static void menuSalida() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("REGISTRO DE SALIDA:");
        System.out.print("Introduzca el nombre del corredor: ");
        String nombre = teclado.next();
        System.out.printf("Introduzca el dorsal de %s: ", nombre);
        int dorsal = teclado.nextInt();
        try {
            hanSalido.añadir(new Corredor(dorsal, nombre));
        } catch (ListaCorredores.ElementoDuplicadoException ex) {
            System.out.println(
                    "ERROR: Ese dorsal ya ha sido registrado en la salida");
        }
    }

    public static void menuLlegada() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("REGISTRO DE LLEGADA:");
        System.out.print("Introduzca el dorsal del corredor: ");
        int dorsal = teclado.nextInt();
        System.out.printf(
                "Introduzca el tiempo de llegada para el dorsal %d en segundos: ",
                dorsal);
        double tiempo = teclado.nextDouble();
        try {
            Corredor c = hanSalido.quitar(dorsal);
            c.setTiempo(tiempo);
            hanLlegado.insertarOrdenado(c);
        } catch (ListaCorredores.ElementoNoEncontradoException ex) {
            System.out.println(
                    "ERROR: El corredor no esta en la lista de salida");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.print(generarMenu());
        while ((opcion = teclado.nextInt()) != 4) {
            switch (opcion) {
                case 1:
                    menuSalida();
                    System.out.println(generarMenu());
                    break;
                case 2:
                    menuLlegada();
                    System.out.println(generarMenu());
                    break;
                case 3:
                    System.out.println(hanLlegado.toString());
                    System.out.println(generarMenu());
                    break;
                case 9:
                    System.out.println(hanSalido.toString());
                    System.out.println(generarMenu());
                    break;
                default:
                    System.out.println("Opción incorrecta, intentelo de nuevo");
                    System.out.print(generarMenu());
            }
        }
        System.out.println("Ha seleccionado Salir, que pase buen dia!");
    }
}
