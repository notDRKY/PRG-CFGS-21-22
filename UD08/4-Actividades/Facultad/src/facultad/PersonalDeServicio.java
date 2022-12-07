/*
 * Sobre el Personal de servicio , hay que conocer a qué sección están
 * asignados ( biblioteca , decanato , secretaría , ...).
 */
package facultad;

public class PersonalDeServicio extends Empleado {
    String seccion;

    public PersonalDeServicio(String seccion, String nombre, String apellidos, String numDeIdentificacion, String estadoCivil, int anoDeIncorporacion, int numDespacho) {
        super(nombre, apellidos, numDeIdentificacion, estadoCivil, anoDeIncorporacion, numDespacho);
        this.seccion = seccion;
    }
    
    // Traslado de sección de un empleado del personal de servicio.
    
    @Override
    public String toString() {
        return super.toString() + "\nPersonal de Servicio | Sección: " + seccion;
    }
    
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    
}
