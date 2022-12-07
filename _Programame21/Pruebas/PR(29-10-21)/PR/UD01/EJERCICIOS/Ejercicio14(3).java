/* 14. (PenultimaCifra) Escribir un programa que muestre la penúltima cifra de un número entero que introduce
el usuario por teclado. */

public class Ejercicio14 {
    public static void main (String [] args) {
        String textoNum;
        int numUsuario, resultado;

        System.out.print("Introduce un numero: ");
        textoNum= System.console().readLine();
        numUsuario= Integer.parseInt(textoNum);

        resultado= (numUsuario % 100) / 10;
        System.out.print("La penultima cifra de " + numUsuario + " es " + resultado);

    }
}