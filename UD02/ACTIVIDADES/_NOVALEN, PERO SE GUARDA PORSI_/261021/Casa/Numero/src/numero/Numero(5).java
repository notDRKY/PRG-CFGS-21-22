/*
*6. Realiza una clase número que almacene un número entero y tenga las siguientes
*características:
*Constructor por defecto que inicializa a 0 el número interno.
* Constructor que inicializa el número interno.
* Método anade que permite sumarle un número al valor interno.
* Método resta que resta un número al valor interno.
* Método getValor . Devuelve el valor interno.
* Método getDoble . Devuelve el doble del valor interno.
* Método getTriple . Devuelve el triple del valor interno.
* Método setNumero . Inicializa de nuevo el valor interno.
 */
package numero;

// CLASE NUMERO

// IMPORTAMOS LA UTILIDAD DE SCANNER

import java.util.Scanner;

public class Numero {

    // ATRIBUTOS DE LA CLASE
    private int numeroInterno;

    // CONSTRUCTORES DE LA CLASE NUMERO
    Numero() {
        this.numeroInterno = 0;
    }

    Numero(int numUsuario) {
        this.numeroInterno = numUsuario;
    }

    // METODOS DE LA CLASE NUMERO
    
    // METODO QUE INCREMENTA EL VALOR DE NUMERO INTERNO
    void anade(int numUsuario) {
        this.numeroInterno= this.numeroInterno + numUsuario;
    }

    // METODO QUE DISMINUYE EL VALOR DE NUMERO INTERNO
    void resta(int numUsuario) {
        this.numeroInterno= this.numeroInterno - numUsuario;
    }

    // METODO GET
    public int getNumeroInterno() {
        return numeroInterno;
    }

    // METODO GET DOBLE 
    public int getDobleInterno() {
        return (numeroInterno * 2);
    }

    // METODO GET TRIPLE
    public int getTripleInterno() {
        return (numeroInterno * 3);
    }
    
    // METODO SET
    public void setNumeroInterno(int numUsuario) {
        numeroInterno= (numUsuario);
    }

    // METODO MAIN DE LA CLASE NUMERO    
    public static void main(String[] args) {
        // INICIALIZACION DE VARIABLES
        String textoUsuario;
        int numUsuario;
        
        // CREACION DE OBJETOS
        Scanner teclado= new Scanner(System.in);
        Numero prueba1= new Numero();
        
        // PRUEBA 1
        System.out.println("Bienvenido, numero interno tiene el valor asignado: " + prueba1.numeroInterno);
        prueba1.setNumeroInterno(16); // SET FUERA DEL SOUT
        System.out.println("Ahora el sistema cambió el valor de numero interno a : " + prueba1.getNumeroInterno());
        System.out.println("Indica el valor que desea añadir a numero interno: ");
        numUsuario= teclado.nextInt();
        prueba1.anade(numUsuario);
        System.out.println("El valor de numero interno ahora es: " + prueba1.getNumeroInterno());
        System.out.println("Ahora indica el numero que desea restar a la cantidad de numero interno: ");
        numUsuario= teclado.nextInt();
        prueba1.resta(numUsuario);
        System.out.println("La resta da como resultado: " + prueba1.getNumeroInterno());
        System.out.println("Valor actual de numero interno: " + prueba1.getNumeroInterno());
        
        // PRUEBA 2
        System.out.println("Ahora selecciona el valor que desea que tenga numero interno: ");
        numUsuario= teclado.nextInt();
        Numero prueba2= new Numero(numUsuario);
        System.out.println("El valor de numero interno es: " + prueba2.getNumeroInterno());
        System.out.println("El doble de numero interno es: " + prueba2.getDobleInterno());
        System.out.println("El triple de numero interno es: " + prueba2.getTripleInterno());
        
    }

}
