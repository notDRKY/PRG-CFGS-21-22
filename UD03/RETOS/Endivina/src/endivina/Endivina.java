/*
 * 2. Repte 2: modifiqueu el programa perquè, en lloc d’un únic valor secret, n’hi hagi dos. Per guanyar, només
 * cal encertar-ne un dels dos. La condició lògica que us caldrà ja no es pot resoldre amb una expressió
 * composta per una única comparació. Serà més complexa.
 */
package endivina;

import java.util.Scanner;

public class Endivina {

    public static final int VALOR_SECRET1 = 2;
    public static final int VALOR_SECRET2 = 7;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Comencem el joc.");
        System.out.print("Endevina el valor enter, entre 0 i 10: ");

        int valorUsuari = teclado.nextInt();
        teclado.nextLine();

        switch (valorUsuari) {
            case VALOR_SECRET1 -> System.out.println("Exacte! Era " + VALOR_SECRET1 + ".");
            case VALOR_SECRET2 -> System.out.println("Exacte! Era " + VALOR_SECRET2 + ".");
            default -> System.out.println("T’has equivocat!");
        }

        System.out.println("Hem acabat el joc.");
    }
}
