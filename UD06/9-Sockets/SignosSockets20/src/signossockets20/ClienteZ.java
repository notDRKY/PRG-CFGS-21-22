/*
 * 20. Programar un Servidor que reciba una fecha (previamente validada por el cliente) y nos
 * diga cual es nuestro signo del zodíaco occidental y el animal que corresponde en el
 * zodíaco oriental (animales).
 */
package signossockets20;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ClienteZ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner teclado = new Scanner(System.in);
        Socket socket;
        ObjectInputStream entrada;
        ObjectOutputStream salida;
        LocalDate fecha = null;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/u");
        String fechaTexto;
        boolean fechaCorrecta = false;
        
        socket = new Socket(InetAddress.getLocalHost(), 16969);
        //socket = new Socket("10.2.1.119", 11777);
        salida = new ObjectOutputStream(socket.getOutputStream());
        
        do {
            System.out.print("Introduzca una fecha en formato dd/mm/yyyy : ");
            fechaTexto = teclado.nextLine();
            try{
                fecha = LocalDate.parse(fechaTexto, formato);
                fechaCorrecta = true;
            } catch (Exception e) {
                System.out.println("Fecha no válida, vuelva a introducirla.");
            }
        } while (!fechaCorrecta);
        
        salida.writeObject(fecha);
        
        
        entrada = new ObjectInputStream(socket.getInputStream());
        
        System.out.println("Signo del zodíaco occidental recibido es :  " 
                + (String) entrada.readObject());
        System.out.println("El animal que corresponde en el zodíaco oriental recibido es : " 
                + (String) entrada.readObject());
        socket.close();
    }
}
