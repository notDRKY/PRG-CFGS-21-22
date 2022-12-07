/*
19. Crear una clase llamada Hospital con las siguientes propiedades y metodos:
 *      Propiedades:
 *          codHospital
 *          nombreHospital
 *          direccion
 *          telefono
 *          poblacion
 *          codPostal
 *          habitacionesTotales
 *          habitacionesOcupadas
 *      Metodos:
 *          Hospital: Permite crear una instancia con los datos de un hospital.
 *          Metodos get.
 *          Metodos set.
 *          Metodo ingreso que incrementa las habitaciones ocupadas. No puede realizarse el ingreso si
 *          las habitaciones ocupadas son iguales a las habitaciones totales del hospital. Devuelve true si
 *          se ha podido realizar el ingreso.
 *          Metodo alta que decrementa las habitaciones ocupadas. No puede realizarse el alta las
 *          habitaciones ocupadas son 0. Devuelve true si se ha podido realizar el alta.
 *          Metodo que muestre todos los datos del hospital.
 *      Crear una clase principal main ejecutable que:
 *          Cree una instancia de la clase Hospital llamada hospitalRibera .
 *          Cambie el numero de habitaciones de la instancia hospitalRibera .
 *          Muestre el numero de habitaciones de la instancia hospitalRibera .
 *          Realiza un ingreso de la instancia hospitalRibera .
 *          Muestra las habitaciones ocupadas de la instancia hospitalRibera .
 *          Realiza un alta de la instancia hospitalRibera .
 *          Muestra las habitaciones ocupadas de la instancia hospitalRibera .
 *          Muestre todos los datos de la instancia hospitalRibera .
 *
 */
package hospital;

import java.util.Scanner;

// CLASE HOSPITAL
public class Hospital {
    
    // PROPIEDADES DE LA CLASE HOSPITAL
    private String codHospital;
    private String nombreHospital;
    private String direccion;
    private String telefono;
    private String codPostal;
    private int habitacionesTotales;
    private int habitacionesOcupadas;
    
    // METODOS CONSTRUCTORES
    // CONSTRUCTOR POR DEFECTO
    Hospital (){
        
    }
    
    //CONSTRUCTOR 2
    Hospital (String codHospital, String nombreHospital, String direccion,
            String telefono, String codPostal, int habitacionesTotales,
            int habitacionesOcupadas){
        
        this.codHospital = codHospital;
        this.nombreHospital = nombreHospital;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codPostal = codPostal;
        this.habitacionesTotales = habitacionesTotales;
        this.habitacionesOcupadas = habitacionesOcupadas;
        
    }
    // METODOS DE LA CLASE HOSPITAL
    public String todosDatosHospital() {
        return "Hospital: \n" + " codHospital = " + codHospital + "\n nombreHospital = " + 
                nombreHospital + "\n direccion =" + direccion + "\n telefono= " + 
                telefono + "\n codPostal= " + codPostal + "\n habitacionesTotales= " + 
                habitacionesTotales + "\n habitacionesOcupadas= " + habitacionesOcupadas;
    }
    
    /* 
    Metodo ingreso que incrementa las habitaciones ocupadas. No puede realizarse el ingreso si
    las habitaciones ocupadas son iguales a las habitaciones totales del hospital. Devuelve true si
    se ha podido realizar el ingreso.
    */
    public boolean incremetoHabitaciones(int numeroAumento){
        boolean aux; 
        aux= ((numeroAumento + this.habitacionesOcupadas) < this.habitacionesTotales);
        this.habitacionesOcupadas = (aux)? (this.habitacionesOcupadas + numeroAumento):(this.habitacionesOcupadas);
        return (aux);
    }
    
    /* 
    Metodo alta que decrementa las habitaciones ocupadas. No puede realizarse el alta las
    habitaciones ocupadas son 0. Devuelve true si se ha podido realizar el alta.
    */
    public boolean decrementoHabitaciones(int numeroDecremento){
        boolean aux; 
        aux= ((numeroDecremento - this.habitacionesOcupadas) < 0);
        this.habitacionesOcupadas = (aux)? (this.habitacionesOcupadas - numeroDecremento):(this.habitacionesOcupadas);
        return (aux);
    }
    
