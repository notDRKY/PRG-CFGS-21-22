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

import java.util.LinkedHashSet;

public class GestionPacientes {
    
    public static void main(String[] args) {
        LinkedHashSet <Paciente> archivador = new LinkedHashSet<>();
        Paciente paciente1 = new Paciente("Francesc", "Tàpia Martorell", 19);
        Paciente paciente2 = new Paciente("John", "Makensi Father", 27);
        Paciente paciente3 = new Paciente("Bobi", "Nigeria", 38);
        
        archivador.add(paciente1);
        archivador.add(paciente2);
        archivador.add(paciente3);
        
        System.out.println("TOTAL FICHAS: " + archivador.size());
        System.out.println(archivador);
        
        archivador.remove(paciente2);
        System.out.println("TOTAL FICHAS: " + archivador.size());
        System.out.println(archivador);
    }
}
