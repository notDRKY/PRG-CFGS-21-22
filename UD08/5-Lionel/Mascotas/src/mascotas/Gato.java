package mascotas;

public class Gato extends Mascotas {
    // Clase completa
    protected String color;
    protected boolean peloLargo;

    public Gato(String color, boolean peloLargo, String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    public String muestra() {
        return "Gato | " + super.muestra() + " Color: " + color + " Pelo largo: " + peloLargo;
    }

    @Override
    public void habla() {
        System.out.println("Gato dice: MIAU MIAU!");
    }
}