    // METODOS GET
    public String getCodHospital() {
        return codHospital;
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public int getHabitacionesTotales() {
        return habitacionesTotales;
    }

    public int getHabitacionesOcupadas() {
        return habitacionesOcupadas;
    }
    
    // METODOS SETT

    public void setCodHospital(String codHospital) {
        this.codHospital = codHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public void setHabitacionesTotales(int habitacionesTotales) {
        this.habitacionesTotales = habitacionesTotales;
    }

    public void setHabitacionesOcupadas(int habitacionesOcupadas) {
        this.habitacionesOcupadas = habitacionesOcupadas;
    }
    
    // METODO MAIN DE LA CLASE HOSPITAL
    public static void main(String[] args) {
        //INICIALIZACION DE VARIABLES Y CREACION DE OBJETO SCANNER
        Scanner teclado = new Scanner(System.in);
        String usrCodHospital, usrNombreHospital,usrDireccion, usrTelefono, codPostal;
        int usrHabitacionesTotales, usrHabitacionesOcupadas, usrIncremento, usrDecremento;
        
        System.out.println("Registre los datos de su Hospital: ");
        System.out.print("Introduzca el codigo de su hospital: ");
        usrCodHospital = teclado.nextLine();
        System.out.print("Introduzca el nombre de su hospital: ");
        usrNombreHospital = teclado.nextLine();
        System.out.print("Introduzca la direccion de su hospital:");
        usrDireccion = teclado.nextLine();
        System.out.print("Introduzca el numero de telefono de su hospital: ");
        usrTelefono = teclado.nextLine();
        System.out.print("Introduzca el codigo postal (CP) de la ubicacion del hospital: ");
        codPostal = teclado.nextLine();
        System.out.print("Introduzca el numero de habitaciones totales de su hospital: ");
        usrHabitacionesTotales = teclado.nextInt();
        System.out.print("Introduzca el numero de habitaciones ocupadas de su hospital: ");
        usrHabitacionesOcupadas = teclado.nextInt();
        
        // CREACION DE OBJETO HOSPITAL DE LA CLASE HOSPITAL
        Hospital hospital1 = new Hospital(usrCodHospital, usrNombreHospital, 
                usrDireccion, usrTelefono, codPostal, usrHabitacionesTotales, 
                usrHabitacionesOcupadas);
        
        // AUMENTO DE HABITACIONES TOTALES
        System.out.print("Cambie el valor inicial de las habitaciones totales: ");
        usrIncremento = teclado.nextInt();
        hospital1.setHabitacionesTotales(usrIncremento);
        System.out.println("Hay un total de " + hospital1.getHabitacionesTotales() + " habitaciones en el hospital.\n");
        
        // AUMENTO DE HABITACIONES OCUPADAS
        System.out.print("Cuantas habitaciones van a ser ocupadas por pacientes? ");
        usrIncremento = teclado.nextInt();
        System.out.print("Se ha producido el incremento de habitaciones ocupadas: " + 
                hospital1.incremetoHabitaciones(usrIncremento) + "\n");
        System.out.println("Ahora mismo hay: " + hospital1.getHabitacionesOcupadas() + " habitaciones ocupadas.\n");
        
        // DECREMENTO DE HABITACIONES OCUPADAS
        System.out.print("Cuantas habitaciones van a ser desocupadas por pacientes? ");
        usrDecremento = teclado.nextInt();
        System.out.print("Se ha producido la decrecion de habitaciones ocupadas: " + 
                hospital1.decrementoHabitaciones(usrDecremento) + "\n");
        System.out.print("Ahora mismo hay: " + hospital1.getHabitacionesOcupadas() + " habitaciones ocupadas.\n");
        
        // TODOS LOS DATOS DE EL HOSPITAL 1
        System.out.println("\n" + hospital1.todosDatosHospital());
    }
    
}
