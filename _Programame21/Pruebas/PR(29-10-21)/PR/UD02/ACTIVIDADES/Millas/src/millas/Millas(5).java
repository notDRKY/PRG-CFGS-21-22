/*
* 8. Crea una clase con un método millasAMetros() que toma como parámetro de entrada un
* valor en millas marinas y las convierte a metros. Una vez tengas este método escribe otro
* millasAKilometros() que realice la misma conversión, pero esta vez exprese el resultado en
* kilómetros. Nota: 1 milla marina equivale a 1852 metros.
*/
package millas;

// IMPORTAMOS LA UTILIDAD JAVA SCANNER
import java.util.Scanner;

// CLASE MILLAS
public class Millas {
    
    // METODO ESTATICO DE LA CLASE MILLAS (MILLAS A METROS)
    static double millasAMetros(double millasMarinas){
        return (millasMarinas * 1852);
    }
    
    // METODO ESTATICO DE LA CLASE MILLAS (MILLAS A KILOMETROS)
    static double millasAKilometros(double millasMarinas){
        return ((millasMarinas * 1852) / 1000);
    }
    
    // METODO MAIN
    public static void main(String[] args) {
        
        // INICIALIZACION DE VARIABLES Y CRECION DE OBJETO
        Scanner teclado= new Scanner(System.in);
        double numUsuario;
        
        // MILLAS A METROS:
        System.out.print("Introduce el numero de millas marinas: ");
        numUsuario=teclado.nextDouble();
        System.out.println("Tines " + millasAMetros(numUsuario) + " metros.");
        
        // MILLAS A KILOMETROS:
        System.out.println("Introduce el numero de metros: ");
        numUsuario= teclado.nextDouble();
        System.out.println("Tienes + " + millasAKilometros(numUsuario) + " kilometros.");
                
    }
    
}
