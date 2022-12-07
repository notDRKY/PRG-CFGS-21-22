/*
 * Actividad 2. Un cine precisa una aplicación para controlar las personas de la cola para los
 * estrenos de películas. Debemos crear una lista con la edad de las personas de la lista y
 * tendremos que calcular la entrada según la edad de la persona (mínimo 5 años). Para la edad de
 * la persona se generan aleatoriamente números entre 5 y 60 años. Al final, deberemos mostrar la
 * cantidad total recaudada. El número de personas de la cola se elige al azar entre 0 y 50.
 * 
 *      La lista de precios se basa en la siguiente tabla.
 *      EDAD                    PRECIO
 *      Entre 5 y 10 años       5€
 *      Entre 11 y 17 años      7.5€
 *      Mayor de 18 años        9.5€
 */
package actividad2;

import java.util.ArrayList;

public class Actividad2 {
    
    public static void main(String[] args) {
        double recaudacion = 0;
        ArrayList <Integer> edadClientes = new ArrayList<>();
        
        for (int i = 0; i <= (Math.round(Math.random() * 50)); i++) {
            edadClientes.add(((int)Math.round(Math.random() * 60) + 5));
        }
        
        for (int cliente : edadClientes) {
            if (cliente >= 5 && cliente <= 10) {
                recaudacion += 5;
            } else if (cliente >= 11 && cliente <= 17) {
                recaudacion += 7.5;
            } else if (cliente >= 18){
                recaudacion += 9.5;
            }
        }
        
        System.out.println("Núm clie:\t " + edadClientes.size());
        System.out.println("Edad clie:\t " + edadClientes);
        System.out.println("Recaudación:\t " + recaudacion + "€");
    }
}
