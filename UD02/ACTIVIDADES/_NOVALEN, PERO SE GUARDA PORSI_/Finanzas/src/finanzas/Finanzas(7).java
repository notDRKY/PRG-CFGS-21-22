/* 4. Realiza una clase finanzas que convierta dólares a euros y viceversa. Codifica los métodos dolaresToEuros
y eurosToDolares . Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y
dólares. La clase tiene que tener:

    Un constructor finanzas() por defecto el cual establece el cambio Dólar-Euro en 1.36.

    Un constructor finanzas(double cambio) , el cual permitirá configurar el cambio Dólar-euro a una
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
    
    //METODO DE EURO A DOLAR
    double eurosToDolares(double euros) {
        euros= (euros / cambioDolarEuro);
        return euros;
    }

    // METODO MAIN
    public static void main(String[] args) {
        //CREACION OBJETOS
        Scanner teclado = new Scanner(System.in);
        Finanzas cambioReal = new Finanzas();
        
        String textoUsuario;
        double numUsuario, aux;
        
        System.out.println("Dime cuantos dolares tienes: ");
        textoUsuario= teclado.nextLine();
        numUsuario= Double.parseDouble(textoUsuario);
        cambioReal.dolaresToEuros(numUsuario);
        
        
    }

}
