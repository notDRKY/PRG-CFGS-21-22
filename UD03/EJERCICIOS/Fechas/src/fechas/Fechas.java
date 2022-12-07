/*
 * 10. (Fechas) Escribir un programa que pida al usuario dos fechas (dia, mes y año), que se
 * suponen correctas, y le muestre la menor de ellas. La fecha se mostrará en formato
 * dd/mm/año. Utiliza un método mostrarFecha, para mostrar la fecha por pantalla. La fecha se
 * mostrará siempre con dos dígitos para el dia, dos para el mes y cuatro para el año.
 */
package fechas;

import java.util.Scanner;

public class Fechas {
    
    public static String mostrarFecha(int fechaUno, int fechaDos) {
        String cadena = "";
        if((fechaUno - fechaDos) > 0) {
            System.out.printf("%d2",fechaDos); 
            cadena = "ES MENOR: " + fechaDos;
        } else {
            System.out.printf("%d2",fechaUno);
            cadena = "ES MENOR: " + fechaUno;
        }
        return cadena;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fecha1;
        int fecha2;
        
        System.out.print("Introduce una fecha sin espacios [Ej. 24112021]: ");
        fecha1 = teclado.nextInt();
        System.out.print("Introduce una segunda fecha sin espacios: ");
        fecha2  = teclado.nextInt();
        
        System.out.println(mostrarFecha(fecha1, fecha2));
    }
}
