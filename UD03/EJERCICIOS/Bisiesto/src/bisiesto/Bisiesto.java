/*
 * 9. (Bisiesto) Escribir un programa que determine si un año introducido por teclado es o no
 * bisiesto. Un año es bisiesto si es múltiplo de 4 (por ejemplo 1984). Sin embargo, los años
 * múltiplos de 100 no son bisiestos, salvo que sean múltiplos de 400, en cuyo caso si lo son
 * (por ejemplo 1800 no es bisiesto y 2000 si lo es). Para hacer el programa, implementa un
 * método dentro de la clase que reciba un año y devuelva true si el año es bisiesto y false en
 * caso de que no los sea.
 */
package bisiesto;

import java.util.Scanner;

public class Bisiesto {

    public static boolean anoBisiesto(int ano) {
        boolean aux = true;
        
        if ((ano % 4) == 0) {
            if ((ano % 100) == 0) {
                if ((ano % 400) == 0) {
                    aux = true;
                } else {
                    aux = false;
                }
            } else{
                aux = true;
            }
        } else {
            aux = false;
        }
        return aux;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum;
        
        System.out.print("Introduce un año: ");
        usrNum = teclado.nextInt();
        System.out.println("El año es bisiesto: [" + anoBisiesto(usrNum) + "]");
        
    }

}
