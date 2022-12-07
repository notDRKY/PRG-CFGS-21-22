/*
 * 4. Implemente, tanto de forma recursiva como de forma iterativa, una función que nos
 * devuelva el máximo común divisor de dos números enteros utilizando el algoritmo de
 * Euclides.
 * 
 * 1 | ALGORITMO DE EUCLIDES
 * 2 | Dados dos números enteros positivos m y n, tal que m > n, para encontrar su
 *   | máximo común divisor (es decir, el mayor entero positivo que divide a
 *   | ambos):
 * 3 | - Dividir m por n para obtener el resto r (0 ≤ r < n)
 * 4 | - Si r = 0, el MCD es n.
 * 5 | - Si no, el máximo común divisor es MCD(n,r).
 */
package algoritmo;

public class Algoritmo {

    public static int mcdIterativo(int m, int n) {
        int r;
        do {
            r = m % n;
            m = n;
            n = r;
        } while (r == 0);
        return n;
    }
    
    public static int mcdRecursivo(int m, int n) {
        int r;  // Inicializo la variable resto(r) (no es necesaria)
        r = m % n; // Le doy valor a la variable r calculando el resto entre m & n
        if (r == 0) { // CASO BASE
            return n;
        } else { // CASO RECURSIVO
            return mcdRecursivo(n, r);
        }
    }

    public static void main(String[] args) {
        int m = 86;
        int n = 25;

        System.out.println(mcdIterativo(m, n));
        System.out.println(mcdRecursivo(m, n));
    }

}
