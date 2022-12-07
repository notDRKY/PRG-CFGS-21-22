/*
 * 36. (NotasPorAlumno) Programa que pida al usuario las notas de A alumnos en S asignaturas,
 * alumno por alumno. A y S se definirán en el programa como CONSTANTES .
 * 
 *              Alumno 1
 *              Introduce nota de asignatura 1: 8
 *              Introduce nota de asignatura 2:
 *              ...
 *              Alumno 2
 *              Introduce nota de asignatura 1:
 *              ...
 */
package notasporalumno;

import java.util.Scanner;

public class NotasPorAlumno {

    private static final int ALUMNOS = 3;
    private static final int ASIGNATURAS = 6;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acumuladorNotas = 0;
        
        for (int a = 1; a <= ALUMNOS; a++) {
            acumuladorNotas = 0;
            System.out.println("---[ALUMNO " + a + "]---");
            
            for (int s = 1; s <= ASIGNATURAS; s++) {
                System.out.print("Introduce nota de asignatura " + s + ": ");
                acumuladorNotas += teclado.nextInt();
            }
        }
    }
}
