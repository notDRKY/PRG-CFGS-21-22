/*
 * 7. Repte 7: l’ús de comptadors i acumuladors no és excloent, sinó que pot ser complementari. Penseu com
 * es podria modificar el programa per calcular el resultat del mòdul i la divisió entera alhora. Recordeu que
 * la divisió entera simplement seria comptar quantes vegades s’ha pogut restar el divisor.
 */
package modul;

import java.util.Scanner;

public class Modul {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int cocient = 0;
        
        System.out.print("Quin és el dividend? ");
        int dividend = lector.nextInt();
        lector.nextLine();
        
        System.out.print("Quin és el divisor? ");
        int divisor = lector.nextInt();
        lector.nextLine();
        
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            System.out.println("Bucle: per ara el dividend val " + dividend + ".");
            cocient++;
        }
        
        System.out.println("El resultat final és " + dividend + ".");
        System.out.println("El resultat final del cocient és " + cocient + ".");
    }
}
