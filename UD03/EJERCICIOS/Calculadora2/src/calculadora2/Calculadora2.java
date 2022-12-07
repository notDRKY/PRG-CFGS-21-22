/*
 * 55. (Calculadora2) Escribir un programa para simular una calculadora. Considera que los cálculos posibles
 * son del tipo num1 operado num2, donde num1 y num2 son dos números reales cualesquiera y operador
 * es una de entre: +, -, * y /. El programa pedirá al usuario en primer lugar el valor num1, a continuación el
 * operador y finalmente el valor num2. Resolver utilizando la sentencias switch.
 */
package calculadora2;
import java.util.Scanner;

// CLASE CALCULADORA 2
public class Calculadora2 {
    
    // METODO UTILIZADO PARA REALIZAR LA ACTIVIDAD
    public static float utilCalculadora(int num1, String operador, int num2) {
        float resultado = 0f; // inicializo la variable, si no el return del metodo llora
        switch (operador) {
            case "+":
                resultado = (num1 + num2);
                break;
            case "-":
                resultado = (num1 - num2);
                break;
            case "*":
                resultado = (num1 * num2);
                break;
            case "/": // tal vez se pueda hacer con default
                resultado = (num1 / num2);
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum1, usrNum2;
        String usrOperador;
        
        System.out.print("Introduce el primer numero para realizar el calculo: ");
        usrNum1 = teclado.nextInt();
        System.out.print("Introduce el operador para el calculo (+, -, *, /) : ");
        usrOperador = teclado.next(); // SE USA NEXT PORQUE NEXTLINE DABA ERROR
        System.out.print("Introduce el segundo numero para realizar el calculo: ");
        usrNum2 = teclado.nextInt();
        System.out.println("SE VA A REALIZAR LA OPERACION: " 
                + usrNum1 + usrOperador + usrNum2);
        
        System.out.println("El resultado de tu operacion es: " 
                + utilCalculadora(usrNum1, usrOperador, usrNum2));
    }

}
