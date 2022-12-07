package hotel;

import java.util.Collection;
import java.util.HashMap;

public class Hotel {

    /*
     * No se indica la accesibilidad de los atributos de la clase
     * Hotel
     */
    String nombre;
    double precio;
    
    // Constructor por defecto que da valor a los parámetros de la clase Hotel
    public Hotel(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public static void precioMinimoDeHoteles(Collection<Hotel> hoteles) {
        HashMap <String, Double> listaHoteles = new HashMap<>();
        // Para cada objeto h tipo Hotel de la colección hoteles...
        for (Hotel h : hoteles) {
            // Si Map no contiene la clave ni el precio...
            if ((!listaHoteles.containsKey(h.getNombre())) && (!listaHoteles.containsValue(h.getPrecio()))) {
                // Se añade el hotel
                listaHoteles.put(h.getNombre(), h.getPrecio());
            // Si contiene la clave compararemos los precios
            } else {
                // Si el precio del Hotel que llega por parámetro es 
                // menor que el que está introducido en el Map...
                if (h.getPrecio() < listaHoteles.get(h.getNombre())) {
                    // Modificamos el elemento dentro del Map
                    listaHoteles.put(h.getNombre(), h.getPrecio());
                }
            }
        }
        System.out.println(listaHoteles.toString());
    }

    // Getters necesarios para el método 
    // public static void precioMinimoDeHoteles(Collection<Hotel> hoteles)
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
