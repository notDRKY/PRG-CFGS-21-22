/*
 * 3. (IntermedioDeTres) Escribir un programa que muestre el intermedio de tres números introducidos por
 * teclado.
 */
package intermediodetres;
import java.util.Scanner;

public class IntermedioDeTres {
    
    public static String calculaIntermedio (int num1, int num2, int num3) {
        String frase = "";
        if ((num1 < num2) && (num2 < num3)) {
            frase = "El número intermedio es: " + num2;
        } else if ((num3 < num2) && (num2 < num1)) {
            frase = "El número intermedio es: " + num2;
        } else if ((num1 < num3) && (num3 < num2)) {
            frase = "El número intermedio es: " + num3;
        } else if ((num2 < num3) && (num3 < num1)) {
            frase = "El número intermedio es: " + num3;
        } else if ((num2 < num1) && (num1 < num3)) {
            frase = "El número intermedio es: " + num1;
        } else if ((num3 < num1) && (num1 < num2)) {
            frase = "El número intermedio es: " + num1;
        }
        return frase;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum1, usrNum2, usrNum3;
        
        System.out.println("Introduce un numero: ");
        usrNum1 = teclado.nextInt();
        System.out.println("Introduce otro numero: ");
        usrNum2 = teclado.nextInt();
        System.out.println("Introduce el ultimo numero: ");
        usrNum3 = teclado.nextInt();
        
        System.out.println("[CALCULA INTERMEDIO]\n " 
                + calculaIntermedio(usrNum1, usrNum2, usrNum3));
    }
    
}
