/*
 * 20. Crear un clase llamada Medico con las siguientes propiedades y métodos:
 *      Propiedades:
 *          codMedico
 *          nombre
 *          apellidos
 *          dni
 *          direccion
 *          telefono
 *          poblacion
 *          codPostal
 *          fechaNacimiento
 *          especialidad
 *          sueldo
 *      Métodos:
 *          Medico: Permite crear una instancia con los datos de un médico.
 *          Métodos get. Recuperan datos de la instancia del objeto.
 *          Métodos set. Asignan datos a la instancia del objeto.
 *          retencionMedico : Permite calcular la retención aplicada al sueldo del médico. Se le pasa el dato
 *          del porcentaje de retención.
 *          mostrarDatos : Muestra los datos del médico.
 *      Crear una clase principal main ejecutable que:
 *          Crear dos instancias de la clase Medico llamados medicoDigestivo y medicoTraumatologo .
 *          Cambia el sueldo del medicoTraumatologo .
 *          Muestra el sueldo del medicoTraumatologo .
 *          Cambia el dni del medicoDigestivo .
 *          Muestra el dni del medicoDigestivo .
 *          Calcula la retención de las dos instancias de la clase Medico que hemos creado.
 *          Mostrar los datos de las dos instancias de la clase Medico que hemos creado, así como las
 *          retenciones y los sueldos finales de cada una.
 */

package medico;

// IMPORTS
import java.util.Scanner;

// CLASE MEDICO
public class Medico {
    
    // DECLARACION DE PROPIEDADES DE LA CLASE MEDICO
    private String codMedico;
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String telefono;
    private String poblacion;
    private String codPostal;
    private String fechaNacimiento;
    private String especialidad;
    private double sueldo;
    
    // METODOS DE LA CLASE
    public double retencionCompleta (double retencion){
        return (this.sueldo - retencionMedico(retencion));  
                
    }
    
    public double retencionMedico (double usrRetencion){ // DATO EN PORCENTAJE
        return (this.sueldo * (usrRetencion / 100));
    }
    
    public String mostrarDatos() {
        return "Medico: \n" + "codMedico=" + codMedico 
                + ",\n nombre=" + nombre + ",\n apellidos=" + apellidos 
                + ",\n dni=" + dni + ",\n direccion=" + direccion 
                + ",\n telefono=" + telefono + ",\n poblacion=" + poblacion 
                + ",\n codPostal=" + codPostal + ",\n fechaNacimiento=" + fechaNacimiento 
                + ",\n especialidad=" + especialidad + ",\n sueldo=" + sueldo;
    }
    
    // METODOS CONSTRUCTORES
    Medico (){
        
    }
    
    Medico (String codMedico, String nombre,
            String apellidos, String dni,
            String direccion, String telefono,
            String poblacion, String codPostal,
            String fechaNacimiento, String especialidad, double sueldo){
        
        this.codMedico = codMedico;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.poblacion = poblacion;
        this.codPostal = codPostal;
        this.fechaNacimiento = fechaNacimiento;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }
    
    // METODOS GET DE LA CLASE MEDICO

