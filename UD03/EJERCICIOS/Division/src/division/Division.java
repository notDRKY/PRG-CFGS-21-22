/*
 * 6. (División) Escribir un programa que pida al usuario dos números enteros y le muestre el resultado de la
 * división. Tener en cuenta que si dividimos un número por cero se producirá un error de ejecución y
 * debemos evitarlo
 */
package division;
import java.util.Scanner;
    
public class Division {
    
    public static String divisionCero (int usrNum1, int usrNum2) {
        String resultado = "";
        if (usrNum2 == 0) {
             return resultado = "No se puede realizar la operacion con un"
                     + " numero igual a cero";
         } else {
             resultado = "El resultado es: " + (usrNum1 / usrNum2);
         }
         
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum1, usrNum2;
        
        System.out.print("Introduce un numero: ");
        usrNum1 = teclado.nextInt();
        System.out.print("Introduce otro numero: ");
        usrNum2 = teclado.nextInt();
        System.out.println("Se dividirá " + usrNum1 + " entre " + usrNum2);
        
        System.out.println("[DIVISION] \n" + divisionCero(usrNum1, usrNum2));
        
    }
    
}
