/*
 * 7. (DosArrays) Desarrolla los siguientes métodos en los que intervienen dos arrays y pruébalos
 * desde el método main
 * 
 *      public static double[] sumaArraysIguales (double[] a, double[] b) que dados dos
 *      arrays de double a y b , del mismo tamaño devuelva un array con la suma de los
 *      elementos de a y b , es decir, devolverá el array {a[0]+b[0], a[1]+b[1], ....}
 * 
 *      public static double[] sumaArrays(double[] a, double[] b) . Repite el ejercicio
 *      anterior pero teniendo en cuenta que a y b podrían tener longitudes distintas. En tal
 *      caso el número de elementos del array resultante coincidirá con la longitud del array de
 *      mayor tamaño.
 */
package dosarrays;

public class DosArrays {

    public static double[] sumaArrays(double[] a, double[] b) {
        double[] x = new double[Math.max(a.length, b.length)];

        if (a.length > b.length) {
            for (int i = 0; i < Math.min(a.length, b.length); i++) {
                x[i] += b[i];
            }
            for (int i = 0; i < Math.max(a.length, b.length); i++) {
                x[i] += a[i];
            }
        } else {
            for (int i = 0; i < Math.min(a.length, b.length); i++) {
                x[i] += a[i];
            }
            for (int i = 0; i < Math.max(a.length, b.length); i++) {
                x[i] += b[i];
            }
        }

        return x;
    }

    public static double[] sumaArraysIguales(double[] a, double[] b) {
        double[] x = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            x[i] = a[i] + b[i];
        }

        return x;
    }

    public static void imprimeArray(double[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        double[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] b = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        double[] x;
        double[] a2 = {1, 2, 3, 4, 5, 6, 7};
        double[] b2 = {1, 2, 3, 4, 5};
        double[] x2;

        System.out.println("_____PRIMERA FASE_____");
        imprimeArray(a);
        imprimeArray(b);
        x = sumaArraysIguales(a, b);
        imprimeArray(x);

        System.out.println("_____SEGUNDA FASE_____");
        imprimeArray(a2);
        imprimeArray(b2);
        x2 = sumaArrays(a2, b2);
        imprimeArray(x2);
    }

}
