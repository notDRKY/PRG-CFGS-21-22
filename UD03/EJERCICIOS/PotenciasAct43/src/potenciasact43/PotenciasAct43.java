/*
 * 43. Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia. (sin
 * usar Math )
 */
package potenciasact43;

import java.util.Scanner;

public class PotenciasAct43 {
    
    public static int calculaPotencia(int base, int exponente) {
        int resultado = 1;

        for(int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrBase = 0;
        int usrExponente = 0;
        
        System.out.println("___CALCULA POTENCIAS___");
        System.out.print("Introduce la base: ");
        usrBase = teclado.nextInt();
        System.out.print("Introduce el exponente: ");
        usrExponente = teclado.nextInt();
        
        System.out.println("La potencia es: " + calculaPotencia(usrBase, usrExponente));
    }
    
}
