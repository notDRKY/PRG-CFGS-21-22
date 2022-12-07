package cultura;

import java.time.LocalDate;
import java.time.LocalTime;

// Clase ObraTeatro, heredera de la clase abstracta Evento
public class ObraTeatro extends Evento {
    // Atributos de la clase ObraTeatro
    private String director;
    private int duracion;
    
    // Constructor único de la clase ObraTeatro (con los párametros necesarios)
    public ObraTeatro(String director, int duracion, String titulo, LocalDate fecha, LocalTime hora, double precio) {
        super(titulo, fecha, hora, precio);
        this.director = director;
        this.duracion = duracion;
    }
    
    // Modificación parcial de toString():
    @Override
    public String toString() {
        return "TEATRO\n" + super.toString() 
                + "\nDirector: " + director 
                + "\nDuracion: " + duracion + " minutos";
    }
    
}
