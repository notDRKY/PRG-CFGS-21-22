/*
 * 1. (package Varios) Diseñar la clase Varios con los siguientes métodos estáticos que se
 * harán apoyándose en alguna clase de las vistas al estudiar las colecciones de Java:
 *
 *      int[] quitarDuplicados (int v[]) , que dado un array de enteros devuelva
 *      otro array con los mismos valores que el original pero sin duplicados.
 *
 *      int[] unión1(int v1[], int v2[]) , que dados dos arrays v1 y v2 devuelva otro
 *      array con los elementos que están en v1 o que están en v2, sin que ningún
 *      elemento se repita.
 *
 *      int[] unión2(int v1[], int v2[]) , que dados dos arrays v1 y v2 devuelva otro
 *      array con los elementos que están en v1 o que están en v2. En este caso, si hay
 *      elementos duplicados se mantendrán.
 *
 *      int[] intersección(int v1[], int v2[]) , que dados dos arrays v1 y v2
 *      devuelva otro array con los elementos que aparecen en los dos arrays. Cada
 *      elemento común aparecerá una sola vez en el resultado.
 *
 *      int[] diferencia1 (int v1[], int v2[]) , que dados dos arrays v1 y v2
 *      devuelva otro array con los elementos que de v1 que no están en v2. En caso
 *      de haber elementos duplicados en v1 estos se mantendrán en el resultado.
 *
 *      int[] diferencia2 (int v1[], int v2[]) , que dados dos arrays v1 y v2
 *      devuelva otro array con los elementos que de v1 que no están en v2. El array
 *      resultante no tendrá elementos duplicados.
 *
 */
package varios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Varios {

    static int[] quitarDuplicados(int v[]) {
        /*
         * ArrayList<Integer> duplicados = new ArrayList<>(); for (int numero :
         * v) { if (!duplicados.contains(numero)) { duplicados.add(numero); } }
         *
         * int[] nuevoArray = new int[duplicados.size()];
         *
         * for (int i = 0; i < duplicados.size(); i++) { nuevoArray[i] =
         * duplicados.get(i); } return nuevoArray;
         *
         */
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        int i = 0;

        for (int numero : v) {
            numeros.add(numero);
        }

        int[] nuevoArray = new int[numeros.size()];

        for (Integer num : numeros) {
            nuevoArray[i++] = num;
        }
        return nuevoArray;
    }

    // List<Integer> lista =  Arrays.stream(v).boxed().toList();
    static int[] union1(int v1[], int v2[]) {
        // Variable que usaremos para saber la posición en el array del contenido de las Listas Set
        int i = 0;
        LinkedHashSet<Integer> listaArray1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> listaArray2 = new LinkedHashSet<>();

        // Recorremos el vector v1 y añadimos su contenido a la LinkedHashList ListaArray1
        for (int num : v1) {
            listaArray1.add(num);
        }

        // Recorremos el vector v2 y añadimos su contenido a la LinkedHashList ListaArray2
        for (int num : v2) {
            listaArray2.add(num);
        }

        // Añadimos todos los elementos de listaArray2 a listaArray1 sin duplicados
        listaArray1.addAll(listaArray2);

        // Creamos el array con el tamaño de la listaArray1
        int[] nuevoArray = new int[listaArray1.size()];

        // Recorremos listaArray1 añadiendo los elementos a nuevoArray(vetor)
        for (Integer num : listaArray1) {
            nuevoArray[i++] = num;
        }

        return nuevoArray;
    }

    static int[] union2(int v1[], int v2[]) {
        int i = 0;
        ArrayList<Integer> listaArray1 = new ArrayList<>();
        //ArrayList<Integer> listaArray2 = new ArrayList<>();

        for (int num : v1) {
            listaArray1.add(num);
        }

        for (int num : v2) {
            listaArray1.add(num);
        }

        //listaArray1.addAll(listaArray2);

        int[] nuevoArray = new int[listaArray1.size()];

        for (Integer num : listaArray1) {
            nuevoArray[i++] = num;
        }

        return nuevoArray;
    }

    static int[] interseccion(int v1[], int v2[]) {
        int i = 0;
        LinkedHashSet<Integer> listaArray1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> listaArray2 = new LinkedHashSet<>();

        for (int num : v1) {
            listaArray1.add(num);
        }

        for (int num : v2) {
            listaArray2.add(num);
        }

        listaArray1.retainAll(listaArray2);

        int[] nuevoArray = new int[listaArray1.size()];

        for (Integer num : listaArray1) {
            nuevoArray[i++] = num;
        }

        return nuevoArray;
    }

    static int[] diferencia1(int v1[], int v2[]) {
        int i = 0;
        ArrayList<Integer> listaArray1 = new ArrayList<>();
        ArrayList<Integer> listaArray2 = new ArrayList<>();

        for (int num : v1) {
            listaArray1.add(num);
        }

        for (int num : v2) {
            listaArray2.add(num);
        }

        listaArray1.removeAll(listaArray2);

        int[] nuevoArray = new int[listaArray1.size()];

        for (Integer num : listaArray1) {
            nuevoArray[i++] = num;
        }

        return nuevoArray;
    }

    static int[] diferencia2(int v1[], int v2[]) {
        int i = 0;
        LinkedHashSet<Integer> listaArray1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> listaArray2 = new LinkedHashSet<>();

        for (int num : v1) {
            listaArray1.add(num);
        }

        for (int num : v2) {
            listaArray2.add(num);
        }

        listaArray1.removeAll(listaArray2);

        int[] nuevoArray = new int[listaArray1.size()];

        for (Integer num : listaArray1) {
            nuevoArray[i++] = num;
        }

        return nuevoArray;
    }

    public static void main(String[] args) {
        int[] v1 = {9, 19, 7, 5, 9};
        int[] v2 = {10, 20, 5, 7, 8};
        int[] duplicados = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
        System.out.println("---------------------------------------------");
        System.out.println("ARRAY V1:\t\t" + Arrays.toString(v1));
        System.out.println("ARRAY V2:\t\t" + Arrays.toString(v2));
        System.out.println("ARRAY DUPLICADOS:\t" + Arrays.toString(duplicados));;
        System.out.println("---------------------------------------------");
        System.out.println("quitarDuplicados(duplicados) |\t" + Arrays.toString(quitarDuplicados(duplicados)));
        System.out.println("union1(v1[], v2[]) |\t\t" + Arrays.toString(union1(v1, v2)));
        System.out.println("union2(v1[], v2[]) |\t\t" + Arrays.toString(union2(v1, v2)));
        System.out.println("interseccion(int v1[], int v2[]) |\t" + Arrays.toString(interseccion(v1, v2)));
        System.out.println("diferencia1(int v1[], int v2[]) |\t\t" + Arrays.toString(diferencia1(v1, v2)));
        System.out.println("diferencia2(int v1[], int v2[]) |\t\t" + Arrays.toString(diferencia2(v1, v2)));
    }
}
