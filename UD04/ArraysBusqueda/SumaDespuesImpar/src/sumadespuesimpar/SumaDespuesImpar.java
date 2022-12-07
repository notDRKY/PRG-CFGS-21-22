/*
 * 3. (SumaDespuesImpar) Escribir un método que, dado un array de enteros, devuelva la suma
 * de los elementos que aparecen tras el primer valor impar. Usar main para probar el método.
 */
package sumadespuesimpar;

public class SumaDespuesImpar {

    public static int devuelveSumaArrayImpar(int[] a) {
        int totalSuma = 0;
        int pos = 0;
        boolean primerImpar = false;
        // Primer bucle para encontrar el impar
        for (int i = 0; i < a.length && !primerImpar; i++) {
            //Guardo la posición del impar y salgo del bucle
            if ((a[i] % 2) != 0) {
                pos = i;
                primerImpar = true;
            }
        }
        // Realizo otro bucle sumando a partir de la posición guardada.
        if (primerImpar) {
            for (int j = pos; j < a.length; j++) {
                totalSuma += a[j];
            }
        }

        return totalSuma;
    }

    public static void imprimeArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] arraySumale = {0, 2, 4, 6, 8, 10, 2};
        int totalSuma;

        imprimeArray(arraySumale);
        totalSuma = devuelveSumaArrayImpar(arraySumale);
        System.out.println(totalSuma);
    }

}
