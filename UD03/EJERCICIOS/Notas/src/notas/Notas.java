/*
 * 33. (Notas) Realizar un programa que permita introducir las notas de un examen de los alumnos de un curso.
 * El usuario irá introduciendo las notas una tras otra. Se considerará finalizado el proceso de introducción
 * de notas cuando el usuario introduzca una nota negativa. Al final, el programa le dirá:
 * El número de notas introducidas.
 * El número de aprobados (mayor o igual a 5 puntos)
 * La nota media
 */
package notas;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int aprobadas = 0; 
        int notasTotales = 0; // NOTAS TOTALES SE UTILIZA PARA CALCULAR LA MEDIA, ES LA SUMA DE TODAS LAS NOTAS
        int notasNuevas = 0; // NOTAS INTRODUCIDAS POR EL USUARIO

        System.out.println("[INTRODUCE LAS NOTAS DE UNA A UNA, UTILICE UNA NOTA "
                + "NEGATIVA PARA DETERNER EL PROGRAMA]");
        do {
            // HACEMOS UNA RUN DE BUCLE INVISIBLE PARA EL USUARIO
            // PARA QUE NO CUENTE LA NOTA NEGATIVA DE STOP
            contador++;

            if (notasNuevas >= 5) {
                aprobadas++;
            }
            
            notasTotales += notasNuevas;
            
            System.out.print("Nota del examen " + contador + ": ");
            notasNuevas = teclado.nextInt();
            
        } while (notasNuevas >= 0); // EL BUCLE FUNCIONARÁ MIENTRAS NOTAS NUEVAS SEA MAYOR O IGUAL A CERO
        
        contador--; // SE RESTA UNO PORQUE EL BUCLE ARRANCA UNA VEZ ANTES DE QUE EL USUARIO LO VEA
        System.out.println("Has introducido: " + contador + " notas.");
        System.out.println("Has aprobado: " + aprobadas + " examenes.");
        System.out.println("La nota media es: " + notasTotales/contador);
        
    }
}
