/*
 * 3. (IntermedioDeTres) Escribir un programa que muestre el intermedio de tres números introducidos por
 * teclado.
 */
package intermediodetres;
import java.util.Scanner;

public class IntermedioDeTres {
    
    public static int calculaIntermedio (int num1, int num2, int num3) {
        int numDevuelto = 0;
        if ((num1 < num2) && (num2 < num3)) {
            numDevuelto =  num2;
        } else if ((num3 < num2) && (num2 < num1)) {
            numDevuelto =  num2;
        } else if ((num1 < num3) && (num3 < num2)) {
            numDevuelto =  num3;
        } else if ((num2 < num3) && (num3 < num1)) {
            numDevuelto =  num3;
        } else if ((num2 < num1) && (num1 < num3)) {
            numDevuelto =  num1;
        } else if ((num3 < num1) && (num1 < num2)) {
            numDevuelto =  num1;
        }
        return numDevuelto;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum1, usrNum2, usrNum3;
        
        System.out.print("Introduce un numero: ");
        usrNum1 = teclado.nextInt();
        System.out.print("Introduce otro numero: ");
        usrNum2 = teclado.nextInt();
        System.out.print("Introduce el ultimo numero: ");
        usrNum3 = teclado.nextInt();
        
        System.out.println("[CALCULA INTERMEDIO]\n " 
                + "El numero intermedio es: "
                + calculaIntermedio(usrNum1, usrNum2, usrNum3));
    }
    
}
