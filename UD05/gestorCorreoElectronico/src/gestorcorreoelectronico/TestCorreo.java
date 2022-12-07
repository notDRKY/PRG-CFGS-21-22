/*
 * 2. Con la clase TestCorreo probaremos las clases y métodos desarrollados.
 *     Crea varios mensajes con los datos que introduzca el usuario y muéstralos por
 *     pantalla.
 * 
 *    Prueba el método validarEMail de la clase Mensaje con las direcciones
 *    siguientes (solo la primera es correcta):
 *         tuCorreo@gmail.com
 *         tuCorreogmail.com
 *         tuCorreo@gmail
 *         tuCorreo.com@gmail
 */
package gestorcorreoelectronico;

import java.util.Scanner;

public class TestCorreo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println(Mensaje.validarEmail("tuCorreo@gmail.com"));
        System.out.println(Mensaje.validarEmail("tuCorreogmail.com"));
        System.out.println(Mensaje.validarEmail("tuCorreo@gmail"));
        System.out.println(Mensaje.validarEmail("tuCorreo.com@gmail"));
    }
}
