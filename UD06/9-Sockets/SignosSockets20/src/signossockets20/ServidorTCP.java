/*
 * 20. Programar un Servidor que reciba una fecha (previamente validada por el cliente) y nos
 * diga cual es nuestro signo del zodíaco occidental y el animal que corresponde en el
 * zodíaco oriental (animales).
 * 
 * Aries        21/03 - 20/04
 * Tauro        21/04 - 20/05
 * Géminis      21/05 - 21/06
 * Cáncer       22/06 - 22/07
 * Leo          23/07 - 23/08
 * Virgo        24/08 - 22/09
 * Libra        23/09 - 22/10
 * Escorpio     23/10 - 22/11
 * Sagitario    23/11 - 21/12
 * Capricornio  22/12 - 20/01
 * Acuario      21/01 - 19/02
 * Piscis       20/02 - 20/03
 */
package signossockets20;
    
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;

public class ServidorTCP {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int mesZ;
        int diaZ;
        int anoC;
        LocalDate fechaCliente;
        String signoZ;
        String animalZ;
        
        ServerSocket serverSocket;
        Socket clienteSocket;
        
        ObjectInputStream entrada;
        ObjectOutputStream salida;
        
        serverSocket = new ServerSocket(16969);
        
        System.out.println("Server iniciando y escuchando en el puerto 16969... ");
        
        while(true) {
            clienteSocket = serverSocket.accept();
            entrada = new ObjectInputStream(clienteSocket.getInputStream());
            fechaCliente = (LocalDate) entrada.readObject();
            
            System.out.println("La fecha recibida es: " + fechaCliente);
            
            salida = new ObjectOutputStream(clienteSocket.getOutputStream());
            
            mesZ = fechaCliente.getMonthValue();
            diaZ = fechaCliente.getDayOfMonth();
            
            switch (mesZ) {
                case 1: //Enero
                    if (diaZ >= 21) {
                        signoZ = "Acuario";
                    } else { //Hasta el 21 de Enero sería capricornio
                        signoZ = "Capricornio";
                    }
                    break;
                case 2: //Febrero
                    if (diaZ >= 20) {
                        signoZ = "Piscis";
                    } else { //Hasta el 20 de Febrero sería Acuario
                        signoZ = "Acuario";
                    }
                    break;
                case 3: //Marzo
                    if (diaZ >= 21) {
                        signoZ = "Aries";
                    } else {
                        signoZ = "Piscis";
                    }
                    break;
                case 4: //Abril
                    if (diaZ >= 21) {
                        signoZ = "Tauro";
                    } else {
                        signoZ = "Aries";
                    }
                    break;
                case 5: //Mayo
                    if (diaZ >= 21) {
                        signoZ = "Géminis";
                    } else {
                        signoZ = "Tauro";
                    }
                    break;
                case 6: //Junio
                    if (diaZ >= 22) {
                        signoZ = "Cáncer";
                    } else {
                        signoZ = "Géminis";
                    }
                    break;
                case 7: //Julio
                    if (diaZ >= 22) {
                        signoZ = "Leo";
                    } else {
                        signoZ = "Cáncer";
                    }
                    break;
                case 8: //Agosto
                    if (diaZ >= 24) {
                        signoZ= "Virgo";
                    } else {
                        signoZ = "Leo";
                    }
                    break;
                case 9: //Septiembre
                    if (diaZ >= 24) {
                        signoZ = "Libra";
                    } else {
                        signoZ = "Virgo";
                    }
                    break;
                case 10: //Octubre
                    if (diaZ >= 23) {
                        signoZ = "Escorpio";
                    } else {
                        signoZ = "Libra";
                    }
                    break;
                case 11: //Noviembre
                    if (diaZ >= 23) {
                        signoZ = "Sagitario";
                    } else {
                        signoZ = "Escorpio";
                    }
                    break;
                case 12: //Diciembre 
                    if (diaZ >= 22) {
                        signoZ = "Capricornio";
                    } else {
                        signoZ = "Sagitario";
                    }
                    break;
                default:
                    signoZ = "Desconocido";
                    break;
            }
            
            System.out.println("El server devuelve el signo: " + signoZ);
            salida.writeObject(signoZ);
            
            anoC = fechaCliente.getYear();
            
            String[] animalesChinos = {"Mono", "Gallo", "Perro", "Cerdo", "Rata",
                "Buey", "Tigre", "Conejo", "Dragón", "Serpiente", "Caballo", "Cabra"};
            
            animalZ = animalesChinos[anoC % 12];
            
            System.out.println("El server devuelve el signo: " + animalZ);
            salida.writeObject(animalZ);
            
            clienteSocket.close();
            System.out.println("Server esperando una nueva conexión...");
        }
    }
}
