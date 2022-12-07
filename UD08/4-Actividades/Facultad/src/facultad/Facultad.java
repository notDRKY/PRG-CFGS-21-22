/*
 * 1. Realizar una aplicación para la gestión de la información de las personas vinculadas a
 * una Facultad , que se pueden clasificar en tres tipos: estudiantes, profesores y personal
 * de servicio.
 *
 *      A continuación, se detalla qué tipo de información debe gestionar esta aplicación:
 *      Por cada Persona , se debe conocer, al menos, su nombre y apellidos , su
 *      número de identificación y su estado civil .
 *
 *      Con respecto a los Empleados , sean del tipo que sean, hay que saber su año de
 *      incorporación a la facultad y qué número de despacho tienen asignado.
 *
 *      PEREn cuanto a los Estudiantes , se requiere almacenar el curso en el que están
 *      matriculados.
 *
 *      Por lo que se refiere a los Profesores , es necesario gestionar a qué
 *      departamento pertenecen ( lenguajes , matemáticas , arquitectura , ...).
 *
 *      Sobre el Personal de servicio , hay que conocer a qué sección están
 *      asignados ( biblioteca , decanato , secretaría , ...).
 *
 * El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación.
 *
 * A continuación, debe programar las clases definidas en las que, además de los
 * constructores, hay que desarrollar los métodos correspondientes a las siguientes
 * acciones:
 *
 *      Cambio del estado civil de una persona.
 *      Reasignación de despacho a un empleado.
 *      Matriculación de un estudiante en un nuevo curso.
 *      Cambio de departamento de un profesor.
 *      Traslado de sección de un empleado del personal de servicio.
 *      Imprimir toda la información de cada tipo de individuo.
 *
 * En el método main crear un array de personas . Crear diferentes instancias de las
 * subclases e insertarlas en el array. Probar los diferentes métodos desarrollados.
 */
package facultad;

public class Facultad {

    public static void main(String[] args) {
        Persona[] listaPersonas = new Persona[6];

        listaPersonas[0] = new Estudiante("1r DAW", "Francesc", "Tàpia Martorell", "444424", "Soltero");
        listaPersonas[1] = new Estudiante("1r DAW", "Carlos", "Bocarando", "222242", "Viudo");
        listaPersonas[2] = new Profesor("Informática", "David", "Martínez Peña", "777666", "Soltero", 2019, 07);
        listaPersonas[3] = new Profesor("Informática", "David", "Espert", "555444", "Casado", 2020, 07);
        listaPersonas[4] = new PersonalDeServicio("Limpieza", "Paco", "Alcácer", "111122", "Casado", 2019, 01);
        listaPersonas[5] = new PersonalDeServicio("Reponedor", "Elena", "Flores", "333312", "Soltero", 2015, 03);

        System.out.println("______________________________________________________________________________________");
        System.out.println(listaPersonas[0].toString());
        System.out.println(listaPersonas[1].toString());
        System.out.println("______________________________________________________________________________________");
        System.out.println("______________________________________________________________________________________");
        System.out.println(listaPersonas[2].toString());
        System.out.println(listaPersonas[3].toString());
        System.out.println("______________________________________________________________________________________");
        System.out.println("______________________________________________________________________________________");
        System.out.println(listaPersonas[4].toString());
        System.out.println(listaPersonas[5].toString());
        System.out.println("______________________________________________________________________________________");
    }
}
