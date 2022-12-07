package cultura;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Evento {
    // Atributos de la clase abstracta Evento
    private String titulo;
    private LocalDate fecha;
    private LocalTime hora;
    double precio;
    
    // Constructor con todos los parámetros necesarios para inicializar un Evento
    public Evento(String titulo, LocalDate fecha, LocalTime hora, double precio) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
    }
    
    // equals generado por Netbeans, probablemente mejorable.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evento other = (Evento) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        // Falta formatear PRECIO
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        StringBuilder cadena = new StringBuilder();
        cadena.append("Título: ").append(titulo).append("\nFecha: ").append(fecha.format(formato)).append("\nHora: ").append(hora);
        /*
         * Doy por hecho que una ObraTeatro puede tener la entrada gratuita,
         * por eso realizo la comprobación en el toString(), no es una manera
         * muy eficiente, pero no se deja claro en el enunciado.
         */
        if (this.getPrecio() == 0) {
            cadena.append("\n**Entrada gratuita!!!**");
        } else {
            cadena.append("\nPrecio: ").append(precio).append(" €");
        }
        
        return cadena.toString();
    }

    // Getter necesario para el método 
    // public static void eliminarEventosFinalizados(Collection<Evento> c)
    // de la clase TestEventos
    public LocalDate getFecha() {
        return fecha;
    }
    
    // Getter necesario para el toString();
    public double getPrecio() {
        return precio;
    }

}
