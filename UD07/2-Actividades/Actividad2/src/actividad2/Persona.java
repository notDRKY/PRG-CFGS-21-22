package actividad2;

public class Persona {
    int edad;
    
    public Persona() {
        this.edad = (int) Math.round(Math.random() * 60) + 5;
    }
}
