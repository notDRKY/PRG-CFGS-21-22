package mascotas;

public abstract class Ave extends Mascotas {
    // Clase abstracta completa
    protected String pico;
    protected boolean vuela;

    public Ave(String pico, boolean vuela, String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }
    
    // Todos los descendientes redefinirán este método.
    public abstract void volar();

    public String getPico() {
        return pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    
}
