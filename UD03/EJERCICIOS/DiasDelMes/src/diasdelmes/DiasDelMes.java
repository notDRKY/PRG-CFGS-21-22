/*
 * 11. (DiasDelMes) Escribir un programa que lea de teclado el número de un mes (1 a 12) y
 * visualice el número de días que tiene el mes. Hacerlo utilizando sentencias if else . Para
 * hacer el programa, implementa un método en la clase que reciba un número de mes y
 * devuelva el número de días que tiene el mes
 */
package diasdelmes;

import java.util.Scanner;

public class DiasDelMes {

    public static int diasMes(int mes) {
        int dias;
        
        if (mes <= 1) {
            dias = 31;
        } else if (mes <= 2) {
            dias = 28;
        } else if (mes <= 3) {
            dias = 31;
        } else if (mes <= 4) {
            dias = 30;
        } else if (mes <= 5) {
            dias = 31;
        } else if (mes <= 6) {
            dias = 30;
        } else if (mes <= 7) {
            dias = 31;
        } else if (mes <= 8) {
            dias = 31;
        } else if (mes <= 9) {
            dias = 30;
        } else if (mes <= 10) {
            dias = 31;
        } else if (mes <= 11) {
            dias = 30;
        } else {
            dias = 31;
        }
        return dias;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum;
        
        System.out.print("Introduce el número de un mes: ");
        usrNum = teclado.nextInt();
        
        System.out.println("El mes " + usrNum + " tiene " + diasMes(usrNum) + " días.");
        
    }
}
