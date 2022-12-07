package mascotas;

public class Loro extends Ave {

    protected String origen;
    protected boolean habla;

    public Loro(String origen, boolean habla, String pico, boolean vuela, String nombre, int edad, String estado, String fechaNacimiento) {
        super(pico, vuela, nombre, edad, estado, fechaNacimiento);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    public String muestra() {
        return "Loro | " + super.muestra() + " Origen: " + origen + " Habla: " + habla;
    }

    @Override
    public void habla() {
        if (this.habla) {
            System.out.println("Loro habla");
        }
        System.out.println("Loro no habla");
    }

    @Override
    public void volar() {
        if (this.isVuela()) {
            System.out.println("Loro vuela");
        }
        System.out.println("Loro no vuela");
    }
    
}
