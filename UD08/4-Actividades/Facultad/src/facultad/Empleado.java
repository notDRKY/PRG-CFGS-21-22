/*
 * Con respecto a los Empleados , sean del tipo que sean, hay que saber su año de
 * incorporación a la facultad y qué número de despacho tienen asignado.
 */
package facultad;

public class Empleado extends Persona {

    protected int anoDeIncorporacion;
    protected int numDespacho;

    public Empleado(String nombre, String apellidos, String numDeIdentificacion,
            String estadoCivil, int anoDeIncorporacion, int numDespacho) {
        super(nombre, apellidos, numDeIdentificacion, estadoCivil);
        this.anoDeIncorporacion = anoDeIncorporacion;
        this.numDespacho = numDespacho;
    }
    
    // Reasignación de despacho a un empleado.
    
    @Override
    public String toString() {
       return super.toString() + "\nAño de incorporación: " + anoDeIncorporacion 
               + "\nNúmero despacho: " + numDespacho;
    }

    public int getAnoDeIncorporacion() {
        return anoDeIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setAnoDeIncorporacion(int anoDeIncorporacion) {
        this.anoDeIncorporacion = anoDeIncorporacion;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }
}
