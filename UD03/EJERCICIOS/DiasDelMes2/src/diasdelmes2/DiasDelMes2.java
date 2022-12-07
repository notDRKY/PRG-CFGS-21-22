/*
 * 53. (DiasDelMes2)Escribir un programa que lea de teclado el número de un mes 
 * (1 a 12) y visualice el número de días que tiene el mes.
 * Resolver utilizando la sentencias switch.
 */
package diasdelmes2;

import java.util.Scanner;

public class DiasDelMes2 {

    public static int diasDelMes(int usrNum) {
        int numRetorno = 0;
        switch (usrNum) {
            case 1, 3, 5, 7, 8, 10, 12:
                //caso de que valga 1, 3, 5, 7, 8, 10, 12
                numRetorno = 31;
                break;
            case 2:
                // caso de que valga 2
                numRetorno = 28;
                break;
            case 4, 6, 9, 11:
            // caso de que valga 4, 6, 9, 11
                numRetorno = 30;
                break;
        }

        return numRetorno;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum;
        
        System.out.print("De que mes quieres saber los días [NUMERO DEL MES]: ");
        usrNum = teclado.nextInt();
        
        System.out.println("El numero de dias del mes " + usrNum + " es "
                + diasDelMes(usrNum));
    }

}
