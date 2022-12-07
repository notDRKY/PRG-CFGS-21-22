/*
 * 4. En la clase GestorHospital se probará el comportamiento de las clases anteriores. El
 * programa deberá:
 * 
 *      Crear un hospital.
 * 
 *      Ingresar a cinco pacientes con los datos simulados introducidos directamente
 *      en el programa.
 * 
 *      Realizar el proceso de darAltas mientras que el número de habitaciones libres
 *      del hospital no llegue a una cantidad (por ejemplo 198).
 * 
 *      Mostrar los datos del hospital cuando se considere oportuno para comprobar
 *      la corrección de las operaciones que se hacen
 */
package gestionhospital;

public class GestorHospital {

    public static void main(String[] args) {
        Hospital hospital1 = new Hospital();

        try {
            hospital1.ingresarPaciente("Paco", 45);
        } catch (Hospital.HospitalLlenoException ex) {
            System.out.println("ERROR. No se ha podido ingresar al paciente.");
        }

        try {
            hospital1.ingresarPaciente("Ramón", 27);
        } catch (Hospital.HospitalLlenoException ex) {
            System.out.println("ERROR. No se ha podido ingresar al paciente.");
        }

        try {
            hospital1.ingresarPaciente("Gerardo", 31);
        } catch (Hospital.HospitalLlenoException ex) {
            System.out.println("ERROR. No se ha podido ingresar al paciente.");
        }

        try {
            hospital1.ingresarPaciente("Maricarmen", 42);
        } catch (Hospital.HospitalLlenoException ex) {
            System.out.println("ERROR. No se ha podido ingresar al paciente.");
        }

        try {
            hospital1.ingresarPaciente("Sofia", 52);
        } catch (Hospital.HospitalLlenoException ex) {
            System.out.println("ERROR. No se ha podido ingresar al paciente.");
        }
        
        System.out.println("\n______________________________________________\n");
        System.out.println(hospital1);
        
        while (hospital1.getNumLibres() <= 198) {
            hospital1.darAltas();
        }
        
        System.out.println("\n______________________________________________\n");
        System.out.println(hospital1);
    }
}
