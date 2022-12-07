package temperatura;

// IMPORTAMOS LIBRERÍA DE JAVA (PARA LEER EL TECLAD0)
import java.util.Scanner;

//CLASE PRINCIPAL DEL PROGRAMA
public class Temperatura {

    // MÉTODO DE LA CLASE [CONVIERTE C EN F]
    static double celsiusToFarenheit (double c) {
        double f= ((1.8 * c) + 32);
        
        return f;
    }
    
    // MÉTODO DE LA CLASE [CONVIERTE F EN C]
    static double farenheitToCelsius (double f) {
        double c= ((f - 32) / 1.8);
        
        return c;
    }
    
    // MÉTODO MAIN
    public static void main(String[] args) {
        // INICIALIZACIÓN DE VARIABLES Y TECLADO:
        String textoTeclado;
        int numUsuario;
        Scanner teclado = new Scanner(System.in);
        
        // CELSIUS
        System.out.println("Introduce un numero de grados Celsius: ");
        textoTeclado= teclado.nextLine();
        numUsuario= Integer.parseInt(textoTeclado);
        System.out.println(numUsuario + " Celsius son " + celsiusToFarenheit(numUsuario) + " Farenheit.");
        
        // FARENHEIT
        System.out.println("Introduce un numero de grados Farenheit: ");
        textoTeclado= teclado.nextLine();
        numUsuario= Integer.parseInt(textoTeclado);
        System.out.println(numUsuario + " Farenheit son " + farenheitToCelsius(numUsuario) + " Celsius. ");
        
    }
    
}