    public String getCodMedico() {
        return codMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSueldo() {
        return sueldo;
    }
        
    // METODOS SET DE LA CLASE MEDICO

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    // METODO MAIN DE LA CLASE MEDICO
    public static void main(String[] args) {
        // DECLARACION DE VARIABLES Y CREACION DE OBJETO TECLADO
        String usrCodMedico, usrNombre, usrApellidos, usrDni, usrDireccion,
                usrTelefono, usrPoblacion, usrCodPostal, usrFechaNacimiento,
                usrEspecialidad;
        double usrSueldo;
        Scanner teclado = new Scanner(System.in);
        
        // RECOGIDA DE DATOS DEL USUARIO Y CREACION DE OBJETO MEDICO DIGESTIVO
        System.out.println("Introduce los datos de médico digestivo: ");
        System.out.print("Codigo medico: ");
        usrCodMedico = teclado.nextLine();
        System.out.print("Nombre: ");
        usrNombre = teclado.nextLine();
        System.out.print("Apellidos: ");
        usrApellidos = teclado.nextLine();
        System.out.print("DNI: ");
        usrDni = teclado.nextLine();
        System.out.print("Direccion: ");
        usrDireccion = teclado.nextLine();
        System.out.print("Telefono: ");
        usrTelefono = teclado.nextLine();
        System.out.print("Poblacion: ");
        usrPoblacion = teclado.nextLine();
        System.out.print("Codigo postal: ");
        usrCodPostal = teclado.nextLine();
        System.out.print("Fecha de nacimiento: ");
        usrFechaNacimiento = teclado.nextLine();
        System.out.print("Especialidad: ");
        usrEspecialidad = teclado.nextLine();
        System.out.print("Sueldo: ");
        usrSueldo = teclado.nextDouble();
        
        Medico medicoDigestivo = new Medico(usrCodMedico, usrNombre, usrApellidos,
        usrDni, usrDireccion, usrTelefono, usrPoblacion, usrCodPostal, usrFechaNacimiento,
        usrEspecialidad, usrSueldo);
        
        // RECOGIDA DE DATOS DEL USUARIO Y CREACION DE OBJETO MEDICO TRAUMATOLOGO
        System.out.println("\nIntroduce los datos de médico traumatologo: ");
        System.out.print("Codigo medico: ");
        usrCodMedico = teclado.nextLine();
        System.out.print("Nombre: ");
        usrNombre = teclado.nextLine();
        System.out.print("Apellidos: ");
        usrApellidos = teclado.nextLine();
        System.out.print("DNI: ");
        usrDni = teclado.nextLine();
        System.out.print("Direccion: ");
        usrDireccion = teclado.nextLine();
        System.out.print("Telefono: ");
        usrTelefono = teclado.nextLine();
        System.out.print("Poblacion: ");
        usrPoblacion = teclado.nextLine();
        System.out.print("Codigo postal: ");
        usrCodPostal = teclado.nextLine();
        System.out.print("Fecha de nacimiento: ");
        usrFechaNacimiento = teclado.nextLine();
        System.out.print("Especialidad: ");
        usrEspecialidad = teclado.nextLine();
        System.out.print("Sueldo: ");
        usrSueldo = teclado.nextDouble();
        
        Medico medicoTraumatologo = new Medico(usrCodMedico, usrNombre, usrApellidos,
        usrDni, usrDireccion, usrTelefono, usrPoblacion, usrCodPostal, usrFechaNacimiento,
        usrEspecialidad, usrSueldo);
        
        System.out.print("\nRealiza un cambio en el sueldo de medico traumatologo: ");
        usrSueldo= teclado.nextDouble();
        medicoTraumatologo.setSueldo(usrSueldo);
        System.out.print("El nuevo salario de medico traumatologo es: " 
                + medicoTraumatologo.getSueldo());
        
        System.out.print("\nRealiza un cambio en el DNI de medico digestivo");
        usrDni= teclado.nextLine();
        medicoDigestivo.setDni(usrDni);
        System.out.print("\nEl nuevo DNI de medico digestivo es: " 
                + medicoDigestivo.getDni());
        
        System.out.print("\nIntroduce el porcentaje de retencion que desea aplicar"
                + " a la retencion de los medicos: ");
        double usrRetencion = teclado.nextDouble();
        System.out.print("\n La retencion de medico digestivo es: " 
                + medicoDigestivo.retencionMedico(usrRetencion));
        System.out.print(" La retencion de medico traumatologo es: " 
                + medicoTraumatologo.retencionMedico(usrRetencion));
       
        System.out.println("\nMedico digestivo: \n" + medicoDigestivo.mostrarDatos() 
                + " Retencion: " + medicoDigestivo.retencionMedico(usrRetencion) 
                + " Salario final: " + (medicoDigestivo.getSueldo() 
                        - medicoDigestivo.retencionMedico(usrRetencion)));
        
        System.out.println("Medico traumatologo: \n" + medicoTraumatologo.mostrarDatos() 
                + " Retencion: " + medicoTraumatologo.retencionMedico(usrRetencion) 
                + " Salario final: " + (medicoTraumatologo.getSueldo() 
                        - medicoTraumatologo.retencionMedico(usrRetencion)));
        
        System.out.println("\nMedico digestivo: \n" + medicoDigestivo.mostrarDatos() 
                + "\nSalario final: " + (medicoDigestivo.getSueldo() 
                        - medicoDigestivo.retencionMedico(usrRetencion)));
        
        System.out.println("Medico traumatologo: \n" + medicoTraumatologo.mostrarDatos() 
                + "\nSalario final: " + medicoTraumatologo.retencionCompleta(usrRetencion));
    }
    
}
