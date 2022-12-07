/*
6. (Rotaciones) Rotar una posición a la derecha los elementos de un array consiste en mover
cada elemento del array una posición a la derecha. El último elemento pasa a la posición 0
del array. Por ejemplo si rotamos a la derecha el array {1,2,3,4} obtendríamos {4,1,2,3}.

    Diseñar un método public static void rotarDerecha(int[] v) , que dado un array de
    enteros rote sus elementos un posición a la derecha.

    En el método main crearemos e inicializaremos un array y rotaremos sus elementos
    tantas veces como elementos tenga el array (mostrando cada vez su contenido), de
    forma que al final el array quedará en su estado original. Por ejemplo, si inicialmente el
    array contiene {7,3,4,2} , el programa mostrará
    
    1| Rotación 1: 2 7 3 4
    2| Rotación 2: 4 2 7 3
    3| Rotación 3: 3 4 2 7
    4| Rotación 4: 7 3 4 2
    
    Diseña también un método para rotar a la izquierda y pruébalo de la misma forma.
 */
package rotaciones;

public class Rotaciones {

    public static void rotarDerecha(int[] v) {
        int aux = v[v.length - 1];
        for (int i = v.length - 1; i == 0; i--) {
            v[i] = v[i + 1];
        }
    }

    public static void imprimeArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] ejemplo1 = {1, 2, 3, 4};
        int[] ejemplo2 = {7, 3, 4, 2};
        
        imprimeArray(ejemplo1);
        rotarDerecha(ejemplo1);
        imprimeArray(ejemplo1);
        
    }

}
