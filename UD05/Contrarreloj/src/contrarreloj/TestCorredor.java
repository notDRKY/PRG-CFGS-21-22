/*
 * 2. Diseñar una clase Java TestCorredor que permita probar la clase Corredor y sus
 * métodos. Para ello se desarrollará el método main en el que:
 * 
 * Se crearán dos corredores: El nombre lo indicará el usuario mientras que el
 * dorsal se generará utilizando el método generarDorsal() de la clase.
 * 
 * Se establecerá el tiempo de llegada del primer corredor a 300 segundos y el del
 * segundo a 400.
 * 
 * Se mostrarán los datos de ambos corredores ( toString )
 */
package contrarreloj;

import java.util.Scanner;

public class TestCorredor {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String usrNombre = "";
        
        System.out.println("SE CREARÁN DOS CORREDORES");
        System.out.print("Inserte el nombre del primer corredor: ");
        usrNombre = teclado.nextLine();
        Corredor corredor1 = new Corredor(Corredor.generarDorsal(), usrNombre);
        
        System.out.print("Inserte el nombre del segundo corredor: ");
        usrNombre = teclado.nextLine();
        Corredor corredor2 = new Corredor(Corredor.generarDorsal(), usrNombre);
        
        corredor1.setTiempo(300);
        corredor2.setTiempo(400);
        
        System.out.println(corredor1);
        System.out.println(corredor2);
    }
}
