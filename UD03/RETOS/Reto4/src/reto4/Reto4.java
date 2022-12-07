/*
 * 4. Repte 4: apliqueu el mateix tipus de control sobre les dades de l’entrada de l'exemple
 * següent a l'exercici del repte 1.
 *      import java.util.Scanner;
 * 
 *      public class EndevinaControlErrorsEntrada {
 * 
 *          public static final int VALOR_SECRET = 4;
 * 
 *          public static void main(String[] args) {
 *              Scanner lector = new Scanner(System.in);
 *              System.out.println("Comencem el joc.");
 *              System.out.print("Endevina el valor enter, entre 0 i 10: ");
 *              boolean tipusCorrecte = lector.hasNextInt();
 *              if (tipusCorrecte) {
 *              //S’ha escrit un enter correctament. Ja es pot llegir.
 *                  int valorUsuari = lector.nextInt();
 *                  lector.nextLine();
 *                  if (VALOR_SECRET == valorUsuari) {
 *                      System.out.println("Exacte! Era " + VALOR_SECRET + ".");
 *                  } else {
 *                      System.out.println("T’has equivocat!");
 *                  }
 *                  System.out.println("Hem acabat el joc.");
 *              } else {
 *                  //No s’ha escrit un enter.
 *                  System.out.println("El valor introduït no és un enter.");
 *              }
 *          }
 *      }
 *  }
 */
package reto4;

import java.util.Scanner;

public class Reto4 {

    public static final float DESCOMPTE = 8;
    public static final float COMPRA_MIN = 100;

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.print("Quin és el preu del producte, en euros? ");
        boolean tipusCorrecte = lector.hasNextFloat();
        if (tipusCorrecte) {
            // Se ha escrit un float correctament.
            float preu = lector.nextFloat();
            if (preu >= COMPRA_MIN) {
                float descompteFet = preu * DESCOMPTE / 100;
                preu = preu - descompteFet;
            }
            System.out.println("El preu final per pagar és de " + preu + " euros.");
        } else {
            // No se ha escrit un enter.
            System.out.println("El valor introduït no és un float.");
        }
    }
}
