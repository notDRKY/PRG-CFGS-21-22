/*
 * 6. (Subsecuencia) Escribir un método que, dado un array, determine la posición de la primera
 * subsecuencia del array que comprenda al menos tres números enteros consecutivos en
 * posiciones consecutivas del array. De no existir dicha secuencia devolverá -1.
 * 
 *      Por ejemplo: en el array {23, 8, 12, 6, 7, 9, 10, 11, 2} hay 3 números consecutivos en tres
 *      posiciones consecutivas, a partir de la posición 5: {9,10,11}
 */
package subsecuencia;

public class Subsecuencia {
    
    public static int esSubsecuencia(int[] v) {
        for (int i = 0; i < (v.length - 2); i++) {
            if (v[i] == v[i + 1] - 1 && v[i + 1] == v[i + 2] - 1) {
                return i;
            }
        }
        return -1;
    }
    
    public static void imprimeArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] prueba1 = {23, 8, 12, 6, 7, 9, 10, 11, 2};
        int[] prueba2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] prueba3 = {4, 6, 1, 5, 7, 2, 7, 6, 7, 8};
        int[] prueba4 = {4, 5, 8, 102, 43, 40, 99, 100};
        
        imprimeArray(prueba1);
        imprimeArray(prueba2);
        imprimeArray(prueba3);
        imprimeArray(prueba4);
        System.out.println("________________________________________");
        System.out.println(esSubsecuencia(prueba1));
        System.out.println(esSubsecuencia(prueba2));
        System.out.println(esSubsecuencia(prueba3));
        System.out.println(esSubsecuencia(prueba4));
    }
    
}
