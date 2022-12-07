/* 4. Realiza una clase finanzas que convierta dólares a euros y viceversa. Codifica los métodos dolaresToEuros
y eurosToDolares . Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y
dolares. La clase tiene que tener:

    Un constructor finanzas() por defecto el cual establece el cambio Dolar-Euro en 1.36.

    Un constructor finanzas(double cambio) , el cual permitira configurar el cambio Dolar-euro a una
    cantidad personalizada. */

package finanzas;

// IMPORTAMOS LIBRERIA DE JAVA (PARA LEER EL TECLADO)
import java.util.Scanner;

// CLASE FINANZAS
public class Finanzas {

    private double cambioDolarEuro;

    // CONTRUCTOR POR DEFECTO
    Finanzas() {
        cambioDolarEuro = 1.36;
    }

    // CONTRUCTOR 2
    Finanzas(double cambio) {
        cambioDolarEuro = cambio;
    }

    // METODOS DE LA CLASE FINANZAS
    // METODO DE DOLAR A EURO
    double dolaresToEuros(double dolares) {
        dolares= (dolares * cambioDolarEuro);
        return dolares;
    }
    
    // METODO DE EURO A DOLAR
    double eurosToDolares(double euros) {
        euros= (euros / cambioDolarEuro);
        return euros;
    }

    // METODO MAIN
    public static void main(String[] args) {
        
        // CREACION OBJETOS
        Scanner teclado = new Scanner(System.in);
        Finanzas cambioReal = new Finanzas();
        
        
        // DECLARACION DE VARIABLES
        String textoUsuario;
        double numUsuario;
        
        // CAMBIO DE DOLARES A EUROS (NORMAL)
        System.out.println("Dime cuantos dolares tienes: ");
        textoUsuario= teclado.nextLine();
        numUsuario= Double.parseDouble(textoUsuario);
        System.out.println("Tienes " + cambioReal.dolaresToEuros(numUsuario) + " euros.");
        
        // CAMBIO DE EUROS A DOLARES (NORMAL)
        System.out.println("Dime cuantos euros tienes: ");
        textoUsuario= teclado.nextLine();
        numUsuario= Double.parseDouble(textoUsuario);
        System.out.println("Tienes " + cambioReal.dolaresToEuros(numUsuario));
        
        // ACTUALIZAR EL VALOR DE DOLAR RESPECTO AL EURO
        System.out.println("Vamos a romper EE.UU, dime que valor quieres que tenga el dolar respecto al euro: ");
        textoUsuario= teclado.nextLine();
        numUsuario= Double.parseDouble(textoUsuario);
        
        // CREACION DE OBJETO
        Finanzas cambioVenezuela = new Finanzas(numUsuario);
        
        // CAMBIO DE DOLARES A EUROS (VENEZUELA MODE)
        System.out.println("Dime cuantos dolares tienes: ");
        textoUsuario= teclado.nextLine();
        numUsuario= Double.parseDouble(textoUsuario);
        System.out.println("Tienes " + cambioVenezuela.dolaresToEuros(numUsuario) + " euros en Venezuela 2.");
                
        // CAMBIO DE EUROS A DOLARES (VENEZUELA MODE)
        System.out.println("Dime cuantos euros tienes: ");
        textoUsuario= teclado.nextLine();
        numUsuario= Double.parseDouble(textoUsuario);
        System.out.println("Tienes " + cambioVenezuela.eurosToDolares(numUsuario) + " dolares en Venezuela 2.");
        
    }

}
