package ejercicio6;

public class Persona {

    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }

    public Persona(String n, int e) {
        this.nombre = n;
        this.edad = e;
    }

    public String toString() {
        return "Nombre: " + nombre + "Edad " + edad;
    }

    public final String getNombre() {
        return nombre;
    }

    public final int getEdad() {
        return edad;
    }
}