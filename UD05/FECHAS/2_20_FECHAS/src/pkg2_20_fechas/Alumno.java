/*
 * 20. Crear una clase Alumno con los atributos codigo , nombre , apellidos , fecha_nacimiento ,
 * calificacion . La fecha de nacimiento deberá introducirse como una fecha. Crear
 * constructor, métodos setter y getter y toString . Crear una instancia con los
 * siguientes valores 1 , 'Luis' , 'Mas Ros' , 05/10/1990 , 7.5 . Mostrar los datos del
 * alumno además de su edad.
 * 1 | Alumno{codigo=1, nombre=Luis, apellidos=Mas Ros, fecha=1990-10-05,
 *   | calificacion=7.5, edad= 31}
 */
package pkg2_20_fechas;

import java.time.LocalDate;
import java.time.Period;

public class Alumno {
    private int codigo;
    private String nombre;
    private String apellidos;
    private LocalDate fecha_nacimiento; // debe introducirse cómo fecha
    private double calificacion;

    public Alumno(int codigo, String nombre, String apellidos, LocalDate fecha_nacimiento, double calificacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        //LocalDate fechaActual = LocalDate.now();
        Period periodoTrans = Period.between(fecha_nacimiento, LocalDate.now());
        return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos
                + ", fecha_nacimiento=" + fecha_nacimiento + ", calificacion=" + calificacion + ", edad=" + periodoTrans.getYears() +'}';
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    public static void main(String[] args) {
        /*
        * 1 | Alumno{codigo=1, nombre=Luis, apellidos=Mas Ros, fecha=1990-10-05,
        *   | calificacion=7.5, edad= 31}
        */
        Alumno alumnoPrueba = new Alumno(1, "Luis", "Mas Ros", LocalDate.of(1990, 10, 05), 7.5);
        System.out.println(alumnoPrueba);
    }
    
}
