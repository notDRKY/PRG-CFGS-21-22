/*
 * 1. (Notas). Se dispone de una matriz que contiene las notas de una serie de alumnos en una
 * serie de asignaturas. Cada fila corresponde a un alumno, mientras que cada columna
 * corresponde a una asignatura. Desarrollar métodos para:
 *     1. Imprimir las notas alumno por alumno.
 *     2. Imprimir las notas asignatura por asignatura.
 *     3. Imprimir la media de cada alumno.
 *     4. Imprimir la media de cada asignatura.
 *     5. Indicar cual es la asignatura más fácil, es decir la de mayor nota media.
 *     6. ¿Hay algún alumno que suspenda todas las asignaturas?
 *     7. ¿Hay alguna asignatura en la que suspendan todos los alumnos?
 * Generar la matriz (al menos 5x5) en el método main, rellenarla, y comprobar los métodos
 * anteriores.
 */
package notas;

public class Notas {

    public static void imprimeNotasAlumnoXAlumno(double v[][]) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("\n|___Alumno " + (i + 1) + "___| ");
            for (int j = 0; j < v[i].length; j++) {
                System.out.println("|______Asignatura " + (j + 1) + "______| " + v[i][j]);
            }
        }
    }

    public static void imprimeNotasAsignaturaXAsignatura(double v[][]) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("\n|______Asignatura " + (i + 1) + "______|");
            for (int j = 0; j < v[i].length; j++) {
                System.out.println("|" + v[j][i] + "|");
            }
        }
    }

    public static void mediaAlumno(double v[][]) {
        for (int i = 0; i < v.length; i++) {
            double media = 0;
            System.out.println("\n|___Alumno " + (i + 1) + "___| ");
            for (int j = 0; j < v[i].length; j++) {
                media += v[i][j];
            }
            media = media / v[i].length;
            System.out.println(media);
        }
    }
    
    public static void mediaAsignatura(double v[][]) {
        for (int i = 0; i < v.length; i++) {
            double media = 0;
            System.out.println("\n|___Asignatura " + (i + 1) + "___| ");
            for (int j = 0; j < v[i].length; j++) {
                media += v[j][i];
            }
            media = media / v[i].length;
            System.out.println(media);
        }
    }
    
    public static void asignaturaFacil(double m[][]) {
        double asignaturaFacil = 0;
        double notaAsignaturaFacil = 0;
        for (int c = 0; c < m[0].length; c++) {
            double media = 0;
            for (int f = 0; f < m[c].length; f++) {
                media += m[f][c];
            }
            media = media / m[0].length;
            if (media > notaAsignaturaFacil) {
                notaAsignaturaFacil = media;
                asignaturaFacil = c;
            }
        }
        System.out.printf("Asignatura %.0f\n" ,asignaturaFacil + 1);
    }
    
    public static boolean alumnoSuspendeTodo(double v[][]) {
        boolean esAprobado = true;
//        boolean  ;
        for (int f = 0; f < v.length && esAprobado; f++) {
            for (int c = 0; c < v[f].length && esAprobado; c++) {
                if (v[f][c] <= 5){
                    esAprobado = false;
                }
            }
        }
        return esAprobado;
    }
    
//    public static boolean asignaturaTotalSuspensa (double v[][]) {
//        
//    }
    public static void main(String[] args) {
        double notasPrueba1[][] = {{5, 4.9, 2, 2, 2.9},
        {5.2, 5.3, 7.2, 9.1, 8.5},
        {6.2, 5.2, 2.1, 3.3, 7.2},
        {1.2, 8.4, 6.2, 5, 8.3},
        {10, 10, 10, 10, 10}};
        
        System.out.println("________________________NOTAS A x A________________________");
        imprimeNotasAlumnoXAlumno(notasPrueba1);
        imprimeNotasAsignaturaXAsignatura(notasPrueba1);
        
        System.out.println("________________________MEDIAS________________________");
        mediaAlumno(notasPrueba1);
        mediaAsignatura(notasPrueba1);
        
        System.out.println("________________________ASIGNATURA MÁS FÁCIL________________________");
        asignaturaFacil(notasPrueba1);
        
        System.out.println("________________________¿ALGÚN ALUMNO HA SUSPENDIDO TODO?________________________");
        System.out.println(alumnoSuspendeTodo(notasPrueba1));
    }

}
