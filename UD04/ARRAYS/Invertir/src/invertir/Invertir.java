/*
 * 4. (Invertir) Diseñar un método public static int[] invertirArray(int[] v) , que dado un
 * array v devuelva otro con los elementos en orden inverso. Es decir, el último en primera
 * posición, el penúltimo en segunda, etc.
 * Desde el método main crearemos e inicializaremos un array, llamaremos a invertirArray y
 * mostraremos el array invertido.
 * NOTA: Puede ser útil un método que imprima por pantalla un Array public static void
 * imprimirArray(int[] v) , y así poder imprimir el Array i
 */
package invertir;

public class Invertir {
    
    public static int[] invertirArray(int[] v) {
        int[] arrayInverso = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            arrayInverso[i] = v[(v.length -1) -i];
        }
        return arrayInverso;
    }
    
    public static void imprimeArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] arrayV = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayInverso;
        
        imprimeArray(arrayV);
        arrayInverso = invertirArray(arrayV);
        imprimeArray(arrayInverso);   
    }
}
