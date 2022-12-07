/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lluvias;

import java.io.File;
import java.util.Scanner;

public class Lluvias {

    

    //el número máximo de posiciones del array suele ser una constante
    final static int MAX_LLUVIAS = 31;
    //declaramos el Array lluvias
    static double[] lluvias = new double[MAX_LLUVIAS];
    /*
     * 1. `public static void leerArray(double v[], String nombreFichero)`, que
     * rellena el array v con datos que se encuentran en el fichero
     * especificado. El número de datos a leer vendrá determinado por el tamaño
     * del array y no por la cantidad de datos que hay en el fichero
     */
    public static void leerArray(double v[], String nombreFichero) {
        //indice para recorrer el array.
        int indice = 0;
        try {
            //indicamos el archivo a abrir
            File arxiu = new File(nombreFichero);

            //Creamos els Scanner desde el fichero en lugar de desde System.in
            Scanner input = new Scanner(arxiu);

            //Mientras haya lineas las vamos leyendo
            while (indice < MAX_LLUVIAS) {
                double lluvia_dia = input.nextDouble();
                v[indice] = lluvia_dia;
                indice++;
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /*
     * 2. `public static double suma(double v[])`, que devuelve la suma de los
     * elementos del array v
     */
    public static double suma(double v[]) {
        double acumuladorSuma = 0;
        for (int i = 0; i < v.length; i++) {
            acumuladorSuma += v[i];
        }
        return acumuladorSuma;
    }

    /*
     * 3. `public static double media(double v[])`, que devuelve la media de los
     * elementos del array v. Se puede hacer uso del método del apartado
     * anterior.
     */
    public static double media(double v[]) {
        double media = 0;
        for (int i = 0; i <= 31; i++) {
            media = suma(v) / MAX_LLUVIAS;
        }
        return media;
    }

    /*
     * 4. `public static int contarMayorQueMedia(double v[])`, que devuelve la
     * cantidad de elementos del array v que son mayores que la media. Se puede
     * hacer uso del método del apartado anterior.
     */
//    public static int contarMayorQueMedia(double v[]) {
//    }

    /*
     * 5. `public static double minimo(double v[])`, que devuelve el valor más
     * grande almacenado en el array v.
     */
    public static double maximo(double v[]) {
        double maximo = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > maximo) {
                maximo = v[i];
            }
        }
        return maximo;
    }

    /*
     * 6. `public static double mínimo(double v[])`, que devuelve el valor más
     * pequeño almacenado en el array v.
     */
    public static double minimo(double v[]) {
        double minimo = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] < minimo) {
                minimo = v[i];
            }
        }
        return minimo;
    }

    /*
     * 7. `public static int posMinimo(double v[])`, que devuelve la posición
     * del elemento más grande de v. Si éste se repite en el array es suficiente
     * devolver la posición en que aparece por primera vez.
     */
    public static int posMaximo(double v[]) {
        int posMaximo = 0;
        double maximo = 0;
        for (int i = 0; i <= 31; i++) {
            if (v[i] > posMaximo) {
                posMaximo = i;
                maximo = v[i];
            }
        }
        return posMaximo;
    }

    /*
     * 8. `public static int posMinimo(double v[])`, que devuelve la posición
     * del elemento más pequeño de v. Si éste se repite en el array es
     * suficiente devolver la posición en que aparece por primera vez.
     */
    public static int posMinimo(double v[]) {
        int posMinimo = 999;
        for (int i = 0; i <= 31; i++) {
            if (v[i] < posMinimo) {
                posMinimo = i;
            }
        }
        return posMinimo;
    }

    /*
     * 9. `public static int contarApariciones(double v[], double x)`, que
     * devuelve el número de veces que el valor *x* aparece en el array v.
     */
//    public static int contarApariciones(double v[], double x) {
//    }

    /*
     * 10. `public static double sumaParcial(double v[], int izq, der)`, que
     * devuelve la suma de los elementos del array v que están entre las
     * posiciones *izq* y *der.*
     */
    public static double sumaParcial(double v[], int izq, int der) {
        double suma = 0;
        for (int i = izq; i <= der; i++) {
            suma += v[i];
        }
        return suma;
    }

    /*
     * 11. `public static int menoresQueElSiguiente(double v[])`, que devuelve
     * el número de elementos de v que son menores que el elemento que tienen a
     * continuación.
     */
//    public static int menoresQueElSiguiente(double v[]) {
//    }

    public static void main(String[] args) {
        
        leerArray(lluvias, "C:\\Users\\Soldi\\Desktop\\DAW\\PR\\UD04\\lluviasenero.txt");
//        System.out.format("La suma de las lluvias es %.2f litros\n", suma(lluvias));
//        System.out.format("La media de las lluvias es %.2f litros\n", media(lluvias));
        System.out.format("La máxima de las lluvias es %.2f litros\n", maximo(lluvias));
//        System.out.format("La máxima de las lluvias fué el dia %d\n", posMaximo(lluvias) + 1);
        System.out.format("La mínima de las lluvias es %.2f litros\n", minimo(lluvias));
//        System.out.format("La mínima de las lluvias fué el dia %d\n", posMinimo(lluvias) + 1);
        //System.out.format("Ha habido un total de %d dias sin lluvia\n", contarApariciones(lluvias, 0.0));
        //System.out.format("Ha habido un total de %d dias en los que la lluvia ha superado la media\n", contarMayorQueMedia(lluvias));
//        double quincena1 = sumaParcial(lluvias, 0, 14);
//        double quincena2 = sumaParcial(lluvias, 15, 30);
//        System.out.format("La %s quincena ha llovido más que la otra\n", (quincena1 >= quincena2) ? "primera" : "segunda");
        //System.out.format("Ha habido %d dias en los que ha llovido menos que el dia siguiente\n", menoresQueElSiguiente(lluvias));
    }
}
