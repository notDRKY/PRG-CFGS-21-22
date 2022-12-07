package UD05._1.gestionEmpleados;

import java.util.Calendar;
import java.util.Objects;
/**
 * Clase EMPLEADOS
 * 
 * Contiene información y métodos relacionados con los empleados de la empresa
 * 
 * @author Francesc Tàpia Martorell
 * @version 1.0
 */
class Empleados {

    // ATRIBUTOS DE LA CLASE
    
    private static final int IMC = 15000;
    private String nombre;
    private String dni;
    /**
     * 
     */
    private int anoIngreso;
    private double sueldoBrutoAnual;

    // MÉTODOS DE LA CLASE
    public int antiguedad() {
        int anoActual = Calendar.getInstance().get(Calendar.YEAR);
        return Math.max(0, anoActual - this.anoIngreso);
    }

    public void incrementarSueldo(double porcentaje) {
        this.sueldoBrutoAnual = (this.sueldoBrutoAnual * (1 + (porcentaje / 100)));
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDNI: " + dni + "\nAño de ingreso: "
                + anoIngreso + "\nSueldo bruto anual: " + sueldoBrutoAnual + "€";
    }

    // EQUALS PARA COMPARAR DOS OBJETOS
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleados other = (Empleados) obj;
        return Objects.equals(this.dni, other.dni);
    }

    //COMPARE TO
    public int compareTo(Empleados o){
        return (this.getDni().compareTo(o.getDni()));
    }
    
    // CALCULAR IRPF
    public static double calcularIRPF(double salario) {
        double irpf = 0;
        salario /= 12;
        if (salario >= 0 && salario < 800) {
            irpf = 3;
        } else if (salario < 1000) {
            irpf = 10;
        } else if (salario < 1500) {
            irpf = 15;
        } else if (salario < 2100) {
            irpf = 20;
        } else if (salario >= 2100) {
            irpf = 30;
        }
        return irpf;
    }

    // CONSTRUCTORES
    public Empleados(String nombre, String dni, int anoIngreso, double sueldoBrutoAnual) {
        this.nombre = nombre;
        this.dni = dni;
        this.anoIngreso = anoIngreso;
        this.sueldoBrutoAnual = sueldoBrutoAnual;
    }

    public Empleados(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.anoIngreso = Calendar.getInstance().get(Calendar.YEAR);
        this.sueldoBrutoAnual = IMC;
    }

    // GETTERS
    public static int getIMC() {
        return IMC;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }

    public double getSueldoBrutoAnual() {
        return sueldoBrutoAnual;
    }

    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setAnoIngreso(int anoIngreso) {
        this.anoIngreso = anoIngreso;
    }

    public void setSueldoBrutoAnual(double sueldoBrutoAnual) {
        this.sueldoBrutoAnual = sueldoBrutoAnual;
    }
}