package facultad;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected String numDeIdentificacion;
    protected String estadoCivil;

    public Persona(String nombre, String apellidos, String numDeIdentificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numDeIdentificacion = numDeIdentificacion;
        this.estadoCivil = estadoCivil;
    }
    
    // Cambio del estado civil de una persona.
    public void cambioEstadoCivil(String nuevoEstadoCivil) {
        this.setEstadoCivil(nuevoEstadoCivil);
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nNúmero de Identificación: " + numDeIdentificacion + "\nEstado civil: " + estadoCivil;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNumDeIdentificacion() {
        return numDeIdentificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNumDeIdentificacion(String numDeIdentificacion) {
        this.numDeIdentificacion = numDeIdentificacion;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
}
