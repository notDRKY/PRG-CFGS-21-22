/*
 * 1. La clase Paciente permite representar un paciente mediante los atributos: nombre
 * (cadena), edad (entero), estado (entero entre 1 -más grave- y 5 -menos grave-, 6 si está
 * curado), y con las siguientes operaciones:
 * 
 *      public Paciente (String n, int e) . Constructor de un objeto Paciente de
 *      nombre n , de e años y cuyo estado es un valor aleatorio entre 1 y 5.
 * 
 *      public int getEdad() . Consultor que devuelve edad.
 * 
 *      public int getEstado() . Consultor que devuelve estado.
 * 
 *      public void mejorar() . Modificador que incrementa en uno el estado del
 *      paciente (mejora al paciente)
 * 
 *      public void empeorar() . Modificador que decrementa en uno el estado del
 *      paciente (empeora al paciente)
 * 
 *      public String toString() . Transforma el paciente en un String . Por ejemplo,
 * 
 *              1 | Pepe Pérez 46 5
 * 
 *      public int compareTo(Paciente o) . Permite comparar dos pacientes. Se
 *      considera menor el paciente más leve. A igual gravedad, se considera menor el
 *      paciente más joven. Ejemplo:
 * 
 *              Teniendo a David 40 3 , Pepe 25 3 y Juan 35 5 :
 * 
 *              1 | David.compareTo(Juan) = 2
 *              2 | Pepe.compareTo(Juan) = -2
 *              3 | David.compateTo(Pepe) = 15
 */
package gestionhospital;

public class Paciente {

    // ATRIBUTOS DE LA CLASE PACIENTE:
    private String nombre;
    private int edad;
    private int estado;

    // MÉTODOS DE LA CLASE PACIENTE: 
    public void mejorar() {
        this.estado++;
    }

    public void empeorar() {
        this.estado--;
    }
    
    // COMPARE TO
    public int compareTo(Paciente x) {
        // Se considera menor el paciente más leve. menor el más leve. (estado >)
        int diferencia = x.getEstado() - this.getEstado();
        if (diferencia == 0) {
            // A igual gravedad, se considera menor el paciente más joven. (edad <)
            diferencia = this.getEdad() - x.getEdad();
        }
        return diferencia;
    }

    // TO STRING
    @Override
    public String toString() {
        return nombre + " " + edad + " "+ estado;
    }

    // CONSTRUCTORES:
    public Paciente(String n, int e) {
        this.nombre = n; // No hace falta this.
        this.edad = e;  // No hace falta this.
        this.estado = (((int) (Math.random() * 5)) + 1); // No hace falta this. Genera un número aleatorio entre 1 y 5.
    }
    
    // GETTERS
    public int getEdad() {
        return edad;
    }

    public int getEstado() {
        return estado;
    }

}
