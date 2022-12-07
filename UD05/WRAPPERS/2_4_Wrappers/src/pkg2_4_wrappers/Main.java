/*
 * 4. Introducir por teclado dos valores numéricos enteros y la operación que queremos
 * realizar ( suma , resta o multiplicación ). Realizar la operación y mostrar el resultado en
 * Binario , Hexadecimal y Octal .
 */
package pkg2_4_wrappers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int operacion = 0;
        int vlr1 = 0;
        int vlr2 = 0;
        int vlr3 = 0;
        int resultado = 0;
        
        System.out.println("Introduce tres valores númericos enteros: ");
        System.out.print("Valor 1: ");
        vlr1 = teclado.nextInt();
        System.out.print("Valor 2: ");
        vlr2 = teclado.nextInt();
        System.out.print("Valor 3: ");
        vlr3 = teclado.nextInt();
        
        
        System.out.print("Seleccione la operación (|1: suma | |2: resta| |3: multiplicación|) : ");
        operacion = teclado.nextInt();
        
        switch (operacion) {
            case 1:
                resultado = vlr1 + vlr2 + vlr3;
                break;
            case 2:
                resultado = vlr1 - vlr2 - vlr3;
                break;
            case 3:
                resultado = vlr1 * vlr2 * vlr3;
                break;
            default:
                System.out.println("Introduce un operación válida: (|1: suma | |2: resta| |3: multiplicación|).");
        }
        
        System.out.println("El resultado sin transdormar es: \t" + resultado);
        System.out.println("El resultado en BINARIO es: \t\t" + Integer.toBinaryString(resultado));
        System.out.println("El resultado en OCTAL es: \t\t" + Integer.toOctalString(resultado));
        System.out.println("El resultado en HEXADECIMAL es: \t" + Integer.toHexString(resultado));
    }
}
