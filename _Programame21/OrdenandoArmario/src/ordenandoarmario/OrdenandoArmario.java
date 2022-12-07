package ordenandoarmario;

import java.util.Scanner;

public class OrdenandoArmario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean acabar = false;
        int invierno = 0;
        int verano = 0;
        while (!acabar && teclado.hasNext()) {
            switch (teclado.next().toUpperCase().charAt(0)) {
                case 'V':
                    verano++;
                    break;
                case 'I':
                    invierno++;
                    break;
                case 'A':
                    invierno++;
                    verano++;
                    break;
                case '.':
                    if (invierno == 0 && verano == 0) {
                        acabar = true;
                    } else if (invierno > verano) {
                        System.out.println("INVIERNO");
                    } else if (verano > invierno) {
                        System.out.println("VERANO");
                    } else {
                        System.out.println("EMPATE");
                    }
                    invierno = 0;
                    verano = 0;
                    break;
            }
        }
    }
}
