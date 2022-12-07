/*
 * 2. Diseñar e implementar una clase Java TestVuelo que permita probar la clase Vuelo y
 * sus métodos. Para ello se desarrollará el método main en el que:
 * 
 *      Se cree el vuelo IB101 de Valencia a París, que sale a las 19:05 y llega a las
 *      21:00
 * 
 *      Reservar:
 *          Un asiento de ventanilla a "Miguel Fernández"
 *          Un asiento de ventanilla a "Ana Folgado"
 *          Un asiento de pasillo a "David Más"
 * 
 *      Mostrar el vuelo por pantalla
 * 
 *      Cancelar la reserva del asiento que indique el usuario.
 */
package gestorvuelos;

import gestorvuelos.Vuelo.VueloCompletoException;
import java.time.LocalTime;
import java.util.Scanner;


class TestVuelo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Vuelo pruebaVuelo = new Vuelo("IB101", "Valencia", "París", LocalTime.parse("19:05"), LocalTime.parse("21:00"));
        
        try {
            pruebaVuelo.reservarAsiento("Miguel Fernández", 'V');
            pruebaVuelo.reservarAsiento("Ana Folgado", 'V');
            pruebaVuelo.reservarAsiento("David Más", 'P');
        } catch (VueloCompletoException ex) {
            System.out.println("Vuelo completo!");
        }
        
        System.out.println(pruebaVuelo);
        
        System.out.print("Introduce el asiento que deseas cancelar: ");
        int numAsiento = teclado.nextInt();
        try {
            pruebaVuelo.cancelarReserva(numAsiento);
        } catch (Vuelo.NoExisteReservaException ex) {
            System.out.println("No existe la reserva que desea cancelar.");
        }
        
        System.out.println(pruebaVuelo);
        
    }

}
