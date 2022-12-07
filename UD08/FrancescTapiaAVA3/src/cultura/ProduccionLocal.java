package cultura;

import java.time.LocalDate;
import java.time.LocalTime;

// Clase ProduccionLocal, heredera de la clase abstracta Evento
public class ProduccionLocal extends Evento {
    
    // Constructor único de la clase ProduccionLocal (con los párametros necesarios)
    public ProduccionLocal(String titulo, LocalDate fecha, LocalTime hora) {
        super(titulo, fecha, hora, 0);
    }
    
    // Modificación parcial de toString():
    @Override
    public String toString() {
        return "PROD. LOCAL\n" + super.toString();
    }

}
