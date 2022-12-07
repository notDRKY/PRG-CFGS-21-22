package UD05._1.gestionEmpleados;

import java.util.Scanner;

public class TestEmpleados {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Se crearán dos empleados utilizando los datos que introduzca el usuario.
        System.out.println("INTRODUCE LOS DATOS DEL EMPLEADO 1: ");
        System.out.print("Introduce el nombre: ");
        String nombreEmpleado1 = teclado.next();
        System.out.print("Introduce el DNI: ");
        String dniEmpleado1 = teclado.next();
        System.out.print("Introduce el año de ingreso: ");
        int anoIngresoEmpleado1 = teclado.nextInt();
        System.out.print("Introduce el sueldo bruto anual: ");
        double sueldoBrutoEmpleado1 = teclado.nextDouble();
        
        Empleados empleado1 = new Empleados(nombreEmpleado1, dniEmpleado1, anoIngresoEmpleado1, sueldoBrutoEmpleado1);
        
        System.out.println("INTRODUCE LOS DATOS DEL EMPLEADO 2: ");
        System.out.print("Introduce el nombre: ");
        String nombreEmpleado2 = teclado.next();
        System.out.print("Introduce el DNI: ");
        String dniEmpleado2 = teclado.next();
        System.out.print("Introduce el año de ingreso: ");
        int anoIngresoEmpleado2 = teclado.nextInt();
        System.out.print("Introduce el sueldo bruto anual: ");
        double sueldoBrutoEmpleado2 = teclado.nextDouble();
        
        Empleados empleado2 = new Empleados(nombreEmpleado2, dniEmpleado2, anoIngresoEmpleado2, sueldoBrutoEmpleado2);
        
        System.out.println("_____DATOS ORIGINALES_____");
        System.out.println(empleado1);
        System.out.println("");
        System.out.println(empleado2);
        System.out.println("");

        // Se incrementará el sueldo un 20 % al empleado que menos cobre.
        if (empleado1.getSueldoBrutoAnual() < empleado2.getSueldoBrutoAnual()) {
            empleado1.incrementarSueldo(20);
        } else {
            empleado2.incrementarSueldo(20);
        }
        
        // Se incrementará el sueldo un 10% al empleando más antiguo.
        if (empleado1.getAnoIngreso() < empleado2.getAnoIngreso()) {
            // Empleado 1 es más antiguo.
            empleado1.incrementarSueldo(10);
        } else {
            // Empleado 2 es más antiguo. 
            empleado2.incrementarSueldo(10);
        }
        
        System.out.println("_____DATOS ORIGINALES_____");
        System.out.println(empleado1);
        System.out.println("");
        System.out.println(empleado2);
        System.out.println("");
        System.out.println("El IRPF de empleado 1 es: "
            + Empleados.calcularIRPF(empleado1.getSueldoBrutoAnual()));
        System.out.println("El IRPF de empleado 2 es: "
            + Empleados.calcularIRPF(empleado2.getSueldoBrutoAnual()));
    }
}
