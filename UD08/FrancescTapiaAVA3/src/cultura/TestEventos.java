package cultura;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;

public class TestEventos {

    public static void eliminarEventosFinalizados(Collection<Evento> c) {
        // Guardo en una variable tipo LocalDate la fecha actual
        LocalDate fechaActual = LocalDate.now();
        // Recorro la colección con un bucle for each
        for (Evento e : c) {
            // De cada Evento de la colección compruebo si la 
            // fecha es anterior a la actual
            if (e.getFecha().isBefore(fechaActual)) {
                // Si la anterior comprobación se cumple, 
                // eliminamos el evento de la colección
                c.remove(e);
            }
        }
    }

    public static void main(String[] args) {
        // Creación de los eventos
        ProduccionLocal pl = new ProduccionLocal("PRUEBA 1", LocalDate.now(), LocalTime.of(9, 20));
        // Evento(Exposicion) 100% finalizado, para poder comprobar el método eliminarEventosFinalizados()
        Exposicion e = new Exposicion(7, LocalDate.parse("2022-06-05"), "PRUEBA 2", LocalDate.parse("2022-06-02"), LocalTime.of(9, 21));
        ObraTeatro ob = new ObraTeatro("El jefe", 70, "PRUEBA 3", LocalDate.parse("2022-06-08"), LocalTime.of(9, 20), 10);
        
         //PRIMERA PARTE DE PAQUETE CULTURA
         System.out.println("pl.equals(ob) | " + pl.equals(ob));
         System.out.println("\n" + pl.toString());
         System.out.println("\n" + e.toString());
         System.out.println("\n" + ob.toString());

        // SEGUNDA PARTE DE PAQUETE CULTURA
        // 1. Crea una colección de Eventos de tu preferencia a elegir entre las estudiadas en clase
        ArrayList<Evento> coleccionEventos = new ArrayList<>();

        // 2. Añadir al menos 3 eventos (al menos uno finalizado) a la colección.
        coleccionEventos.add(pl);
        coleccionEventos.add(e);
        coleccionEventos.add(ob);

        // 3. Imprimir la colección mostrando la información de todos los eventos.
        System.out.println("\n\n\n***IMPRESIÓN ANTES DEL MÉTODO***\n" + coleccionEventos.toString());

        // 4. Llamar al método eliminarEventosFinalizados pasando como parámetro tu colección.
        eliminarEventosFinalizados(coleccionEventos);

        // 5. Imprimir de nuevo la colección, para comprobar que ha desaparecido uno de los eventos.
        System.out.println("\n\n\n***IMPRESIÓN DESPUÉS DEL MÉTODO***\n" + coleccionEventos.toString());

    }
}
