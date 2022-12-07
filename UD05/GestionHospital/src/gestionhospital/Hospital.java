/*
 * 3. La clase Hospital contiene la información de las camas de un hospital, así como de los
 * pacientes que las ocupan. Un Hospital tiene un número máximo de camas MAXC = 200 y
 * para representarlas se utilizará un array (llamado listaCamas ) de objetos de tipo
 * Paciente junto con un atributo ( numLibres ) que indique el número de camas libres del
 * hospital en un momento dado. El número de cada cama coincide con su posición en el
 * array de pacientes (la posición 0 no se utiliza), de manera que listaCamas[i] es el
 * Paciente que ocupa la cama i o es null si la cama está libre. Las operaciones de esta
 * clase son:
 * 
 *      public Hospital() . Constructor de un hospital. Cuando se crea un hospital,
 *      todas las camas están libres.
 * 
 *      public int getNumLibres() . Consultor del número de camas libres
 * 
 *      public boolean hayLibres() . Devuelve true si en el hospital hay camas libres y
 *      devuelve false en caso contrario.
 * 
 *      public int primeraLibre() . Devuelve el número de la primera cama libre del
 *      array listaCamas si hay camas libres o devuelve un 0 si no las hay.
 * 
 *      public void ingresarPaciente(String n, int e) throws
 *      HospitalLlenoException Si hay camas libres, la primera de ellas (la de número
 *      menor) pasa a estar ocupada por el paciente de nombre n y edad e . Si no hay
 *      camas libres, lanza una excepción.
 * 
 *      private void darAltaPaciente(int i) . La cama i del hospital pasa a estar libre.
 *      (Afectará al número de camas libres)
 * 
 *      public void darAltas() . Se mejora el estado (método mejorar() de Paciente )
 *      de cada uno de los pacientes del hospital y a aquellos pacientes sanos (cuyo
 *      estado es 6) se les da el alta médica (invocando al método darAltaPaciente ).
 * 
 *      public String toString() . Devuelve un String con la información de las
 *      camas del hospital. Por ejemplo,
 * 
 *      1 | 1 María Medina 30 4
 *      2 | 2 Pepe Pérez 46 5
 *      3 | 3 libre
 *      4 | 4 Juan López 50 1
 *      5 | 5 libre
 *      6 | ...
 *      7 | 199 Andrés Sánchez 29 3
 */
package gestionhospital;

class Hospital {

    // ATRIBUTOS DE LA CLASE HOSPITAL
    private static final int MAXC = 200;
    private Paciente[] listaCamas;
    private int numLibres;

    // (MÉTODOS) CONSTRUCTORES DE LA CLASE HOSPITAL
    public Hospital() {
        this.listaCamas = new Paciente[MAXC];
        this.numLibres = (MAXC - 1);
    }

    // MÉTODOS DE LA CLASE HOSPITAL
    public int getNumLibres() {
        return numLibres;
    }

    public boolean hayLibres() {
        return this.numLibres > 0;
    }

    public int primeraLibre() {
        int pos = 1; // La cama 0 no se usa, por uso pos empieza en 1.
        while (listaCamas[pos] != null) { // Mientras no sea nula la posición incrementaremos.
            pos++;
        } // Cuando el bucle encuentre un nulo, devolverá la posición en la que esté este.
        return pos;
    }

    public void ingresarPaciente(String n, int e) throws HospitalLlenoException {
        Paciente nuevoPaciente = new Paciente(n, e); //Creamos un nuevo paciente con los paramentros que nos han introducido.
        if (hayLibres()) { // Si se cumple, añadiremos al array de Paciente el nuevoPaciente.
            listaCamas[primeraLibre()] = nuevoPaciente;
            numLibres--; // Hay que restar el número de camas totales ya que hemos ocupado una cama.
        } else { // Si hayLibres() no devuelve true se lanzará la excepcion.
            throw new HospitalLlenoException();
        }
    }

    static class HospitalLlenoException extends Exception {

        public HospitalLlenoException() {
        }
    }

    private void darAltaPaciente(int i) {
        listaCamas[i] = null;
        numLibres++;
    }

    public void darAltas() {
        for (int pos = 1; pos <= (MAXC - 1); pos++) { // Bucle que llegará a (MAXC - 1)
            if (listaCamas[pos] != null) { // if para comprobar si el valor de listaCamas es nulo.
                listaCamas[pos].mejorar(); // si el valor no es nulo, aplicaremos el método .mejorar()
                if (listaCamas[pos].getEstado() > 5) { // una vez incrementado hago otro if para comprobar si el valor anterior
                    this.darAltaPaciente(pos); // es mayor de 5, en el caso de que lo sea, le daremos el alta del hospital.
                }
            }
        }
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int camas = 1; camas < MAXC; camas++) { // for para recorrer el arry de Pacientes 
            if (listaCamas[camas] != null) { // if para comprobar si la posición del array es nula (cama vacía)
                cadena += camas + " " + listaCamas[camas] + "\n"; // si la cama no está vacía se imprimirá el contenido del array.
            } else {
                cadena += camas + " libre " + "\n"; // sí la cama está vacía imprimiremos "libre".
            }
        }
        return cadena;
    }

}
