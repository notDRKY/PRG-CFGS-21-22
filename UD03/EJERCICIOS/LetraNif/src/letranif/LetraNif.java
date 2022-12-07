/*
* 5. (LetraNif) Escribir un programa que lea de teclado un nif (sin guiones ni puntos). Si el nif introducido lleva
* la letra, se comprobará si ésta es correcta y se le indicará al usuario si lo es o no. Si el nif no lleva letra, se
* calculará la que le corresponde y se mostrará al usuario. Te aconsejo que dividas el problema en partes:
* tieneLetra(), extraerUltimoChar(), extraeNumero(), validarLetra(), calcularLetra()...
*/
package letranif;
import java.util.Scanner;

public class LetraNif {
    
    public static boolean tieneLetra(String dni) {
        if (extraerUltimoChar(dni) == '8') {
            return true;
        } else {
            return false;
        }
    }
    
    public static char extraerUltimoChar(String dni) {
        char aux = dni.charAt(8);
        return aux;
    }
    
    public static int extraeNumero(String dni) {
        
        String aux = dni.substring(8);
        int numerosDni = Integer.valueOf(aux);
        
        return numerosDni;
    }
    
    public static String validarLetra(String dni) {
        
    }
    
    public static char calcularLetra(String dni) {
        // to do
        
        String posiblesCombinaciones, aux;
        int calculo, numerosDni;
        char letra;
        
        
        
        posiblesCombinaciones = "TRWAGMYFPDXBNJZSQVHLCKE";
        calculo = numerosDni % 23;
        letra = posiblesCombinaciones.charAt(calculo);
        
        return letra;
    }
    
    // METODO MAIN DE LA CLASE 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String dniUsuario;
        
        System.out.print("Introduzca su DNI: ");
        dniUsuario = teclado.nextLine();
        
        
    }
    
}
