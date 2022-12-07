package cultura;

import java.time.LocalDate;
import java.time.LocalTime;

// Clase Exposicion, heredera de la clase abstracta Evento
public class Exposicion extends Evento {
    // Atributos de la clase Exposicion
    private int sala;
    private LocalDate clausura;
    
    // Constructor único de la clase Exposicion (con los párametros necesarios)
    public Exposicion(int sala, LocalDate clausura, String titulo, LocalDate fecha, LocalTime hora) {
        super(titulo, fecha, hora, 0);
        this.sala = sala;
        this.clausura = clausura;
    }
    
    // Modificación parcial de toString():
    @Override
    public String toString() {
        return "EXPOSICION\n" 
                + super.toString() 
                + "\nSala: " + sala 
                + "\nFecha de clausura: " + clausura;
    }
}
