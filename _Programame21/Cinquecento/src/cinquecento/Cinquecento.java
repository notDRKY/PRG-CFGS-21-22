package cinquecento;

import java.util.Scanner;

public class Cinquecento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int repeticiones = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < repeticiones; i++) {
            // //https://programmerclick.com/article/53111168467/
            int ano = teclado.nextInt();
            System.out.println((ano + 99) / 100);
        }
    }
}
