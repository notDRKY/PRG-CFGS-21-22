package ejercicio6;

class Estudiante extends Persona {

    private double creditos;

    public Estudiante(String n, int e, double c) {
        super(n, e);
        this.creditos = c;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCreditos: " + creditos;
    }
}
