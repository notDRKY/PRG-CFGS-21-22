/*
 *14. Crear un clase llamada Proveedor con las siguientes propiedades:
 *  CIF
 *  nombreEmpresa
 *  descripcion
 *  sector
 *  direccion
 *  telefono
 *  poblacion
 *  codPostal
 *  correo
 *Crear para la clase Proveedor los métodos:
 *  Constructor que permite crear una instancia con los datos de un proveedor.
 *  Métodos get (getters).
 *  Métodos set (setters).
 *  Método verificaCorreo que devuelve true si la dirección de correo contiene @ .
 *  Método que muestre todos los datos del proveedor.
 *Crear una clase principal main ejecutable que:
 *  Cree una instancia del objeto Proveedor llamado proveedor .
 *  Cambie el sector del proveedor .
 *  Muestre el sector del proveedor .
 *  Verifique si el correo es válido.
 *  Muestre todos los datos del proveedor .
 */
package proveedor;

import java.util.Scanner;

// CLASE PROVEEDOR
public class Proveedor {
    
    // ATRIBUTOS DE LA CLASE PROVEEDOR
    private String cif;
    private String nombreEmpresa;
    private String descripcion;
    private String sector;
    private String direccion;
    private String telefono;
    private String poblacion;
    private String codPostal;
    private String correo;

    // CONSTRUCTOR DE LA CLASE PROVEEDOR
    Proveedor(String cif, String nombreEmpresa, String descripcion, 
            String sector, String direccion, String telefono, String poblacion, 
            String codPostal, String correo) {
        
        this.cif = cif;
        this.nombreEmpresa = nombreEmpresa;
        this.descripcion = descripcion;
        this.sector = sector;
        this.direccion = direccion;
        this.telefono = telefono;
        this.poblacion = poblacion;
        this.codPostal = codPostal;
        this.correo = correo;
    }
    
    // GETTERS
    String getCif() {
        return cif;
    }

    String getNombreEmpresa() {
        return nombreEmpresa;
    }

    String getDescripcion() {
        return descripcion;
    }

    String getSector() {
        return sector;
    }

    String getDireccion() {
        return direccion;
    }

    String getTelefono() {
        return telefono;
    }

    String getPoblacion() {
        return poblacion;
    }

    String getCodPostal() {
        return codPostal;
    }

    String getCorreo() {
        return correo;
    }
    
    // SETTERS
    void setCif(String cif) {
        this.cif = cif;
    }

    void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    void setSector(String sector) {
        this.sector = sector;
    }

    void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    void setCorreo(String correo) {
        this.correo = correo;
    }
    
    // METODO QUE MUESTRE TODOS LOS DATOS DEL PROVEEDOR
    String todosDatosProveedor() {
        return "Proveedor: \n" + " CIF=" + cif + ",\n Nombre Empresa=" + nombreEmpresa + 
                ",\n Descripcion=" + descripcion + ",\n Sector=" + sector + 
                ",\n Direccion=" + direccion + ",\n Telefono=" + telefono + 
                ",\n Poblacion=" + poblacion + ",\n Cod Postal=" + codPostal + 
                ",\n Correo=" + correo;
    }
           
    // METODO verificaCorreo QUE DEVUELVE TRUE SI LA DIRECCION DE CORREO CONTIENE @.
    boolean verificaCorreo(){
        return ((getCorreo().indexOf("@") >= (0))? true:false);
        //return (getCorreo().indexOf("@") >= (0)); OTRAS OPCIONES
        //return getCorreo().contains("@");
    }
    
    // METODO MAIN DE LA CLASE PROVEEDOR
    public static void main(String[] args) {
        String usrCif, usrNombreEmpresa, usrDescripcion, usrSector, 
                usrDireccion, usrTelefono, usrPoblacion, usrCodPostal, usrCorreo;
        Scanner teclado = new Scanner (System.in);

        System.out.print("Registre su empresa: ");
        System.out.print("Introduzca numero CIF: ");
        usrCif= teclado.nextLine();
        System.out.print("Introduzca el nombre de su empresa: ");
        usrNombreEmpresa= teclado.nextLine();
        System.out.print("Introduzca una breve descripcion de su empresa: ");
        usrDescripcion= teclado.nextLine();
        System.out.print("Introduzca el sector de su empresa: ");
        usrSector= teclado.nextLine();
        System.out.print("Introduza la direccion de su empresa: ");
        usrDireccion= teclado.nextLine();
        System.out.print("Introduzca el telefono de su empresa: ");
        usrTelefono= teclado.nextLine();
        System.out.print("Introduzca la poblacion donde se ubica su empresa: ");
        usrPoblacion= teclado.nextLine();
        System.out.print("Introduzca el codigo postal (CP) de la poblacion: ");
        usrCodPostal= teclado.nextLine();
        System.out.print("Introduzca el correo de su empresa: ");
        usrCorreo= teclado.nextLine();
        
        Proveedor proveedor = new Proveedor(usrCif, usrNombreEmpresa, usrDescripcion, 
                usrSector, usrDireccion, usrTelefono, usrPoblacion, usrCodPostal, usrCorreo);
        
        System.out.println("Nuevo proveedor registrado: ");
        System.out.println(proveedor.todosDatosProveedor());
        System.out.println("Introduce de nuevo el sector: ");
        usrSector=teclado.nextLine();
        proveedor.setSector(usrSector);
        System.out.println("El nuevo sector sera: " + proveedor.getSector());
        System.out.println("La direccion de correo electronico es: " + proveedor.verificaCorreo());
        
    }
    
}
