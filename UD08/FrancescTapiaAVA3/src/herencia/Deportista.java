package herencia;

public class Deportista {

    protected String nombre;

    public Deportista() {
        System.out.println("Se crea el deportista");
    }

    public Deportista(String n) {
        nombre = n;
        System.out.println("Se crea el deportista " + nombre);
    }

    public void retirar() {
        System.out.println("Se retira el deportista " + nombre);
    }
}
