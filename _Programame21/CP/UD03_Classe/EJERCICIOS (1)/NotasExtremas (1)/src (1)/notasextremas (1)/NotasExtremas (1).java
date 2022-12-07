/*
 * 34. (NotasExtremas) Modificar el ejercicio anterior para que además calcule la nota máxima y la nota mínima.
 */
package notasextremas;

import java.util.Scanner;

public class NotasExtremas {
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int aprobadas = 0; 
        int notasTotales = 0; // NOTAS TOTALES SE UTILIZA PARA CALCULAR LA MEDIA, ES LA SUMA DE TODAS LAS NOTAS
        int notasNuevas = 0; // NOTAS INTRODUCIDAS POR EL USUARIO
        
        int notaMin = 10;
        int notaMax = 0;

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
                                                                //CONTADOR DISTINTO A 1 PARA QUE NO CUENTE LA PRIMERA RUN, SI NO, FALLA
            if ((notasNuevas < notaMin) && (contador != 1)) {   //SI MI NOTA ACTUAL ES MENOR QUE 10 ESA SERÁ MI NUEVA NOTA MINIMA
                notaMin = notasNuevas;                          //A MEDIDA QUE INTRODUZCA NOTAS, LA MÁS BAJA SE IRÁ POSICIONANDO
            }
            
            if (notasNuevas > notaMax) { //SI MI NOTA ACTUAL ES MAYOT QUE 10 ESA SERÁ MI NUEVA NOTA MAXIMA
                notaMax = notasNuevas;   //A MEDIDA QUE INTRODUZCA NOTAS, LA MÁS ALTA SE IRÁ POSICIONANDO
            }
            
            System.out.print("Nota del examen " + contador + ": ");
            notasNuevas = teclado.nextInt();
            
        } while (notasNuevas >= 0); // EL BUCLE FUNCIONARÁ MIENTRAS NOTAS NUEVAS SEA MAYOR O IGUAL A CERO
        
        contador--; // SE RESTA UNO PORQUE EL BUCLE ARRANCA UNA VEZ ANTES DE QUE EL USUARIO LO VEA
        System.out.println("Has introducido: " + contador + " notas.");
        System.out.println("Has aprobado: " + aprobadas + " examenes.");
        System.out.println("La nota media es: " + notasTotales / contador);
        System.out.println("La nota más alta ha sido: " + notaMax);
        System.out.println("La nota más baja ha sido: " + notaMin);
        
    }
    
}
