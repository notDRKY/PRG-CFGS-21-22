package rebajas;

// IMPORTAMOS LIBRERIA DE JAVA (PARA LEER EL TECLADO)
import java.util.Scanner;

// CLASE REBAJAS
public class Rebajas {

    // METODO QUE CALCULA EL PORCENTAKE SOBRE EL PRECIO ORIGINAL
    static double descubrePorcentaje(double precio, double precioConRebaja) {
        double porcentajeDescuento= ((precio - precioConRebaja) / precio);
        return porcentajeDescuento;
    }

    // METODO MAIN
    public static void main(String[] args) {
        
        // CREACION DE OBJETO
        Scanner teclado= new Scanner(System.in);
        
        // DECLARACION DE VARIABLES
        String textoUsuario;
        double numUsuario, numUsuarioDos;
        
        // EL USUARIO INTRODUCE LOS NUMEROS PARA EL CALCULO
        System.out.println("INTRODUCE EL PRECIO ORIGINAL: ");
        textoUsuario= teclado.nextLine();
        numUsuario= Double.parseDouble(textoUsuario);
        
        System.out.println("INTRODUCE EL PRECIO CON REBAJA: ");
        textoUsuario= teclado.nextLine();
        numUsuarioDos= Double.parseDouble(textoUsuario);
        
        // UTILIZACION DEL METODO, AJUSTE CON EL PORCENTAJE + MOSTRAR POR PANTALLA
        System.out.println("EL PORCENTAJE DE LA REBAJA ES: " + descubrePorcentaje(numUsuario, numUsuarioDos) * 100 + "%.");
    }
    
}
