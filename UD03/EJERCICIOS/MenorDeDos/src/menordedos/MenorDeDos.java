/*
 * 1. (MenorDeDos) Escribir un programa que muestre el menor de dos números enteros introducidos por
 * teclado.
 */
package menordedos;

import java.util.Scanner;

public class MenorDeDos {
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int usrNum1, usrNum2;
        System.out.format("Introduce el primer numero: ");
        usrNum1 = teclado.nextInt();
        System.out.format("Introduce el segundo numero: ");
        usrNum2 = teclado.nextInt();
        
        if (usrNum1 > usrNum2){
            System.out.println("El numero: " + usrNum1 
                    + " es mayor que: " + usrNum2);
        }else {
            System.out.println("El numero " + usrNum2 
                    + " es mayor que " + usrNum1);
        }
        
    }
    
}
