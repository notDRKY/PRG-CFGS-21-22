package peligroporhielo;

import java.util.Scanner;

public class PeligroPorHielo {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numLecturas; // entre 1 y 1000
        int lectura;
        int pitidos = 0;
        boolean puedePitar = true;
        while((numLecturas = teclado.nextInt()) != 0) {
            for (int i = 0; i < numLecturas; i++) {
                lectura = teclado.nextInt();
                if (lectura <= 4 && puedePitar) {
                    pitidos++;
                    puedePitar = false;
                } else if (lectura > 6) {
                    puedePitar = true;
                }
            }
            System.out.println(pitidos);
            puedePitar = true;
            pitidos = 0;
        }
    }
}
