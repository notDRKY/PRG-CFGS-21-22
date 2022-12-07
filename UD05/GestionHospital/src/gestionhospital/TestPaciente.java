/*
 * 2. Diseñar una clase Java TestPaciente que permita probar la clase Paciente y sus
 * métodos. Para ello se desarrollará el método main en el que:
 * 
 *      Se crearán dos pacientes: "Antonio" de 20 años y "Miguel" de 30 años.
 * 
 *      Imprimir el estado inicial de los dos pacientes.
 * 
 *      Mostrar los datos del que se considere menor (según el criterio de compareTo
 *      de la clase Paciente ).
 * 
 *      Aplicar "mejoras" al paciente más grave hasta que los dos pacientes tengan el
 *      mismo estado.
 * 
 *      Imprimir el estado final de los dos pacientes.
 * 
 */
package gestionhospital;

public class TestPaciente {

    public static void main(String[] args) {

        // Se crearán dos pacientes: "Antonio" de 20 años y "Miguel" de 30 años.
        Paciente paciente1 = new Paciente("Antonio", 20);
        Paciente paciente2 = new Paciente("Miguel", 30);

        // Imprimir el estado inicial de los dos pacientes.
        System.out.println(paciente1);
        System.out.println(paciente2);

        // Mostrar los datos del que se considere menor (según el criterio de compareTo
        // de la clase Paciente ).
        if (paciente1.compareTo(paciente2) < 0) {
            System.out.println(paciente2);
        } else {
            System.out.println(paciente1);
        }

        // Aplicar "mejoras" al paciente más grave hasta que los dos pacientes tengan el
        // mismo estado. GRACIAS CARLOS TKM <3
        while(paciente1.getEstado() != paciente2.getEstado()) {
            if (paciente1.getEstado() < paciente2.getEstado()) {
                paciente1.mejorar();
            } else {
                paciente2.mejorar();
            }
        }

        // Imprimir el estado final de los dos pacientes.
        System.out.println(paciente1);
        System.out.println(paciente2);

    }
}
