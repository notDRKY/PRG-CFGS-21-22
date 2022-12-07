/* 13. (UltimaCifra) Escribir un programa que muestre la última cifra de un número entero que introduce el
usuario por teclado. Pista: ¿Qué devuelve a%10 ? */

public class Ejercicio13 {
    public static void main (String [] args) {
        String textoNum;
        int numUsuario, resultado;

        System.out.print("Introduce un numero: ");
        textoNum= System.console().readLine();
        numUsuario= Integer.parseInt(textoNum);

        resultado= numUsuario % 10;
        System.out.print("La última cifra de " + numUsuario + " es " + resultado);
    }
}