/*
 * Por lo que se refiere a los Profesores , es necesario gestionar a qué
 * departamento pertenecen ( lenguajes , matemáticas , arquitectura , ...).
 */
package facultad;

public class Profesor extends Empleado {
    String departamento;

    public Profesor(String departamento, String nombre, String apellidos, String numDeIdentificacion, String estadoCivil, int anoDeIncorporacion, int numDespacho) {
        super(nombre, apellidos, numDeIdentificacion, estadoCivil, anoDeIncorporacion, numDespacho);
        this.departamento = departamento;
    }
    
    // Cambio de departamento de un profesor.
    
    @Override
    public String toString() {
        return super.toString() + "\n Profesor | Departamento: " + departamento + '}';
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
