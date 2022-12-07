/*
 * 61. Dados tres enteros a, b y c, y un booleano p, el siguiente análisis por casos establece el valor de p en
 * función de los valores de a, b y c:
 * 
 *     si a > b entonces p = cierto;
 *     si a < b entonces p = falso;
 *     si a = b entonces
 *         si a > c entonces p = cierto;
 *         si a < c entonces p = falso;
 *         si a = c entonces p = falso;
 * 
 *      Se pide la traducción de dicho análisis por casos a Java mediante:
 *      Una única instrucción if sin anidamientos.
 *      Una única instrucción, de la forma p = ... , sin sentencias if ni utilizar el operador ternario.
 *      Una única instrucción, de la forma p = ..., que utilice el operador ternario.
 * 
 */
package papel61;

public class Papel61 {
    
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        boolean p;
        
        if ((a > b) || (a == b) && (a > c)) {
            p = true;
        } else {
            p = false;
        }
    }
}
