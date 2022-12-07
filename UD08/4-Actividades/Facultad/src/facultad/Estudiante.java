/*
 * En cuanto a los Estudiantes , se requiere almacenar el curso en el que están
 * matriculados.
 */
package facultad;

public class Estudiante extends Persona {
    String curso;

    public Estudiante(String curso, String nombre, String apellidos, String numDeIdentificacion, String estadoCivil) {
        super(nombre, apellidos, numDeIdentificacion, estadoCivil);
        this.curso = curso;
    }
    
    // Matriculación de un estudiante en un nuevo curso.
    
    @Override
    public String toString() {
        return super.toString() + "\nEstudiante | Curso: " + curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
