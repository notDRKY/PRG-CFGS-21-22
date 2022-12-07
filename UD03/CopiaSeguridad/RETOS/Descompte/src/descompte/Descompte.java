/*
 * 1. Repte 1: modifiqueu el programa perquè, en lloc de fer un descompte del 8% si la compra és de 100 € o
 * més, apliqui una penalització de 2 € si el preu és inferior a 30 €.
 */
package descompte;

import java.util.Scanner;

//Un programa que calcula descomptes.
public class Descompte {

    public static final float PENALITZACIO= 2;
    public static final float COMPRA_MIN = 30;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Quin és el preu del producte, en euros? ");
        float preu = lector.nextFloat();
        lector.nextLine();
        if (preu < COMPRA_MIN) {
            float penalitzacioAplicada = preu + PENALITZACIO;
            preu = penalitzacioAplicada;
        }
        System.out.println("El preu final per pagar és de " + preu + " euros.");
    }
}
