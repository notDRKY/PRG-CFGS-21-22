package mascotas;

public class Canario extends Ave {

    protected String color;
    protected boolean canta;

    public Canario(String color, boolean canta, String pico, boolean vuela, String nombre, int edad, String estado, String fechaNacimiento) {
        super(pico, vuela, nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.canta = canta;
    }

    @Override
    public String muestra() {
        return "Canario | " + super.muestra() + " Color: " + color + " Canta:  " + canta;
    }

    @Override
    public void habla() {
        System.out.println("Canario habla");
    }

    @Override
    public void volar() {
        if (this.isVuela()) {
            System.out.println("Canario vuela");
        }
        System.out.println("Canario no vuela");
    }
}
