/*
 * Actividad 5. Crear una estructura Map llamada divisas, que almacene pares de moneda y
 * valor al cambio en euros. Por ejemplo Dólar: 0,81€
 *
 *      Añadir los siguientes pares moneda/valor al Map divisas:
 * 
 *      Moneda                      Valor en €
 *      Dólar Americano             0.81
 *      Franco Suizo                0.85
 *      Libra Esterlina             1.14
 *      Corona Danesa               0.13
 *      Peso Mexicano               0.04
 *      Dólar Singapur              0.62
 *      Real Brasil                 0.24
 * 
 *      Mostrar el valor de la Libra Esterlina.
 * 
 *      Mostrar todas las divisas con las que se opera y su valor.
 * 
 *      Indicar el número de divisas del Map.
 * 
 *      Eliminar la divisa Real Brasil y mostrar los datos del Map.
 * 
 *      Mostrar si existe la divisa Peso Mexicano.
 * 
 *      Mostrar si existe la divisa Euro.
 * 
 *      Mostrar si existe el valor al cambio 0.85 €.
 * 
 *      Mostrar si existe el valor al cambio 0.33 €.
 * 
 *      Indicar si el Map divisas está vacío.
 * 
 *      Borra todos los componentes del Map divisas.
 * 
 *      Volver a indicar si el Map divisas está vacío.
 */
package actividad5;

import java.util.HashMap;

public class Actividad5 {
    
    public static void main(String[] args) {
        HashMap <String, Double> monedas = new HashMap<>();
        monedas.put("Dólar Americano", 0.81);
        monedas.put("Franco Suizo", 0.85);
        monedas.put("Libra Esterlina", 1.14);
        monedas.put("Corona Danesa", 0.13);
        monedas.put("Peso Mexicano", 0.04);
        monedas.put("Dólar Singapur", 0.62);
        monedas.put("Real Brasil", 0.24);
        
        // Mostrar el valor de la Libra Esterlina.
        System.out.println("Valor de la Libra Esterlina: " + monedas.get("Libra Esterlina"));
        
        // Mostrar todas las divisas con las que se opera y su valor.
        System.out.println(monedas.toString());
        
        // Indicar el número de divisas del Map.
        System.out.println("Número de divisas del Map: " + monedas.size());
        
        // Eliminar la divisa Real Brasil y mostrar los datos del Map.
        monedas.remove("Real Brasil");
        System.out.println(monedas.toString());
        
        // Mostrar si existe la divisa Peso Mexicano.
        System.out.println("¿Existe la divisa Peso Mexicano? " + monedas.containsKey("Peso Mexicano"));
        
        // Mostrar si existe la divisa Euro.
        System.out.println("¿Existe la divisa Euro? " + monedas.containsKey("Euro"));
        
        // Mostrar si existe el valor al cambio 0.85 €.
        System.out.println("¿Existe el valor al cambio 0.85€? " + monedas.containsValue(0.85));
        
        // Mostrar si existe el valor al cambio 0.33 €.
        System.out.println("¿Existe el valor al cambio 0.33€? " + monedas.containsValue(0.33));
        
        // Indicar si el Map divisas está vacío.
        System.out.println("¿El map está vacío? " + monedas.isEmpty());
        
        // Borra todos los componentes del Map divisas.
        monedas.clear();
        
        // Volver a indicar si el Map divisas está vacío.
        System.out.println("¿El map está vacío? " + monedas.isEmpty());
    }
}
