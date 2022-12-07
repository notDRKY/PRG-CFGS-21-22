package matrices;

public class matrices {

    public static int[][] recortar(int m[][]) {
        /* 
        Este método tiene que tener en cuenta que parte de la matriz es más grande
        para realizar un recorrido u otro, a mi solo me funciona cuando las filas son
        mayores que las columnas, también creo un array que el número mínimo de la
        longitud de la matriz, y así me ahorro un bucle que la recorra. 
        Lo único que hay que saber es que dirreción tienes que mover el array para
        poder poner los valores correctamente.
         */
        int menor = 0;

        menor = Math.min(m.length, m[0].length);

        int[][] mRecortado = new int[menor][menor];

        if (m.length < m[0].length) {
            for (int filas = 0; filas < mRecortado.length; filas++) {
                mRecortado[filas] = m[filas];
                for (int columnas = 0; columnas < mRecortado[filas].length; columnas++) {
                    mRecortado[filas][columnas] = m[filas][columnas];
                }
            }
        } else {
            for (int columnas = 0; columnas < mRecortado[0].length; columnas++) {
                mRecortado[columnas] = m[columnas];
                for (int filas = 0; filas < mRecortado.length; filas++) {
                    mRecortado[columnas][filas] = m[columnas][filas];
                }
            }
        }
        return mRecortado;
    }
    
    

    public static void imprimirMatriz(int[][] m) {
        /*
        Recorro e imprimo el contenido de la matriz que se nos pasa por parametro.
         */
        for (int[] m1 : m) {
            System.out.println("");
            for (int columnas = 0; columnas < m1.length; columnas++) {
                System.out.print(m1[columnas]);
            }
        }
    }

    public static void main(String[] args) {
        // Declaración y inicianción de matrices ejemplo:
        int[][] m1 = {
            {1, 2, 8, 4, 2},
            {5, 2, 4, 9, 5}};

        int[][] m2 = {
            {1, 2, 8},
            {7, 2, 4},
            {3, 6, 9},
            {1, 5, 8}};

        int[][] m3 = {
            {1, 2, 8},
            {7, 2, 4},
            {3, 6, 9},
            {1, 5, 8},
            {1, 1, 1},
            {1, 1, 1}};

        int[][] m4 = {
            {1, 2, 8, 4, 2},
            {5, 2, 4, 9, 5},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1}};

        int[][] m5 = {
            {1, 2, 8, 4, 2},
            {5, 2, 4, 9, 5},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1}};

        imprimirMatriz(m1);
        imprimirMatriz(m2);
        imprimirMatriz(m3);
        imprimirMatriz(m4);
        imprimirMatriz(m5);
        System.out.println("");

        m1 = recortar(m1);
        m2 = recortar(m2);
        m3 = recortar(m3);
        m4 = recortar(m4);
        m5 = recortar(m5);

        System.out.println("_____RESULTADO MATRIZ 1_____");
        imprimirMatriz(m1);
        System.out.println("_____RESULTADO MATRIZ 2_____");
        imprimirMatriz(m2);
        System.out.println("_____RESULTADO MATRIZ 3_____");
        imprimirMatriz(m3);
        System.out.println("_____RESULTADO MATRIZ 4_____");
        imprimirMatriz(m4);
        System.out.println("_____RESULTADO MATRIZ 5_____");
        imprimirMatriz(m5);
    }
}
