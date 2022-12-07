package mensajespace;

import java.util.Scanner;

public class MensajeSpace {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int repeticiones = 0;
        int repeticionesNombres = 0;
        String letras = "";
        String frase = "";
        char[] columna1;
        char[] columna2;
        char[] columna3;

        repeticiones = teclado.nextInt();
        for (int i = 0; i <= repeticiones; i++) {

            repeticionesNombres = teclado.nextInt();

            if ((repeticionesNombres > 0) && (repeticionesNombres <= 20)) {
                columna1 = new char[repeticionesNombres];
                columna2 = new char[repeticionesNombres];
                columna3 = new char[repeticionesNombres];
                
                for (int j = 0; j < (repeticionesNombres); j++) {
                    letras = teclado.nextLine();
                    columna1[j] = letras.charAt(0);
                    columna2[j] = letras.charAt(1);
                    columna3[j] = letras.charAt(2);
                }

                for (int x = 0; x < (repeticionesNombres); x++) {
                    System.out.println(columna1[x]);
                }
                for (int x = 0; x < (repeticionesNombres); x++) {
                    System.out.println(columna2[x]);
                }
                for (int x = 0; x < (repeticionesNombres); x++) {
                    System.out.println(columna3[x]);
                }
            }
        }
    }
}
