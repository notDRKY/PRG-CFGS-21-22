/*
 * Actividad 4. Desarrollar un sistema de gestión de pacientes. Tendremos un archivador
 * dónde iremos guardando todas las fichas de los pacientes. Las fichas contienen la siguiente
 * información: nombre, apellidos y edad.
 *
 * Todas las fichas que vayamos creando, se podrán guardar o eliminar del archivador. Al
 * archivador también le podremos pedir un listado. Este listado consistirá en visualizar por pantalla
 * el número de fichas guardadas, así como el contenido de las fichas.
 * 
 * La clase GestionPacientes tiene un método main en el que se crea un archivador, dos o tres
 * fichas que se guardarán en el archivador, se listará el contenido, se eliminará alguna ficha y se
 * volverá a listar su contenido. Todas las clases se guardarán en el paquete gestionpacientes.
 */
package actividad4;

public class Paciente {
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Paciente(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + nombre + " APELLIDOS: " + apellidos + " EDAD: " + edad;
    }
    
}
