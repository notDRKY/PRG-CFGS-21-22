/*
    44. (dibujarFiguras1) Escribe una clase que contenga los métodos que se indican a continuación.
    En el método main solicita al usuario las dimensiones de las figuras necesarias en cada caso
    y llama al método correspondiente para que se muestre por pantalla
        1. ( void dibRecAsteriscos(int ancho, int alto) dibuja un rectángulo utilizando
        asteriscos, como el siguiente. En el ejemplo ancho es 7 y alto es 3
 */
package dibujarfiguras1;

import java.util.Scanner;

public class DibujarFiguras1 {

    public static void dibRecAsteriscos(int ancho, int alto) {
        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print("*");
            }
            System.out.println(""); // CADENA VACÍA PARA QUE EL PRIMER PUNTO SE META EN LA FIGURA
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrAncho = 0;
        int usrAlto = 0;
        
        System.out.print("DEFINA LA ANCHURA DE LA FIGURA: ");
        usrAncho = teclado.nextInt();
        System.out.print("DEFINA LA ALTURA DE LA FIGURA: ");
        usrAlto = teclado.nextInt();
        
        dibRecAsteriscos(usrAncho, usrAlto);
    }

}
