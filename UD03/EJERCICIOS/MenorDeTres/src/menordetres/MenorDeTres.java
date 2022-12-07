/*
 * 2. (MenorDeTres) Escribir un programa que muestre el menor de tres números enteros introducidos por
 * teclado. Haz dos versiones: una utilizando los operadores lógicos necesarios (&&,||, ...) y otra sin utilizar
 * ninguno (habrá que usar sentencias if else anidadas)
 */
package menordetres;

import java.util.Scanner;

public class MenorDeTres {

    public static String menorDeTres1(int num1, int num2, int num3) {
        String frase = "";
        if ((num1 < num2) && (num1 < num3)) {
                frase = ("El menor de los tres es: " + num1);
        } else if ((num2 < num1) && (num2 < num3)) {
                frase = ("El menor de los tres es: " + num2);
        } else if ((num3 < num1) && (num3 < num2)) {
                frase = ("El menor de los tres es: " + num3);
        }
            return frase;
    }
    
    
    public static String menorDeTres2(int num1, int num2, int num3){
        String frase = "";
        if (num1 < num2){
            frase = (num1 + "<" + num2);
        } else if (num1 < num3) {
            frase = (num1 + "<" + num3);
        } else if (num2 < num1) {
            frase = (num2 + "<" + num1);
        } else if (num2 < num3) {
            frase = (num2 + "<" + num3);
        } else if (num3 < num1) {
            frase = (num3 + "<" + num1);
        } else {
            frase = (num3 + "<" + num1);
            
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
        
        System.out.println(" [METODO LOGICO] " 
                + menorDeTres1(usrNum1, usrNum2, usrNum3));
        
        System.out.println(" [METODO IF ELSE ENCADENADO] " 
                + menorDeTres2(usrNum1, usrNum2, usrNum3));
        
        

    }

}
