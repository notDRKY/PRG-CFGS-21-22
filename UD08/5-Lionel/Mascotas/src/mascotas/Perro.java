package mascotas;

public class Perro extends Mascotas {
    // Clase completa
    protected String raza;
    protected String pulgadas;

    public Perro(String raza, String pulgadas, String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgadas = pulgadas;
    }

    @Override
    public String muestra() {
        return "Perro | " + super.muestra() + " Raza: " + raza + " Pulgadas: " + pulgadas;
    }
    
    @Override
    public void habla() {
        System.out.println("Perro dice: GUAU GUAU!");
    }
}
