/*
 */
package UD05._1.gestionEmpleados;

public class TestEmpresas {

    public static void main(String[] args) {
        Empresas empresa1 = new Empresas("CataDaw");
        Empleados empleado1 = new Empleados("David", "24242424B", 1990, 25000);
        Empleados empleado2 = new Empleados("Pepe", "24248080B", 2019, 25000);
        Empleados empleado3 = new Empleados("Garfield", "24223454B", 2002, 25000);
        Empleados empleado4 = new Empleados("Paco", "24124664B", 2020, 25000);

        try {
            empresa1.contratar(empleado1);
        } catch (Empresas.PlantillaCompletaException ex) {
            System.out.println("ERROR. No se ha podido contratar al empleado.");
        }

        try {
            empresa1.contratar(empleado2);
        } catch (Empresas.PlantillaCompletaException ex) {
            System.out.println("ERROR. No se ha podido contratar al empleado.");
        }

        try {
            empresa1.contratar(empleado3);
        } catch (Empresas.PlantillaCompletaException ex) {
            System.out.println("ERROR. No se ha podido contratar al empleado.");
        }

        try {
            empresa1.contratar(empleado4);
        } catch (Empresas.PlantillaCompletaException ex) {
            System.out.println("ERROR. No se ha podido contratar al empleado.");
        }
        
        System.out.println(empresa1);
        
        empresa1.subirTrienio(10);
        
        System.out.println(empresa1);
        
        try {
            empresa1.despedir(empleado1);
        } catch (Empresas.ElementoNoEncontradoException ex) {
            System.out.println("ERROR. No se ha podido contratar al empleado.");
        }
        
        System.out.println(empresa1);
    }
}
