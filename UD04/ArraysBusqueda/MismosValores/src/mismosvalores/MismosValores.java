/*
 * 7. (MismosValores) Se desea comprobar si dos arrays de double contienen los mismos valores,
 * aunque sea en orden distinto. Para ello se ha escrito el siguiente método, que aparece
 * incompleto:
 */
package mismosvalores;

public class MismosValores {

    public static boolean mismosValores(double v1[], double v2[]) {
        boolean encontrado = false;                         // BOOLEAN CANDADO, DETENDRÁ EL WHILE
        int i = 0;                                          // CONTADOR DEL WHILE
        while (i < v1.length && !encontrado) {              // MIENTRAS CONTADOR (i) SEA MENOR QUE EL PRIMER ARRAY Y (&&) ENCONTRADO SEA DISTINTO DE FALSE (true)
            boolean encontrado2 = false;                    // DENTRO DEL PRIMER WHILE {SE INICIALIZA LA VARIABLE ENCONTRADO2 COMO FALSE 
            int j = 0;                                      // Y SE INICIALIZA EL CONTADOR (j) A 0}
            while (j < v2.length && !encontrado2) {         // MIENTRAS CONTADOR (j) SEA MENOR QUE EL PRIMER ARRAY Y (&&) ENCONTRADO SEA DISTINTO DE FALSE (true)
                if (v1[i] == v2[j]) {                       // SI LA POSICIÓN i DEL PRIMER ARRAY ES IGUAL (==) QUE LA POSICIÓN j DEL SEGUNDO ARRAY
                    encontrado2 = true;                     //      -> ENCONTRADO2 SERÁ TRUE Y SALDRÁ DEL PRIMER WHILE
                    i++;                                    //      -> CONTADOR (i) SE INCREMENTA
                } else {                                    // SI NO
                    j++;                                    //      -> CONTADOR (j) SE INCREMENTA
                }                                           // 
            }                                               // 
            if (encontrado2 == encontrado) {                // SI ENCONTRADO2 ES IGUAL (==) A ENCONTRADO
                encontrado = true;                          //      -> ENCONTRADO SERÁ TRUE
            }                                               // 
        }                                                   // 
        return !encontrado;                                 // RETURN DISTINTO (!) DE ENCONTRADO
    }

    public static void imprimeArray(double[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        double[] prueba1_1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        double[] prueba1_2 = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        double[] prueba2_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] prueba2_2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        double[] prueba3_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] prueba3_2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        imprimeArray(prueba1_1);
        imprimeArray(prueba1_2);
        System.out.println(mismosValores(prueba1_1, prueba1_2));
        System.out.println("_____________________________________");
        imprimeArray(prueba2_1);
        imprimeArray(prueba2_2);
        System.out.println(mismosValores(prueba2_1, prueba2_2));
        System.out.println("_____________________________________");
        imprimeArray(prueba3_1);
        imprimeArray(prueba3_2);
        System.out.println(mismosValores(prueba3_1, prueba3_2));
    }

}
