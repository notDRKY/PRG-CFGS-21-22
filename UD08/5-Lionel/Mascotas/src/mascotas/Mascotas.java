package mascotas;

public class Mascotas {
    
    protected String nombre;
    protected int edad;
    protected String estado;
    protected String fechaNacimiento;

    public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String muestra() {
        return "Nombre: " + nombre + " Edad: " + edad + " Estado=" + estado + " Fecha de Nacimiento: " + fechaNacimiento;
    }
    
    public void cumpleanos() {
        System.out.println(this.getFechaNacimiento());
    }
    
    public void morir() {
        // está vacío
    }
    
    public void habla() {
        System.out.println("Mascota habla");
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
